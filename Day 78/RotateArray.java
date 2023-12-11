public class RotateArray {
    public static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }
    public static void reverse(int[] arr,int first,int last){
        while(first<last)
            swap(arr,first++,last--);

    }
    public static void rotateArray(int[] arr,int d){
        if(arr.length==0)
            return;
        if(d>=arr.length &&arr.length!=0){
            d%= arr.length;
        }
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-d-1);
        reverse(arr,arr.length-d,arr.length-1);

    }
    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
    int[] arr={1,5,8,3,7,2,4};
    rotateArray(arr,3);
    printArray(arr);
    }
}
