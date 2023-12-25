public class FindingIndexes {
    public static int firstIndexHelper(int arr[],int num,int index){
        if(index== arr.length)
            return -1;

        if(arr[index]==num)
            return index+1;
        else
           return  firstIndexHelper(arr,num,index+1);


    }
    public static int lastIndexHelper(int arr[],int num,int index){
        if(index==arr.length)
            return -1;
        int ans=lastIndexHelper(arr,num,index+1);
        if(ans!=-1){
            return ans;
        }
        if(arr[index]==num)
            return index+1;
        else
            return -1;

    }
public static int firstIndex(int arr[],int num){
        return firstIndexHelper(arr,num,0);
}
    public static int lastIndex(int arr[],int num){
        return lastIndexHelper(arr,num,0);
    }


    public static void main(String[] args){
        int arr[]={1,4,6,3,4,6,8,0,1,6,7};
    System.out.println(firstIndex(arr,6));
        System.out.println(lastIndex(arr,6));


    }
}
