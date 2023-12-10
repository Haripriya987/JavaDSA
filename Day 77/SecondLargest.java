public class SecondLargest {
    public static void secondLargest(int[] arr){
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (max < arr[i]) {
                second = max;
                max = arr[i];
            } else if (second < arr[i] && arr[i]!=max) {
                second=arr[i];
            }
        }
        System.out.println(second);

    }
    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+"");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={1,4,6,2,4,7,8};
        secondLargest(arr);
    }
}
