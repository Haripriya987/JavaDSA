import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
       ll.addLast(31);
       ll.addLast(12);
       ll.addFirst(78);
       ll.addFirst(98);
      // ll.print();
       //ll.returnLastNNodes(2);
      // ll.removeDuplicates();
       ll.print(ll.head);
      // ll.printNodeAdress(ll.head);
        LinkedList ll2=new LinkedList();
        ll2.addLast(31);
        ll2.addLast(12);
        ll2.addFirst(780);
        ll2.print(ll2.head);
      //  ll2.printNodeAdress(ll2.head);
        ll2.intersectionNode(ll.head,ll2.head);
        ll2.intersectionNodeAnotherWay(ll.head,ll2.head);

    }
}
class LinkedList{
    Node head;
    int size;
    class Node{
        int data;
        Node next;
        Node(){

        }
        Node(int value){
            this.data=value;
        }
    }
    void addFirst(int value){
        Node node=new Node(value);
        size++;
        if(head==null){
          head=node;
        }
        else{
           node.next=head;
           head=node;
        }
    }
    void addLast(int value){
        Node node=new Node(value);
        size++;
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    void removeFirst(){
        if(head==null){
            throw new IllegalStateException("List is Empty");
        }

        else if(head.next==null) {
            head = null;
        }
        else {
            head = head.next;
        }

       size--;
    }
    void removeLast(){
        if(head==null){
            throw new IllegalStateException("List is Empty");
        }
        else if(head.next==null) {
            head = null;
        }
        else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
         temp.next=null;
        }
        size--;
    }
    int sizeLL(){
        return size;
    }
    void print(Node h){
        Node temp=h;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void printNodeAdress(Node h){
        Node temp=h;
        while(temp!=null) {
            System.out.print(temp+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    //returning Last N node values from the Linked List

    void returnLastNNodes(int n){
        if(size<n){
            throw new IllegalStateException("That many elements are not found in the list");
        }

        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        Node slow=head;
        Node prev=null;
        while(fast!=null){
           prev=slow;
            slow=slow.next;
            fast=fast.next;

        }
        while(slow!=null){
            System.out.print(slow.data+" ");
            slow=slow.next;
        }
        System.out.println();
        //If we do his we can remove this last n nodes also
//        if(prev!=null) {
//            prev.next = null;
//        }
//        head=null;

    }
    //Removing Duplicates from the linked List by using Extra space
    void removeDuplicates(){
        if(head==null || head.next==null){
            return;
        }
        HashSet<Integer> hs=new HashSet<>();
        hs.add(head.data);
        Node temp=head;
        Node current=head.next;
        while(current!=null){
            if(!hs.contains(current.data)) {
                hs.add(current.data);
                temp=temp.next;
                current=current.next;
            }
            else{
               var duplicate=current.next;
               current.next=null;
               temp.next=current=duplicate;

            }
        }

    }
    //Finding the  intersection node of two LinkedLists
    void intersectionNode(Node head1,Node head2){
        Node l1=head1;
        Node l2=head2;
        HashSet<Object>  hs=new HashSet<>();
        while(l1!=null){
            hs.add(l1.data);
            l1=l1.next;
        }
        while(l2!=null){
            if(hs.contains(l2.data)){
                System.out.println(l2.data);
                break;
            }
                hs.add(l2.data);
                l2=l2.next;

        }
    }
    //Find the intersection Node of two linked list using another approach
    void intersectionNodeAnotherWay(Node head1,Node head2) {
        Node l1 = head1;

        while(l1!=null){
            Node l2 = head2;
            while(l2!=null){
                if(l1.data==l2.data){
                    System.out.println(l2.data+" ");
                    return;
                }
                l2=l2.next;
            }
            l1=l1.next;
        }

    }
}