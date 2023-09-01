public class CircularLinkedList {
    public static void main(String args[]){
        CLL clist=new CLL();
        clist.addFirst(10);
        clist.addLast(20);
        clist.addLast(30);
        clist.addLast(40);
        clist.addLast(50);

        clist.printNodes();
        clist.removeFirst();
        clist.removeLast();
        clist.printNodes();
        clist.addFirstOptimize(10);
        clist.addLastOptimize(50);
        clist.printNodes();
        clist.removeFirstOptimize();
        clist.printNodes();

    }
}
class CLL{
    Node head;
    private class Node{
        Node next;
        int data;
        Node (int value){
            this.data=value;
        }
    }
    void  addFirst(int value){
        var node=new Node(value);
        if(head==null) {
            head = node;
            node.next = head;
        }
        else{
            var current=head;

            while(current.next!=head)
                 current=current.next;

            node.next=head;
            head=node;
            current.next=head;
        }

    }
    void addLast(int value){
        var node=new Node(value);
        if(head==null) {
            head = node;
            node.next = head;
        }
        else {
            var current = head;

            while (current.next != head)
                current = current.next;

            current.next=node;
            node.next=head;
        }
    }
    void printNodes(){
        if(head==null)
            return;

        var current = head;

        do {
            System.out.print(current.data+ " ");
            current = current.next;
        } while (current!= head);
        System.out.println();
    }
    void removeFirst(){
        if(head==null)
            throw new IllegalStateException("List is empty");

        if (head.next == head) {

            head = null;
        } else {
            var current = head;

            while (current.next != head)
                current = current.next;

            var temp = head.next;
            head.next = null;
            head = temp;
            current.next = head;

        }

    }
    void removeLast() {
        if (head == null)
            throw new IllegalStateException("List is empty");
        if (head.next == head) {
            head = null;
        } else {
            var current = head;
            Node prev=null;

            while (current.next != head) {
                prev=current;
                current = current.next;
            }
             prev.next = head;
        }
    }
    void addFirstOptimize(int value){
        var node=new Node(value);
        if(head==null) {
            head = node;
            node.next = head;
        }

        int temp=head.data;
        head.data=node.data;
        node.data=temp;

        node.next=head.next;
        head.next=node;
    }
    void addLastOptimize(int value){
        var node=new Node(value);

        if(head==null) {
            head = node;
            node.next = head;
        }

        int temp=head.data;
        head.data=node.data;
        node.data=temp;

        node.next=head.next;
        head.next=node;
        head=node;


    }
    void removeFirstOptimize(){
        if (head == null)
            throw new IllegalStateException("List is empty");
        if (head.next == head) {
            head = null;
        }
        else {
            int temp=head.data;
            head.data=head.next.data;
            head.next.data=temp;

            var curr=head.next.next;
            head.next.next=null;
            head.next=curr;
        }
    }
}