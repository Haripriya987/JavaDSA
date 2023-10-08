public class QueueUsingLL {
    public static void main(String[] args){
        LList lq=new LList();
        lq.enque(21);
        lq.enque(56);
        lq.enque(65);
        lq.printQueue();
        System.out.println(lq.deque());
        lq.printQueue();

    }
}
class LList{
    class Node{
        Node next;
        int data;
        public Node(int data) {
            this.data=data;
        }
    }
    Node head;
    Node tail;
    int count=0;

    public void enque(int ele){
        Node node=new Node(ele);

        if(head==null){
            head=tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
        count++;

    }
    public int deque(){
        if(head==null)
            throw new IllegalStateException();
        int value;
        if(head==tail) {
            value= head.data;
            head = tail = null;
        }
        else{
            value=head.data;
            head=head.next;
        }
        count--;
        return value;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public  int peek(){
        if(head==null)
            throw new IllegalStateException();
        else
            return head.data;
    }
    public void printQueue(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
