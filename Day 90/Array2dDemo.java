import java.util.Scanner;

public class Array2dDemo {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows=in.nextInt();
        System.out.println("Enter no of cols");
        int cols=in.nextInt();

        System.out.println("Enter the elements");

        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the elements at " + i +"th row " + j +" th column" );

                arr[i][j]=in.nextInt();
            }
        }

        System.out.println("Printing Array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
