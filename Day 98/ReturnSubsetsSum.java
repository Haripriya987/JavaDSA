public class ReturnSubsetsSum {

    public static int[][] subsetSumK(int[] arr,int index,int k){
        if(index==arr.length){
            if(k==0)
                return new int[1][0];
            else
                return new int[0][0];
        }

        int[][] output1=subsetSumK(arr,index+1,k);
        int[][] output2=subsetSumK(arr,index+1,k-arr[index]);
        int[][] res=new int[output1.length+ output2.length][];
        int z=0;
        for (int i = 0; i < output1.length; i++) {
            res[z++]=output1[i];
        }
        for (int i = 0; i < output2.length; i++) {
            res[z]=new int[output2[i].length+1];
            res[z][0]=arr[index];

            for (int j = 0; j < output2[i].length; j++) {
                res[z][j+1]=output2[i][j];
            }
            z++;
        }

        return res;

    }
    public static int[][] subsetSum(int arr[],int k){
        return subsetSumK(arr,0,k);
    }
    public static void main(String[] args){
        int arr[]={1,2,3};
       int res[][]=subsetSum(arr,5);
        for(int i=0;i< res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
