import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args){
                QueueStack qs=new QueueStack();
                qs.enqueue(3);
                qs.enqueue(4);
                qs.enqueue(1);
                System.out.println(qs.dequeue());
                System.out.println(qs.isEmpty());
                System.out.println(qs.peek());
    }
}
class QueueStack{
Stack<Integer> st1=new Stack<>();
Stack<Integer> st2=new Stack<>();
public void enqueue(int n){
    st1.push(n);
}
public int dequeue(){
    pushS1ElementsToS2();
    return st2.pop();
}
public int peek(){
    pushS1ElementsToS2();
    return st2.peek();
}

private void pushS1ElementsToS2() {
        if(st2.isEmpty())
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
    }

    public boolean isEmpty(){
    if(st1.isEmpty() && st2.isEmpty())
        return true;
    else
        return false;
}

}