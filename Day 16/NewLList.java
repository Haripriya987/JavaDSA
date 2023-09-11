public class NewLList {
    public static void main(String args[]){
        ListDemo ld=new ListDemo();
        ld.add(20);
        ld.add(30);
        ld.add(25);
        ld.add(10);
       System.out.println( ld.find(235));
       ld.minElement(ld.head);
       ld.maxElement(ld.head);
       ld.printDec(ld.head);
       System.out.println(" ");
        ld.printInc(ld.head);
    }
}
class ListDemo {
    Node head;
    class Node {
        int data;
        Node next,up;

        Node(int data) {
            this.data = data;

        }

    }
    void add(int value){
        Node node=new Node(value);

        if(head==null){
            head=node;
            return;
        }
        var current=head;
        while(current!=null){
            if(current.data>value){
                if(current.up==null){
                    current.up=node;
                    return;
                }
                current=current.up;
            }
            else{
                if(current.next==null){
                    current.next=node;
                    return;
                }
                current=current.next;
            }
        }
    }
boolean find(int element) {
    var current=head;
    while(current!=null){
        if(current.data==element)
            return true;
        else if(current.data>element)
            current=current.up;
        else
            current=current.next;
    }

return false;
}
void minElement(Node node){
    if(node==null)
        return;


    if(node.up==null){
      System.out.println(node.data);
      return;
    }

 minElement(node.up);


}
void maxElement(Node node){
        if(node==null)
            return;

    if(node.next==null){
        System.out.println(node.data);
        return;
    }


    maxElement(node.next);


}
void printInc(Node node){

        if(node==null){
            return;
        }
        printInc(node.up);
        System.out.print(node.data+ " ");
        printInc(node.next);
    }
    void printDec(Node node){

        if(node==null){
            return;
        }
        printDec(node.next);
        System.out.print(node.data+ " ");
        printDec(node.up);
    }

}