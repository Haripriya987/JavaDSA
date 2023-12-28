import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int arr[],int start,int end){
       if(start>=end)
           return;

       int p=partition(arr,start,end);
       quickSort(arr,start,p-1);
       quickSort(arr,p+1,end);

    }
    public static int partition(int arr[],int start,int end){
        int pivot=arr[start];
        int count=0;
        for(int i=start+1;i<=end;i++){
            if(arr[i]<=pivot)
                count++;
        }
        int pivotIndex=count+start;
        arr[start]=arr[pivotIndex];
        arr[pivotIndex]=pivot;

        int i=start;
        int j=end;
        while(i<pivotIndex && j>pivotIndex){
            if(arr[i]<=pivot){
                i++;
            }

            else if(arr[j]>pivot){
                j--;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }


        }



        return pivotIndex;
    }

    public static void main(String[] args){
    int arr[]={5,4,3,2,1};
    quickSort(arr,0,4);
         System.out.println(Arrays.toString(arr));

    }
}
