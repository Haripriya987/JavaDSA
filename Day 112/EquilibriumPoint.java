public class EquilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {
        long sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        long index=0;
        for(int i=0;i<n;i++){
            if(index==sum-index-arr[i]){
                return i+1;
            }
            else {
                index = index + arr[i];
            }
        }
        return -1;
    }
    public static  void main(String[] args){
        long arr[]={1,3,5,2,2};
        System.out.println(equilibriumPoint(arr,arr.length));
    }
}
