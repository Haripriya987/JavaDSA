import java.util.*;
public class DoubleLinkedList {
    public static void main(String[] args){
        DLList list=new DLList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.printNodes();
//        list.kElement(3);
//        list.reverseKElement2(2);
//        list.reverseKElement(2);
      // list.nextNextNode(30);

        System.out.println(list.prevPrevNode(30));
        System.out.println(list.nextNextNode(30));

        System.out.println(list.size());

    }
}
class DLList{
    Node head;
    Node tail;
    int count;
    private class Node{
        Node prev;
        Node next;
        int data;
        Node(int value){
            this.data=value;

        }
    }
    void addFirst(int value){

        var node=new Node(value);
        if(head==null)
            head=tail=node;
        else {
            head.prev = node;
            node.next = head;
            head = node;
        }
        count++;

    }
    void addLast(int value){
        var node=new Node(value);
        if(head==null)
            head=tail=node;
        else {
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
            count++;
    }
    int size(){
     return count;
    }
    void removeFirst(){
        if(head==null)
            throw new IllegalStateException("List is empty");
        if(head==tail)
            head=tail=null;
        else{
            var current=head;
            head=current.next;
            current.next=null;
            head.prev=null;
        }
        count--;
    }
    void removeLast(){
        if(head==null)
            throw new IllegalStateException("List is empty");
        if(head==tail)
            head=tail=null;
        else{
            var current=tail;
            tail=current.prev;
            current.prev=null;
            tail.next=null;
        }
        count--;

    }
    void printNodes(){
        var current=head;
        while(current!=null){
            System.out.print(current.data+" ");

            current=current.next;
        }
            System.out.println();
    }
    void printReverse(){
        var current=tail;
        while(current!=null){
            System.out.print(current.data+ " ");

            current=current.prev;
        }
       System.out.println();
    }

    void addAt(int index,int value){
        if(index==0) {
            addFirst(value);
            return;
        }
        if(index==size()) {
            addLast(value);
            return;
        }
        if(index>size())
            throw new IllegalStateException("Change the value of Index");

        int start=0;
        Node node=new Node(value);
        Node current=head;
        Node previous=null;
        while(start<index){
            previous=current;
            current=current.next;
            start++;
        }
        previous.next=node;
        current.prev=node;
        node.prev=previous;
        node.next=current;

        count++;

    }
    void removeAt(int index){
        if(index==0) {
            removeFirst();
            return;
        }
        if(index==size()-1) {
            removeLast();
            return;
        }

        if(index>size())
            throw new IllegalStateException("Change the value of Index");
        Node current=head;
        Node nextOne=head.next;
        Node previous=null;
        int start=0;

        while(start<index && (current!=null || current.next!=null)){
            previous=current;
            current=current.next;
            nextOne=nextOne.next;
            start++;
        }

        previous.next=current.next;
        nextOne.prev=current.prev;
        current.prev= current.next=null;

        count--;
    }
    void reverse() {
        if(head==null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = null;
        Node current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            tail = head;
            head = temp.prev;
        }
    }
    void printMiddle(){
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        int s=size();
        int x=s/2;
        int y=x-1;
        if(s==0 )
            throw new IllegalStateException();
        if(s==1)
            System.out.println(head.data);
        if(s%2!=0){
            var curr=head;
            int index=0;
            while(curr!=null && index<=x){
                if(index==x){
                    System.out.println(curr.data);
                }
                index++;
                curr=curr.next;
            }
        }
        else{
            var curr=head;
            int index=0;
            var nextOne=head.next;
            while(nextOne!=null && index<=x){
                if(index==y){
                    System.out.println(curr.data +" "+nextOne.data);
                }
                index++;
                curr=curr.next;
                nextOne=nextOne.next;
            }
        }
    }
    void kElement(int k){
        int s=k;
        if( k>0){
            var curr=head;
            int index=0;
            while(curr!=null && index<=k){
                if(index==k){
                    System.out.println(curr.data);
                }
                index++;
                curr=curr.next;
            }
        }
    }

    void binToDec(){
        var current=head;
        int result=0;
        while(current!=null){
            result=result*2+current.data;

            current=current.next;
        }
        System.out.println(result);

    }
    void binToDec2(){
        int s=size();
        var current=head;
        int result=0;
        while(current!=null){
            result += current.data * Math.pow(2, s - 1);

            s--;
            current=current.next;
        }
        System.out.println(result);

    }
    boolean contains(int value){
        var current=head;
        while(current!=null) {
            if (current.data == value)
                return true;
            current = current.next;
        }
            return false;
    }


    int nextNextNode(int value){
        if(tail.data==value)
            throw new IllegalStateException("No element is there after this value");
        if(contains(value)){
            var slow=head;
            var fast=head;
            while(fast!=null || fast.next!=null){
                if(slow.data==value) {
                    return fast.data;
                }

                slow=slow.next;
                fast=fast.next.next;
            }

        }
        return -1;
    }
    int prevPrevNode(int value){
//        reverse();
//        System.out.println(this.nextNextNode(value));

        if(head.data==value)
            throw new IllegalStateException("No element is there before this value");
        if(contains(value)){
            var slow=head.next;
            var fast=head;
            while(fast!=null || fast.next!=null ){
                if(slow.data==value)
                    return slow.prev.prev.data;

                slow=slow.next;
                fast=fast.next.next;
            }

        }
        return -1;

       // return;
    }
    int lastIndexOf(int value){
        if(contains(value)){
            var current=tail;
            int start=size();
                while(current!=null){
                    if(current.data==value)
                        return start;

                    start--;
                    current=current.prev;
                }
        }

        return -1;
    }
    void addManyAtFirst(int[] items){
        for(int x:items)
            this.addFirst(x);
    }
    void addManyAtLast(int[] items){
        for(int x:items)
            this.addLast(x);
    }
    void printMiddle2(){
        if(head==null)
            throw new IllegalStateException("No element is present in linked list");
        if(head==tail) {
            System.out.println(head.data);
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=tail && fast.next!=tail){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.print(slow.data + " ");
        if(fast.next==tail)
            System.out.println(slow.next.data);


    }
    void reverseKElement(int k){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<=k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;

        }
        System.out.println(slow.data);
    }
    void reverseKElement2(int k){
        Node slow=head;
        Node fast=tail;
        for(int i=0;i<k;i++){
            slow=slow.next;
            fast=fast.prev;

        }
        System.out.println(fast.data);
    }
    static DLList createLoop(){
        DLList li=new DLList();
        li.addLast(10);
        li.addLast(20);

        li.addLast(50);
        li.addLast(60);
        var temp=li.head.next;
        li.tail.next=temp;

        return li;


    }
    boolean containsLoop(){
        var current=head;
        Set<Node>  set=new HashSet<>();
        while(current!=null){
            if(set.contains(current))
                return  true;

            set.add(current);
            current=current.next;
        }
        return false;
    }
}