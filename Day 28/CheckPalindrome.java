public class CheckPalindrome {
    public static void main(String[] args){
        DoubleLL lld=new DoubleLL();
        lld.addFirst(3);
        lld.addFirst(2);
        lld.addFirst(1);
        lld.addFirst(1);
        lld.addFirst(2);
        lld.addFirst(3);
    //   lld.addLast(56);
//        lld.removeFirst();
//        lld.removeLast();
        lld.print();
        System.out.println(lld.checkPalindrome(lld.head));
    }
}
class DoubleLL{

    Node head;
    class Node{
        Node prev;
        Node next;
        int data;

        Node(){

        }
        Node(int value){
        this.data=value;
        }
    }
    void addLast(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=node;
        node.prev=temp;
    }
    void addFirst(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head.prev=node;
        head=node;

    }
    void removeFirst(){
        if(head==null)
            throw new IllegalStateException();
        if(head.next==null){
            head=null;
            return;
        }

        head=head.next;
        head.prev=null;
    }
    void removeLast(){
        if(head==null)
            throw new IllegalStateException();
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head.next;
        Node temp2=head;
        while(temp.next!=null){
            temp=temp.next;
            temp2=temp2.next;
        }
        temp2.next=temp.prev=null;

    }
    void print(){
        if(head==null)
            return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    boolean checkPalindrome(Node temp){
        if(temp==null){
            throw new IllegalStateException();
        }
        Node end=temp;
        int last=1;
        while(end.next!=null){
            last++;
            end=end.next;

        }
        Node start=temp;
        int first=1;
        while( last>=first  ){
            if(end.data!=start.data) {
                return false;
            }
            first++;
            last--;
            start=start.next;
            end=end.prev;

        }
        return true;
    }
}
