public class printSpiral {
    public static void printSpiral(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;
        int colstart=0,rowstart=0,i=0;
        int values=rows*cols;
        int count=0;
        while(count<values){
            for(i=colstart;count<values && i<cols;i++){
                System.out.print(arr[rowstart][i]+" ");
                count++;
            }
            rowstart++;
            for(i=rowstart;count<values&&i<rows;i++){
             System.out.print(arr[i][cols-1]+" ");
             count++;
            }
            cols--;

            for(i=cols-1;count<values && i>=colstart ;i--){
                System.out.print(arr[rows-1][i]+" ");
                count++;
            }
            rows--;

            for(i=rows-1;count<values && i>=rowstart;i--){
                System.out.print(arr[i][cols]+" ");
                count++;
            }
            colstart++;


        }

    }

    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(arr);
    }
}
