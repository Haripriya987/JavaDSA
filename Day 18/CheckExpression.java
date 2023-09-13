import java.util.*;
public class CheckExpression {
    public static void main(String[] args){
        String str="{{((34dgf)){}]][";
        System.out.println(check(str));
        String s="QWERT";
        System.out.println(reverse(s));


    }
    static boolean check(String input){
        Stack<Character> st=new Stack<>();
        for(var x:input.toCharArray()) {
            if (x == '{' || x == '[' || x == '(' || x == '<') {
                st.push(x);
            }
            if (x == '}' || x == ']' || x == ')' || x == '>') {

                if (st.empty())
                    return false;
                else if (x == '}' && st.peek() == '{') {
                    st.pop();

                } else if (x == ']' && st.peek() == '[') {
                    st.pop();

                } else if (x == ')' && st.peek() == '(') {
                    st.pop();

                } else if (x == '>' && st.peek() == '<') {
                    st.pop();

                }
            }
        }
     return st.isEmpty();
    }

    static  String reverse(String input){
        if(input==null) {
            throw new IllegalArgumentException("String is null");
        }
        Stack<Character> stack=new Stack<>();
         for(var x:input.toCharArray()){
             stack.push(x);
         }
//        while(!stack.isEmpty()){
//            System.out.print(stack.pop());
//        }
        String rev="";
        while(!stack.isEmpty()){
            rev+=stack.pop();
        }
       return rev;
    }
}
