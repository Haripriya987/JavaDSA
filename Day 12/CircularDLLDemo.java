
public class CircularDLLDemo {
    public static void main(String[] args){
        CDLL list=new CDLL();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(5);

        list.printNodes();
        list.printReverse();

    }
}
class CDLL{
    Node head;
    int count=0;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int value){
            this.data=value;
        }
    }
    void addFirst(int data){
        var node=new Node(data);
        if(head==null){
            head=node;
            node.next=node.prev=head;
        }
        var current=head;
        while(current.next!=head)
            current=current.next;


        node.next=head;
        head.prev=node;
        head=node;
        current.next=head;
    }
    void addLast(int data){
        var node=new Node(data);
        if(head==null){
            head=node;
            node.next=node.prev=head;
        }
        var current=head;
        while(current.next!=head)
            current=current.next;

        current.next=node;
        node.prev=current;
        node.next=head;

    }
    void printNodes(){
        if(head==null)
            return;

        var current=head;
        do {
            System.out.print(current.data+" ");
            current = current.next;
        }while(current!=head);
        System.out.println();

    }
    void removeFirst(){
        if(head==null)
            throw new IllegalStateException("List is Empty");
        if(head.next==head) {
            head = null;
            return;
        }

        var current=head;
        while(current.next!=head){
            current=current.next;
        }

        var temp=head;
        head=temp.next;
        head.prev=temp.next=null;
        current.next=head;


    }
    void removeLast(){
        if(head==null)
            throw new IllegalStateException("List is Empty");
        if(head.next==head) {
            head = null;
            return;
        }

        var current=head;
        Node previous=null;
        while(current.next!=head){
            previous=current;
            current=current.next;
        }
        previous.next=head;
        current.prev=current.next=null;

    }
    void printReverse(){
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        var current=head;
        while(current.next!=head)
            current=current.next;

         do{
            System.out.print(current.data + " ");
            current = current.prev;
        }while(current!=null);

    }
}