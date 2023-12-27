public class SearchElementInRotatedSortedArray {
public static int searchElementRA(int arr[],int n,int key){
    int pivot=findPivot(arr,0,n-1);

    if(pivot==-1)
        return binarySearch(arr,0,n-1,key);

    if(arr[pivot]==key){
        return pivot;
    }
    if(arr[0]<=key)
        return binarySearch(arr,0,pivot-1,key);

    return binarySearch(arr,pivot+1,n-1,key);
}
public static int findPivot(int arr[],int first,int last){

    if(last<first)
        return -1;
    if(first==last)
        return first;

    int mid=first+(last-first)/2;
    if(mid<last && arr[mid]>arr[mid+1])
        return mid;
    if(mid>first && arr[mid]<arr[mid-1])
        return mid-1;
    if(arr[first]>=arr[last])
        return findPivot(arr,first,mid-1);


    return findPivot(arr,mid+1,last);
}

public static int binarySearch(int[] arr,int first,int last,int key){
    if(last<first)
        return -1;

    int mid=first+(last-first)/2;

    if(arr[mid]==key)
        return mid;
    if(key>arr[mid])
        return binarySearch(arr,(mid+1),last,key);

    return binarySearch(arr,first,(mid-1),key);

}


public static int secondWay(int[] arr,int l,int h,int key){
    if (l > h)
        return -1;

    int mid = (l + h) / 2;
    if (arr[mid] == key)
        return mid;

    /* If arr[l...mid] first subarray is sorted */
    if (arr[l] <= arr[mid]) {
           
        if (key >= arr[l] && key <= arr[mid])
            return secondWay(arr, l, mid - 1, key);

        return secondWay(arr, mid + 1, h, key);
    }


    if (key >= arr[mid] && key <= arr[h])
        return secondWay(arr, mid + 1, h, key);

    return secondWay(arr, l, mid - 1, key);
}

public static void main(String[] args){
    int arr[]={3,4,5,1,2};
    int arr2[]={1,2,3,4,5};

        System.out.println(secondWay(arr2,0,4,3));
    System.out.println(secondWay(arr2,0,4,5));
    System.out.println(secondWay(arr2,0,4,1));
System.out.println();
    System.out.println(searchElementRA(arr2,5,3));
    System.out.println(searchElementRA(arr2,5,5));
    System.out.println(searchElementRA(arr2,5,1));


}


}
