import java.util.*;
public class LinkedListDemo {
    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.addLast(34);
        list.addFirst(123);
        list.addFirst(341);
        list.addLast(23);
        System.out.println(list.valueOf(4));
        System.out.println(list.size());
        list.printNodes();
        System.out.println(list.nextNode(341));
        System.out.println(list.prevNode(23));
        //list.removeFirst();

        list.middleElement();
        list.kElement(1);
        list.reverseKElement(2);
        list.reverse();
        list.printNodes();

    }
}
class LinkedList{
    Node head;
    Node tail;
    int count;
    private class Node{
        int data;
        Node address;
        Node(int data){
            this.data=data;

        }

    }

    void addLast(int value){
        var node=new Node(value);

        if(head==null){
            head=tail=node;
        }
        else {
            tail.address=node;
            tail=node;

        }
        count++;
    }

    void addFirst(int value){
        var node=new Node(value);

        if(head==null){
            head=tail=node;

        }
        else{
            node.address=head;
            head=node;

        }
        count++;
    }
    int size(){
        return count;
    }
    void removeFirst(){
        if(head==null)
            throw new IllegalStateException();
        if(head==tail){
            head=tail=null;
            count--;
        }
        else{
          var temp=head.address;
          head.address=null;
          head=temp;
          count--;
        }

    }
    void removeLast(){
        if(head==null)
            throw new IllegalStateException();
        if(head==tail){
            head=tail=null;
            count--;
        }
        else{
            var curr=head;
            while(curr.address!=null)
                curr=curr.address;

            curr.address=null;
            tail=curr;
            count--;
        }

    }
    boolean isEmpty(){
        if(head==null)
            return true;
       return false;
    }
    boolean contains(int value){
        if(isEmpty())
            throw new IllegalStateException();
        var curr=head;
        int index=0;
        while(curr!=null){
            if(curr.data==value)
                return true;
            index++;
            curr=curr.address;

        }
        return false;
    }
    int valueOf(int index){
        int no=1;
        if(index<=count) {
            var newNode=head;
            while (no <= index) {
                if(no==index)
                    return newNode.data;
                newNode=newNode.address;
                no++;
            }
        }
        return -1;
    }
    void printNodes(){
        var curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.address;
        }
        System.out.println();
    }
    int nextNode(int value){
        if(contains(value)){

           var curr=head;
           var next=curr.address;
           if(next.data==value)
               return -1;
           while(next!=null){
               if(curr.data==value)
                   return next.data;
               next=next.address;
               curr=curr.address;
           }
        }
        return -1;
    }
    int prevNode(int value){
        if(contains(value)){
            var curr=head;
            var next=curr.address;
            if(curr.data==value)
                return -1;
            while(curr!=null){
                if(next.data==value)
                    return curr.data;
                next=next.address;
                curr=curr.address;
            }

        }
        return -1;
    }
void middleElement(){
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
               curr=curr.address;
          }
        }
        else{
            var curr=head;
            int index=0;
            var next=head.address;
            while(next!=null && index<=x){
                if(index==y){
                    System.out.println(curr.data +" "+next.data);
                }
                index++;
                curr=curr.address;
                next=next.address;
            }
        }

}
void kElement(int k){
        int s=size();
        if(k<=s && k>0){
            var curr=head;
            int index=1;
            while(curr!=null && index<=k){
                if(index==k){
                    System.out.println(curr.data);
                }
                index++;
                curr=curr.address;
            }
        }
}
void reverse(){
        if(head==null)
            System.out.println("List is empty");

        var current=head.address;
        var  previous=head;
        while(current!=null){
         var next=current.address;
            current.address=previous;
            previous=current;

            current=next;
        }
        tail=head;
        tail.address=null;
        head=previous;
}
void reverseKElement(int value){
        int reverse=size()-value+1;
        if(value>size() || value<0)
            System.out.println("Not possible");
        else {
            System.out.print("" );
            kElement(reverse);
        }
}
}