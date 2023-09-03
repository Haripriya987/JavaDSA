public class LinkedListAssignment2{
    public static void main(String[] args){
        SLList list=new SLList();
        list.addLast(10);
        list.addLast(20);
        Node current=list.head;
        list.printR(current);
        System.out.println();
        list.addLastR(current,30);
        list.addNodeAtRightPlace(45);
        list.addNodeAtRightPlace(5);
        Node current2=list.head;
        list.printR(current2);

    }
}
class Node{
    int data;
    Node address;
    Node(int data){
        this.data=data;

    }

}
class SLList {
    Node head;
    Node tail;
    int count = 0;

    void addLast(int value) {
        var node = new Node(value);
        count++;
        if (head == null) {
            head = node;
        } else {
            var current = head;
            while (current.address != null)
                current = current.address;

            current.address = node;

        }

    }

    void printR(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        printR(node.address);
    }
    void addLastR(Node node,int value){
        if(node==null){
            node=new Node(value);
            return;
        }

        else if(node.address==null){
            node.address=new Node(value);
            return;
        }

        addLastR(node.address,value);
    }
    void removeLastR(Node node){
        if(node==null) {
            System.out.println("List is empty");
            return;
        }
        else if(node.address.address==null) {
            node.address = null;
            return;
        }

        removeLastR(node.address);
    }
    void addNodeAtRightPlace(int data){
        var node=new Node(data);
        if(head==null) {
            head = node;
            return;
        } else if(node.data<head.data) {
            node.address=head;
            head=node;
            return;
        }
        else {
            var current=head;
            while(current.address!=null && current.address.data<node.data){
                current=current.address;
            }
            node.address=current.address;
            current.address=node;
        }


    }
}
}