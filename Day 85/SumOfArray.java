public class SumOfArray {
    public static int  sumOfArrayHelper(int[] arr,int index) {
        if(index==arr.length-1)
            return arr[index];

       // int sum= sumOfArrayHelper(arr,index+1);
        return arr[index]+sumOfArrayHelper(arr,index+1);

    }
    public static int sumOfArray(int[] arr) {
    return sumOfArrayHelper(arr,0);
    }

        public static void main(String[] args){

        int[] arr={2,5,7,1,4};
        System.out.println(sumOfArray(arr));
    }


}
