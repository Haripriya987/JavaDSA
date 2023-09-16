import java.util.*;
public class StackList {
    public static void main(String[] args){
        ListStack ls=new ListStack();
        ls.push(354);
        ls.push(23);
        ls.push(78);
        ls.push(12);

        int index=ls.searchIndex(23);
        System.out.print(index);

    }
}
class ListStack{
    private ArrayList<Integer> stackl=new ArrayList<>();
    void push(int value){
        stackl.add(value);

    }
    int pop(){
        int size= stackl.size();
        if(stackl.isEmpty())
            throw new EmptyStackException();

        int temp=stackl.get(size-1);
        stackl.remove(size-1);
        return temp;
    }
    int peek(){
        int size= stackl.size();
        if(stackl.isEmpty())
            throw new EmptyStackException();

        int temp=stackl.get(size-1);
        return temp;
    }
    int stackSize(){
        return stackl.size();
    }
    boolean search(int value){
        if(stackl.isEmpty())
            throw new EmptyStackException();
        ArrayList<Integer> demo=new ArrayList<>();
        int size=stackSize();
        boolean flag=false;
        while(size!=0){
            int item=stackl.get(size-1);
            if(item==value)
                flag=true;

            demo.add(item);
            size--;
        }
        stackl=demo;
        return flag;
    }
    int searchIndex(int value){
        if(!search(value)) {
            return -1;
        }

        ArrayList<Integer> demo=new ArrayList<>();
        int temp=stackSize();
        int index=0;
        while(temp!=0){
            int item=stackl.get(temp-1);
            if(item==value) {
                index = temp;
                temp--;
            }
            else {
                demo.add(item);
                temp--;
            }
        }
        stackl=demo;
        return stackl.size()-index+1;



    }
}