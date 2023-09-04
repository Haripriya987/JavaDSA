public class LinkedListAssignment {
    public static void main(String[] args){
        SLList list=new SLList();
        list.addLast(10);
        list.addLast(12);
        list.addLast(31);
        list.addNodeAtRightPlace(63);
        Node current=list.head;
        list.printR(current);
        System.out.println();
        list.addLastR(current,30);
        list.addNodeAtRightPlace(45);
        list.addNodeAtRightPlace(5);
        Node current2=list.head;
        list.printR(current2);
        System.out.println();
        list.printOddEven();
        list.printBigSmall();

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

    Node addR(Node lnode,int value,int pos){
        if (head == null || pos>count+1) {
            return head;
        }


        if(pos==0){
            var node=new Node(value);
            node.address=head;
            return node;

        }

        else {

            lnode.address = addR(lnode.address, value, pos-1);
            return lnode;
        }
    }
Node deleteR(Node node,int pos){
    if (head== null || pos>count+1) {

        return head;
    }
            if(pos==0)
                return node.address;

            Node current=deleteR(node.address,pos-1);
            node.address=current;
            return node;
}
void printOddEven(){
          class Node2{
        int data;
        Node2 up;
        Node2 right;
        Node2(int data){
            this.data=data;
        }
    }

    Node2 node2=new Node2(1);
    Node2 head2=node2;
    Node2 currentUP=head2;
    Node2 currentRight=head2;
    Node2 evenOne =null;
    Node2 oddOne=null;
    var current=head;
    while(current!=null){
        int  n=current.data;
        if(n%2==0) {
            evenOne = new Node2(n);
            currentUP.up = evenOne;
            currentUP=currentUP.up;
        }
        else{
            oddOne = new Node2(n);
            currentRight.right = oddOne;
            currentRight=currentRight.right;
        }

        current=current.address;
    }
     System.out.println("Even values && Odd values");
    Node2 printE=head2.up;
    while(printE!=null){
        System.out.print(printE.data+ " ");
        printE=printE.up;
    }
    Node2 printO=head2;
    while(printO!=null){
        System.out.print(printO.data+ " ");
        printO=printO.right;
    }
    System.out.println();

}
    void printBigSmall(){
        class Node2{
            int data;
            Node2 up;
            Node2 right;
            Node2(int data){
                this.data=data;
            }
        }

        Node2 node2=new Node2(20);
        Node2 head2=node2;
        Node2 currentUP=head2;
        Node2 currentRight=head2;
        Node2 smallOne =null;
        Node2 greaterOne=null;
        var current=head;
        while(current!=null){
            int  n=current.data;
            if(n<20) {
                smallOne = new Node2(n);
                currentUP.up = smallOne;
                currentUP=currentUP.up;
            }
            else{
                greaterOne = new Node2(n);
                currentRight.right = greaterOne;
                currentRight=currentRight.right;
            }

            current=current.address;
        }
        System.out.println("smaller than 20 on left side  && greater than 20 on right side values");
        Node2 printS=head2.up;
        while(printS!=null){
            System.out.print(printS.data+ " ");
            printS=printS.up;
        }
        Node2 printG=head2;
        while(printG!=null){
            System.out.print(printG.data+ " ");
            printG=printG.right;
        }
        System.out.println();

    }


}
