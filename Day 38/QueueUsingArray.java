import java.util.*;
public class QueueUsingArray {
    public static void main(String[] args){
        ArrayQueue aq=new ArrayQueue(5);
        aq.enque(1);
        aq.enque(2);
        aq.enque(3);
        aq.enque(4);
        aq.print();
        aq.enque(5);
        System.out.println(aq.deque());
        System.out.println(aq.deque());
        aq.print();
    }
}
class  ArrayQueue{
    int size=0;
    int front=0;
    int rear=0;
    int count=0;
    int arr[];

    public ArrayQueue(int n) {
        this.size=n;
        arr=new int[n];

    }
    public void enque(int a){
        if(isFull())
            throw new IllegalStateException("Queue is Fill");

        arr[rear]=a;
        rear=(rear+1)%arr.length;
        count++;
    }
    public int deque(){
        if(isEmpty())
            throw new EmptyStackException();

        int ele=arr[front];
        arr[front]=0;
        front=(front+1)%arr.length;
        return ele;
    }
    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();

        return arr[front];
    }
    boolean isFull(){
        return count==arr.length;
    }
    boolean isEmpty(){
        return count==0;
    }
    public void print(){
        System.out.println(Arrays.toString(arr));
    }
}