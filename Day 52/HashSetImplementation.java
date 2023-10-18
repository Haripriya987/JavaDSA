import java.util.*;
public class HashSetImplementation {
    public static void main(String[] args){
        Hash demo=new Hash();

    }
}
class Hash{
int arr[]=new int[10];
void add(int n){
    arr[hash(n)]=n;
}
int hash(int num){
    return num%arr.length;
}
int get(int n){
    return arr[hash(n)];
}
}
