public class SmallStepsNumbers {
    public static int addSmall(int arr[],int index,int res){
        if(index==arr.length)
            return res;



        for(int i=0;i<index;i++){
            if(arr[i]<arr[index])
                res+=arr[i];
        }

        return addSmall(arr,index+1,res);
    }
    public static void main(String[] args){
    int arr[]={1,5,3,6,4,7};
    System.out.println(addSmall(arr,0,0));

    }
}
