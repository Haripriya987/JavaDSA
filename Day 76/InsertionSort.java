public class InsertionSort {

    public static void iSort(int[] arr){
        int n=arr.length;
        int i=1;
        int temp;
        while(i<n){
            temp=arr[i];
            int j=i-1;
            while(j>=0){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];

                }
                else{
                    break;
                }
                j--;

            }
            arr[j+1]=temp;
            i++;
        }

    }
    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
    int[] arr={3,0,9,4,12,2};
    iSort(arr);
    printArray(arr);
    }
}
//