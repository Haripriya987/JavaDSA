import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class MajorityElement {
    public static ArrayList<Integer> Element(ArrayList<Integer> arr)
    {
        // Write your code here.
        ArrayList<Integer> al=new ArrayList<>();
        int n=arr.size();
        double value=Math.floor(n/3);
        Collections.sort(arr);
        double count=1;
        for(int i=0;i<n-1;i++){
            if(arr.get(i).equals(arr.get(i+1))){
                count++;
            }
            else{
                if(count>value)
                    al.add(arr.get(i));

                count=1;
            }
        }


        if(count>value)
            al.add(arr.get(n-1));

        return al;

    }


    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int a=in.nextInt();
            ArrayList<Integer> li=new ArrayList<>();
            for(int i=0;i<a;i++){
                int val=in.nextInt();
                li.add(val);
            }
            ArrayList<Integer> res=new ArrayList<>();

            res=Element(li);
            for(int x:res){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}

