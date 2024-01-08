public class SmallStepsNumbers {
    static int sum=0;
    public static void  mergeSort(int arr[],int start,int end){
        if(start>=end)
            return;

        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,end);

    }
    public static void merge(int[] arr,int start,int end){
        int size=end-start+1;
        int res[]=new int[size];
        int mid=(start+end)/2;
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                res[k]=arr[i];
                sum+=((end-j+1)*(arr[i]));
                i++;
            }
            else{
                res[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            res[k++]=arr[i++];
        }
        while(j<=end){
            res[k++]=arr[j++];
        }


        int a=0;
        for(int z=start;z<=end;z++){
            arr[z]=res[a];
            a++;
        }

    }

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
    mergeSort(arr,0,5);
    System.out.println(sum);
    }
}
