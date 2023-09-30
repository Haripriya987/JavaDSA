import java.util.*;
public class InfixToPostfix {
public static void main(String[] args){
    String infix="3+(4*2)/(1-5)";
    Expression s=new Expression();
    System.out.println(s.inToPostfix(infix));

    }
}
class Expression{
    String inToPostfix(String infix){
        Stack<Character> st=new Stack<>();
        StringBuilder result=new StringBuilder("");
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            } else if (ch=='(') {
                st.push(ch);

            } else if (ch==')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                 st.pop();
            }
                else{
                    while(!st.isEmpty() && precedence(ch)<=precedence(st.peek())) {
                        result.append(st.pop());
                    }
                    st.push(ch);
                }

                }
        while(!st.isEmpty()) {
            result.append(st.pop());

        }
            return result.toString();
        }

    int precedence(char ch){
        switch(ch){
            case '^': return 3;
            case '*':
            case '/':return 2;
            case '+':
            case '-':return 1;
            default :return 0;
        }
    }

}