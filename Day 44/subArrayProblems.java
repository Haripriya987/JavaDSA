public class subArrayProblems {
    public static void printSubArraysOfSizeK(int[] a,int k){
        for(int i=0;i<=a.length-k;i++){
            for(int j=i;j<i+k;j++){
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }
    public static void subArraySum(int[] a,int k,int size){
        for(int i=0;i<a.length-size;i++){
            int sum=0;
            for(int j=i;j<i+size;j++){
                sum+=a[j];
            }
            if(sum==k){
                for(int j=i;j<i+size;j++){
                    System.out.print(a[j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void printAllSubArrays(int[] a){
        for(int size=1;size<=a.length;size++){
            printSubArraysOfSizeK(a,size);
        }
    }
public static void main(String[] args){
        int[] arr={1,2,3,0};
        subArraySum(arr,5,2);
        printAllSubArrays(arr);


}
}
