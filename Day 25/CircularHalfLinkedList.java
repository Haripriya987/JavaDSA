public class CircularHalfLinkedList {
public static void main(String args[]){
    CLList cl=new CLList();
    //cl.addFirst(32);
    cl.addLast(21);
    cl.addLast(22);
    cl.addLast(23);
    cl.addLast(24);
    cl.print(cl.head);
    cl.twoHalfCircularLL(cl.head);
}
}
class CLList{
    Node head;
    int size=0;
    class Node{
        Node next;
        int data;
        Node(){}
        Node(int value){
            this.data=value;
        }

    }
    void addFirst(int value){
        Node node=new Node(value);
        size++;
        if(head==null){
            head=node;
            node.next=head;
            return;
        }
        var temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }

        node.next=head;
        head=node;
        temp.next=head;

    }
    void addLast(int value){
        Node node=new Node(value);
        size++;
        if(head==null){
            head=node;
            node.next=head;
            return;
        }
        var temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }

        temp.next=node;
        node.next=head;
    }
    void removeFirst(){
        if(head==null){
            throw new IllegalStateException();
        }
        size--;
        if(head.next==head){
            head=null;
        }
        var temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }

        head=head.next;
        temp.next=head;
    }
    void removeLast(){
        if(head==null){
            throw new IllegalStateException();
        }
        size--;
        if(head.next==head){
            head=null;
        }
        var temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;

    }
    void print(Node headDemo){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        var temp=headDemo;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=headDemo);
        System.out.println();

    }
    int size(){
       return size;
    }
    void twoHalfCircularLL(Node head1){
        if(head1==null){
            System.out.println("List is Empty");
            return;
        }
        if(head1.next==head1){
            print(head1);
            return;
        }
        Node slow=head1;
        Node fast=head1;
        while(fast.next!=head1 && fast.next.next!=head1){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2=slow.next;
        slow.next=head1;
        if(fast.next!=head1){
            fast.next.next=head2;
        }
        else{
            fast.next=head2;
        }

      print(head1);
      print(head2);
      //return head2;
    }


}