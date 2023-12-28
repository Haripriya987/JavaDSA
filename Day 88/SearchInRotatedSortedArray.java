public class SearchInRotatedSortedArray {
    public static int findElement(int arr[],int n,int key){
        int pivot=findPivot2(arr,0,n-1);

        if(pivot==-1){
            return binarySearch(arr,0,n-1,key);
        }


        if(arr[0]<=key)
            return binarySearch(arr,0,pivot,key);

        return binarySearch(arr,pivot+1,n-1,key);

    }
    public static int findPivot2(int arr[],int low,int high){ //0(logn)
        if(high<low)
            return -1;
        if(high==low)
            return low;
        int mid=(low+high)/2;

        if(mid<high  && arr[mid]>arr[mid+1])
            return mid;
        else if(mid>low  && arr[mid]<arr[mid-1])
            return mid-1;

        if(arr[low]>=arr[mid])
            return findPivot2(arr,low,mid-1);

        return findPivot2(arr,mid+1,high);


    }



    public static int findPivot(int arr[],int n){//0(n)
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])

                return i;
        }

        return -1;
    }

    public static int binarySearch(int arr[],int low,int high,int key){


        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key)
                return mid;

            else if(arr[mid]>key)
                high=mid-1;

            else
                low=mid+1;


        }
        return -1;

    }


    public static int findElementInSecond(int arr[],int low,int high,int key){//0(logn)

        if(low>high)
            return -1;
        int mid=(low+high)/2;

        if(arr[mid]==key)
            return mid;

        if(arr[low]<=arr[mid]){
            if(arr[low]<=key && key<arr[mid]){
                return findElementInSecond(arr,low,mid-1,key);
            }

            return findElementInSecond(arr,mid+1,high,key);
        }
        if(arr[mid]<=key && key>=arr[high])
            return findElementInSecond(arr,mid+1,high,key);

        return findElementInSecond(arr,low,mid-1,key);




    }

    public static int LinearSearch(int arr[],int key){//0(n)
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }

        return -1;
    }



    public static void main(String args[]) {
        int arr[]={5,6,7,8,9,1,2,3};
        System.out.println(findElement(arr,8,6));

        System.out.println(findElementInSecond(arr,0,7,6));
        System.out.println(LinearSearch(arr,6));
    }
}

