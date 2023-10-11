import java.util.Arrays;

public class MergeArrays {
    static int[] mergeArrays(int[] ar1,int[] ar2){
        int[] res=new int[ar1.length+ar2.length];
        int i=0,j=0,k=0;
        while(i<ar1.length && j<ar2.length){
            if(ar1[i]<ar2[j]){
                res[k++]=ar1[i++];
            }
            else{
                res[k++]=ar2[j++];
            }
        }
        while(i< ar1.length){
            res[k++]=ar1[i++];
        }
        while(j<ar2.length){
            res[k++]=ar2[j++];
        }

        return res;
    }
    public static void main(String[] args){
            int a1[]={1,6,9};
            int a2[]={2,4,8,11};
            int res[]=mergeArrays(a1,a2);
            for(int i=0;i<res.length;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
    }
}
