public class SubsetsOfArray {
    public static void printArraySubsets(int arr[],int index,int[] res){
        if(index==arr.length){
            for(int i:res){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        int[] output=new int[res.length+1];
        int i=0;
        for(;i<res.length;i++){
            output[i]=res[i];
        }
        output[i]=arr[index];

        printArraySubsets(arr,index+1,res);
        printArraySubsets(arr,index+1,output);


    }
    public static void main(String[] args){
        int arr[]={1,2,3};
        int res[]=new int[0];
        printArraySubsets(arr,0,res);
    }
}
