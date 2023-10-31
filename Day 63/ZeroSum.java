import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class ZeroSum {
    public static void subArrayWithZeroSum(int[] arr,int k){
        int count=0;
        for(int a=0;a<arr.length-1;a++) {
            for (int i = 0; i < arr.length - a; i++) {
                int sum = 0;
                boolean flag=false;
                for (int j = i; j < i + a; j++) {
                    sum += arr[j];
                    flag=true;
                }
                if (sum == k && flag==true) {
                    count++;
                    for (int j = i; j < i + a; j++) {
                        System.out.print(arr[j]+" ");
                    }
                    System.out.println();

                }

            }
        }
        System.out.println("count: "+count);
    }
    public static void zer0SumUsingHashing(int arr[]){
        HashSet<Integer> hs=new HashSet<Integer>();
        int sum=0;
        int count=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
            if(sum==0||arr[i]==0 || hs.contains(sum))
                count++;
            else
                hs.add(sum);
        }
        if(count>0)
            System.out.println("YES zerosum Exists");
        else
            System.out.println("NO zerosum exists");
    }
    public static void main(String[] args){
        int arr[]={4,2,-3,1,6};
        int arr2[]={4,2,0,1,6};
        subArrayWithZeroSum(arr,0);
        subArrayWithZeroSum(arr2,0);
        zer0SumUsingHashing(arr);
        zer0SumUsingHashing(arr2);

    }

}
