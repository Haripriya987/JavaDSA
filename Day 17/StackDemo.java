import java.util.*;
public class StackDemo {
    public static void main(String[] args){
        Demo d=new Demo(5);

        d.push(21);
        d.push(45);
        d.print();
        d.pop();
        d.push(565);
        d.peek();
        d.print();
        System.out.println(d.isEmpty());
        System.out.println(d.isFull());


    }
}
class Demo{
    private int top=-1;
   private int n;
    private int[] a;
    Demo(){
        this.n=0;
    }
    Demo(int n){
        this.n=n;
        a=new int[n];
    }
    void push(int value){
        if(top==n-1)
            throw new IllegalStateException("Stack is Overflow");

        top++;
        a[top]=value;
    }
    void pop(){
        if(top==-1)
            throw new IllegalStateException("Stack is UnderFlow");

        top--;
    }
    void peek(){
            if(top==-1)
                throw new IllegalStateException("Stack is UnderFlow");

            System.out.println(a[top]);
        }
    boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
   boolean isFull(){
        if(top==n-1)
            return true;
        else
            return false;
   }
   void print(){
        for(int i=0;i<=top;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
   }

}