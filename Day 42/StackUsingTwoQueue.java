import java.util.*;
public class StackUsingTwoQueue {
    public static void main(String[] args){
        qStack qs=new qStack();
        qs.push(20);
        qs.push(9);
        qs.push(11);
        qs.push(57);
        qs.push(38);
        System.out.println(qs.peek);
        System.out.println(qs.pop());
       qs.printStack(qs.Q1);
      System.out.println(qs.getSize());
      System.out.println(qs.getPeek());
    }

}
class qStack{
    Queue<Integer> Q1=new ArrayDeque<>();
    Queue<Integer> Q2=new ArrayDeque<>();
    int peek;
    int count=0;
    public void push(int ele){
        Q1.add(ele);
        peek=ele;
        count++;
    }
    public int pop(){
        if(Q1.isEmpty())
            throw new EmptyStackException();
        int demo=0;
        while (Q1.peek()!=peek){
            demo= Q1.poll();
            Q2.add(demo);

        }
         int data=Q1.poll();
        peek=demo;
        count--;

        Queue<Integer> temp=Q2;
        Q2=Q1;
        Q1=temp;

        return data;
    }
    public int getPeek(){
        if(peek==0)
            throw new EmptyStackException();

        return peek;
    }
    public int getSize(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void printStack(Queue<Integer> demo){
        Iterator value= demo.iterator();
        while(value.hasNext()){
            System.out.print(value.next()+" ");
        }
        System.out.println();

    }
}