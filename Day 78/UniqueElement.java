import java.util.Arrays;
public class UniqueElement {
    public static void unique(int[] arr){
        Arrays.sort(arr);
        int count=1;
        int ele=arr[0];
        int i;
        for( i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) {
                count++;
                ele = arr[i];
            }
            else{
             if(count==1)
                 System.out.println(ele);

             count=1;
            }
        }
        if(arr[arr.length-2]==arr[arr.length-1])
            count++;
        else {
            count = 1;
            ele = arr[arr.length - 1];
        }
        if(count==1)
            System.out.println(ele);

    }
    public static void main(String[] args){
        int arr[]={3,2,6,3,7,6,2,7,1};
        unique(arr);
    }
}
