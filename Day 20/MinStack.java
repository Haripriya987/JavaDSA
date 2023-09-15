import java.util.*;
public class MinStack {

    public static void main(String[] args){
        DemoStack stack=new DemoStack();
        stack.push(34);
        stack.push(4);
        stack.push(1);
        stack.push(341);

        System.out.println(stack.min());
        System.out.println(stack.pop());
        System.out.println(stack.min());
        stack.print();
    }

}
class DemoStack{
  private  Stack<Integer> st=new Stack<>();
  private   Stack<Integer> Minst=new Stack<>();
  void push(int value){
      st.push(value);

      if(Minst.isEmpty()){
          Minst.push(value);
      }
      else if(Minst.peek()>value){
          Minst.push(value);
      }

  }
  int pop(){
      if(st.isEmpty()){
          throw new EmptyStackException();
      }
      if(Minst.peek()==st.peek())
          Minst.pop();

      return st.pop();
  }
  int min(){
   return Minst.peek();
  }
  void print(){
    Stack<Integer>  temp=new Stack<>();
      while(!st.isEmpty()){
          int value=st.pop();
         System.out.print(value+" ");
         temp.push(value);
      }
  }
}
