public class BinarySearch {
    public static int bSearch(int arr[],int start,int end,int key){
        if(start>end){
            return -1;
        }

        int mid=(start+end)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            return bSearch(arr,start,mid-1,key);
        }
        else{
            return bSearch(arr,mid+1,end,key);
        }


    }
    public static void main(String args[]){
        int arr[]={1,2,4,5,7};
        System.out.println(bSearch(arr,0,arr.length-1,9));

    }
}
