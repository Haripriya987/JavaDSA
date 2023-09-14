import java.util.Arrays;
import java.util.EmptyStackException;
public class DoubleStack {
    public static void main(String[] args){
        TwoStack stack=new TwoStack(8);
        System.out.println(stack.top1);
        System.out.println(stack.top2);
        stack.push1(32);
        stack.push2(346);
        stack.print();
        System.out.println(stack.size());
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
        stack.print();
    }
}

 class TwoStack{
        private int[] stackitems;
        private int n;
         int top2;
        TwoStack(){
            this.n=top2=5;
            stackitems=new int[n];
        }
        TwoStack(int n){
            this.n=top2=n;
            stackitems=new int[n];
        }
        int top1=-1;
        void push1(int value){
            if(isFull())
                throw new  StackOverflowError("Stack is Full");

            stackitems[++top1]=value;

        }
        void push2(int value){
            if(isFull())
                throw new  StackOverflowError("Stack is Full");

            stackitems[--top2]=value;

        }
        int pop1(){
            if(isEmpty())
                throw new EmptyStackException();

            var temp=stackitems[top1];
            top1--;
            return temp;
        }
        int pop2(){
            if(isEmpty())
                throw new EmptyStackException();

            var temp=stackitems[top2];
            top2++;
            return temp;
        }
        boolean isFull(){
            return top1==top2-1;
        }
        boolean isEmpty(){
            return (top1==-1 && top2==stackitems.length);
        }
        int size(){
            return stackitems.length-top2+top1+1;
        }
        void print(){
            int[] temp1= Arrays.copyOfRange(stackitems,0,top1+1);
            int[] temp2=Arrays.copyOfRange(stackitems,top2,stackitems.length);
            System.out.print("["+ " ");
            for(var x:temp1){
                System.out.print(x+" ");
            }
            for(var y:temp2){
                System.out.print(y+ " ");
            }
            System.out.println("]");
        }
}
