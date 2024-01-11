public class SortingWay {

    public static String isPossibleToSort(int arr[],int n){

        for(int i=0;i<n-1;i++){
            if(arr[i+1]==arr[i]-1){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]!=i)
                return "NO";
        }
        return "YES";
    }
    public static void main(String args[]){
        int arr[]={1 ,0 ,3 ,2};
        int n=arr.length;
        System.out.println(isPossibleToSort(arr,n));
    }
}
