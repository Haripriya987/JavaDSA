import java.util.EmptyStackException;
//Implementing Stack using LinkedList
public class StackLL {
    public static void main(String[] args){
        LLDemo lld=new LLDemo();
        lld.push(35);
        lld.push(23);
        lld.push(45);
        System.out.println(lld.stackSize());
        System.out.println(lld.pop());
        System.out.println(lld.peek());

    }
}
class LLDemo{
    Node head;
    Node peek;
    int size=-1;
    class Node{
        int data;
        Node next;
        Node(){

        }
        Node(int value){
            this.data=value;
        }
    }
    void push(int value){
        Node node=new Node(value);
        if(head==null){
            head=peek=node;
        }
        else {
            peek.next=node;
            peek=peek.next;
        }
        size++;
    }
    int pop(){
        if(isEmpty())
            throw new EmptyStackException();
        var temp=head;

            while(temp.next!=peek) {
                temp = temp.next;
            }
         int value=temp.next.data;
         temp.next=null;
         peek=temp;

        return value;
    }
    int peek(){
        if(isEmpty())
            throw new EmptyStackException();
        else
           return peek.data;
    }
    int stackSize(){
        return size+1;
    }
    boolean isEmpty(){
        return size==-1;
    }
}
