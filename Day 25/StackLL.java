import java.util.EmptyStackException;
//Implementing Stack using LinkedList
public class StackLL {
    public static void main(String[] args){
        LLDemo lld=new LLDemo();
        lld.push(35);
        lld.push(23);
        lld.push(45);
        System.out.println(lld.stackSize());
        System.out.println(lld.pop());
        System.out.println(lld.peekStack());
        String str="123321";
       System.out.println( lld.isPalindrome(str));

    }
}
class LLDemo{
    Node peek;
    int size=-1;
    class Node{
        int data;
        Node next;
        Node(){

        }
        Node(int value){
            this.data=value;
        }
    }
    void push(int value){
        Node node=new Node(value);
        size++;
        if(peek==null){
            peek=node;
            return;
        }
        node.next=peek;
        peek=node;
    }
    int pop(){
        if(peek==null){
            throw new EmptyStackException();
        }
        int temp=peek.data;
        peek=peek.next;
        size--;
        return temp;
    }
    int peekStack(){
        if(isEmpty())
            throw new EmptyStackException();
        else
           return peek.data;
    }
    int stackSize(){
        return size+1;
    }
    boolean isEmpty(){
        return size==-1;
    }
    boolean isPalindrome(String str){
        int length=str.length();
        Node temp=peek;
        peek=null;
        for(int i=0;i<length/2;i++) {
            char ch=str.charAt(i);
            int value=Integer.parseInt(String.valueOf(ch));
            push(value);
        }
        int base=0;
        if(length%2!=0){
             base=length/2+1;
        }
        else{
            base=length/2;
        }
        String str2=str.substring(base,length);
        for(int j=0;j<str2.length();j++){
            char ch=str2.charAt(j);
            int str2Value=Integer.parseInt(String.valueOf(ch));
            int stackValue=pop();
            if(stackValue!=str2Value) {
                peek=temp;
                return false;
            }
        }
        peek=temp;
        return true;
    }
}
