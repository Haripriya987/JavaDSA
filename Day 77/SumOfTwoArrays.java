import java.util.Arrays;

public class SumOfTwoArrays {
    public static int[] sumArrays(int[] arr1,int[] arr2){
        int k=Math.max(arr1.length,arr2.length);
        int[] res=new int[k+1];
        int i= arr1.length-1;
        int j=arr2.length-1;
        int carry=0;
        while(i>=0 && j>=0){
            int sum=arr1[i--]+arr2[j--]+carry;
            res[k--]=sum%10;
            carry=sum/10;
        }
        while(i>=0){
            int sum=arr1[i--]+carry;
            res[k--]=sum%10;
            carry=sum/10;
        }
        while(j>=0){
            int sum=arr2[j--]+carry;
            res[k--]=sum%10;
            carry=sum/10;
        }
        res[0]=carry;
        return res;

    }
public static void main(String[] args){
    int arr1[]={9,9,9,9,9};
    int arr2[]={9,9,9,9};
    int res[]=sumArrays(arr1,arr2);
    System.out.println(Arrays.toString(res));
}
}

