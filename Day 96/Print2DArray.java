public class Print2DArray {

    public static void printArray(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;

        for(int i=0;i<rows;i++){
            int repeatitions=rows-i;
            for(int k=0;k<repeatitions;k++) {
                for (int j = 0; j < cols; j++) {
                 System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};

        printArray(arr);


    }
}
