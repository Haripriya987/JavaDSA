public class BubbleSort {
    public static void bSort(int[] arr){
        int n=arr.length;
    for(int i=0;i<n-1;i++){
        for(int j=1;j<n-i;j++){
            if(arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
    }
    }
    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        //int[] arr={2,5,6,7,1,3};
        int[] arr={12,0,9,3,4};

        bSort(arr);
        printArray(arr);
    }
}
