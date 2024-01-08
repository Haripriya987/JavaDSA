public class BooleanMatrix {

    public static void changeMatrix(int arr[][]){
        int rows=arr.length;
        int cols=arr[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==1){

                    int index=i-1;
                    while(index>=0){
                        if(arr[index][j]!=1)
                            arr[index][j]=-1;

                        index--;
                    }

                    index=i+1;
                    while(index<rows){
                        if(arr[index][j]!=1)
                            arr[index][j]=-1;

                        index++;
                    }

                    index=j-1;
                    while(index>=0){
                        if(arr[i][index]!=1)
                            arr[i][index]=-1;

                        index--;
                    }

                    index=j+1;
                    while(index<cols){
                        if(arr[i][index]!=1)
                            arr[i][index]=-1;

                        index++;
                    }


                }


            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] < 0) {
                    arr[i][j] = 1;
                }
            }
        }



    }
    public static void changeMatrix(int arr[][],int r,int c){
        int R[]=new int[r];
        int C[]=new int[c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    R[i]=1;
                    C[i]=1;
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if( R[i]==1 || C[i]==1){
                   arr[i][j]=1;

                }
            }
        }



    }

    public static void main(String args[]){
        int[][] arr = { { 1, 0, 2, 1 },
                { 3, 4, 5, 2 },
                { 0, 3, 0, 5 } };

        changeMatrix(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second way");
        int[][] arr2 = { { 1, 0, 2, 1 },
                { 3, 4, 5, 2 },
                { 0, 3, 0, 5 } };


        changeMatrix(arr2,3,4);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
