import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int arr[],int start,int end){

        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,end);
    }

    public static void merge(int arr[],int start,int end){
        int size=end-start+1;
        int mid=(start+end)/2;
        int res[]=new int[size];
        int i=start;
        int j=mid+1;
       int k=0;
       while(i<=mid && j<=end){
           if(arr[i]<arr[j]) {
               res[k] = arr[i];
               i++;
               k++;
           } else if (arr[i]==arr[j]) {
                res[k]=arr[i];
                i++;
                j++;
                k++;
           } else{
               res[k]=arr[j];
               j++;
               k++;

           }

       }

       while(i<=mid){
           res[k++]=arr[i++];
       }

        while(j<=end){
            res[k++]=arr[j++];
        }
        int z=0;

        for(int q=start;q<=end;q++){
            arr[q]=res[z++];
        }

    }
    public static void main(String[] args){
        int arr[]={1,4,5,2,9};
        mergeSort(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }

}
