import java.util.*;
public class SumOfDiagonalAndBoundaries {
    public static int diagonalAndBoundarySum(int arr[][]){
        HashSet<Integer> hs=new HashSet<>();
        int rows=arr.length;
        int cols=arr[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || j==0 ||i==rows-1||j==cols-1 || i==j){
                    hs.add(arr[i][j]);
                }
                if(i+j==rows-1){
                    hs.add(arr[i][j]);
                }
            }
        }
        int sum=0;
        for(int x:hs){
            sum+=x;
        }

        return sum;
    }
    public static int getFirstDiagonalSum(int arr[][],int dim){
        int row=0;
        int col=0;
        int diagoanalSum=0;
        while(row<dim && col<dim){
            diagoanalSum+=arr[row][col];
            row++;
            col++;
        }
        return diagoanalSum;
    }
    public static int getSecondDiagonalSum(int arr[][],int dim){
        int row=0;
        int col=dim-1;
        int diagoanalSum=0;
        while(row<dim && col>=0){
            diagoanalSum+=arr[row][col];
            row++;
            col--;
        }
        return diagoanalSum;
    }
    public static int getBoundarySum(int[][] arr,int dim){
        int sum=0;
        for(int i=1;i<(dim-1);i++){
            sum+=arr[0][i];
            sum+=arr[dim-1][i];
            sum+=arr[i][0];
            sum+=arr[i][dim-1];
        }
        return sum;
    }
    public static void sumOfDiagonalAndBoundariesInSecond(int arr[][],int dim){
       if(dim==0) {
           System.out.println(0);
           return;
       }

        int totalSum=getFirstDiagonalSum(arr,dim)+getSecondDiagonalSum(arr,dim)+getBoundarySum(arr, dim);
       if(dim%2!=0){
           totalSum-=arr[dim/2][dim/2];
       }
       System.out.println(totalSum);
    }
    public static void main(String[] args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={
                { 1, 2, 3 ,10}, {4, 5, 6 ,11},{ 7 ,8 ,9 ,12},{13 ,14 ,15 ,16}};
        int arr3[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println(diagonalAndBoundarySum(arr));
        sumOfDiagonalAndBoundariesInSecond(arr,arr.length);
    }
}
