import java.util.HashSet;
import java.util.Scanner;

public class TwoArray {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int arr[]={3,4,6,9};
        int arr2[]={12,3,57,9};
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int x:arr)
            hs.add(x);
         for(int y:arr2){
             if(hs.contains(y))
                 System.out.println(y);
             else{
                 hs.add(y);
             }
         }


    }
}
