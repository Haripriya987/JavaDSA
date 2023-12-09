import java.util.Scanner;
public class SelectionSort {
    public static void sSort(int[] arr){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        int min=Integer.MAX_VALUE;
        int index=i;
        int j=0;
        for( j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    index=j;
                }
            }
        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
        }

    }
    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
public static void main(String[] args){
int arr[]={3,0,1,4,8,5,7};
sSort(arr);
printArray(arr);
}
}
