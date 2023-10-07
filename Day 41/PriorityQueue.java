import java.util.ArrayList;
import java.util.Arrays;

public class PriorityQueue {
    public static void main(String[] args){
        PQDemo pq=new PQDemo(5);
        pq.enqueue(4);
        pq.enqueue(9);
        pq.enqueue(1);
        pq.enqueue(2);
        pq.enqueue(8);
        System.out.println(pq.count);
        pq.printQueue();
        System.out.println(pq.deque());
        System.out.println(pq.peek());
        pq.printQueue();

    }
}
class PQDemo{
    int[] arr;
    int count=0;

    public PQDemo(int n){
        arr=new int[n];
    }
    public void enqueue(int a){
        if(isFull())
            throw new IllegalStateException();
        int i = findPositionToInsert(a);
        arr[i+1]=a;
        count++;
    }

    private int findPositionToInsert(int a) {
        int i;
        for(i=count-1;i>=0;i--){
            if(arr[i]> a){
                arr[i+1]=arr[i];
            }
            else{
                break;
            }
        }
        return i;
    }

    public int deque(){
        if(isEmpty())
            throw new IllegalStateException();
        int value=arr[count-1];
        arr[count-1]=0;
        return value;
    }
    public int peek(){
        if(count==0)
            throw new IllegalStateException();
        return arr[count-1];
    }
    boolean isEmpty(){
        return count==0;
    }
    boolean  isFull(){
        return count==arr.length;
    }
    void printQueue(){
        System.out.println(Arrays.toString(arr));
    }
}