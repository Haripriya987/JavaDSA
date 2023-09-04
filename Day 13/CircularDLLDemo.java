
public class CircularDLLDemo {
    public static void main(String[] args){
        CDLL list=new CDLL();
        list.addFirst(10);
        list.addFirst(20);
       list.addFirst(30);
        list.addLast(5);

        list.printNodes();
        list.printReverse();
        System.out.println();
        list.printMiddle();
        list.kElement(2);
        list.reverseKElement(2);
        list.removeAt(2);
        list.printNodes();
        list.addAt(0,3);
        list.printNodes();

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
        count++;
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
        count++;
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
            count--;
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

        count--;
    }
    void removeLast(){
        if(head==null)
            throw new IllegalStateException("List is Empty");
        if(head.next==head) {
            head = null;
            count--;
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
        count--;

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
        }while(current!=head.prev);

    }


    void printMiddle(){
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next==head){
            System.out.println(head.data);
            return;
        }


        var start=head;
        var end=head.next.next;
        while(end.next!=head){
            start=start.next;
            end=end.next;
        }
        System.out.print(start.data+ " ");
        if(end.next==head)
            System.out.print(start.next.data);

        System.out.println();
        return;
    }
    void kElement(int k){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(k<0 || k>count){
            System.out.println("Not a valid k value");
            return;
        }
        var current=head;
        int start=0;
        while(current.next!=head ){
            if(start==k-1)
                break;

            current=current.next;
            start++;
        }

        System.out.println(current.data);


    }
    void reverseKElement(int k){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        var start=head;
        var end=head;
        for(int i=1;i<=k-1;i++)
            end=end.next;

        do{
            start=start.next;
            end=end.next;
        }while(end.next!=head);
        System.out.println(start.data);
    }
    void removeAt(int n){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(n>count || n<0) {
            throw new IllegalStateException("It is not a valid position");
        }

        else {
            int pos = 1;
            var current = head;
            var nextOne = head.next;
            Node previous = null;
            while (pos != n && current.next != head) {
                previous = current;
                nextOne = nextOne.next;
                current = current.next;

                pos++;
            }

            previous.next = current.next;
            nextOne.prev = current;
            current.next = current.prev = null;
            count--;
        }



    }
    void addAt(int n,int value){
        count++;
      var node=new Node(value);
      if(head==null) {
            head=node;
            node.next=head;
      }
      if(n==0){
          addFirst(value);
          return;
      }

        int pos = 1;
        var current = head;
        var nextOne = head.next;

        while (pos != n && current.next != head) {
            nextOne = nextOne.next;
            current = current.next;

            pos++;

        }
        current.next=nextOne.prev=node;
        node.prev=current;
        node.next=nextOne;


        }
}