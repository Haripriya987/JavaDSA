import java.util.EmptyStackException;
import java.util.Stack;

public class MaxStack {


    public static void main(String[] args){
        DemoStack2 stack=new DemoStack2();
        stack.push(34);
        stack.push(4);
        stack.push(1);
        stack.push(341);
        stack.push(672);
        stack.push(219);
        System.out.println(stack.max());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.max());
        stack.print();
    }

}
class DemoStack2{
    private Stack<Integer> st2=new Stack<>();
    private   Stack<Integer> Maxst=new Stack<>();
    void push(int value){
        st2.push(value);

        if(Maxst.isEmpty()){
            Maxst.push(value);
        }
        else if(Maxst.peek()<value){
            Maxst.push(value);
        }

    }
    int pop(){
        if(st2.isEmpty()){
            throw new EmptyStackException();
        }
        int value=st2.pop();
        if(Maxst.peek()==value) {
            Maxst.pop();
              }

        return value ;
    }
    int max(){
        return Maxst.peek();
    }
    void peek(){

    }
    void print(){
        Stack<Integer>  temp=new Stack<>();
        while(!st2.isEmpty()){
            int value=st2.pop();
            System.out.print(value+" ");
            temp.push(value);
        }
        System.out.println();

    }
}
