public class rotateElements {
    private static int findElement(int arr[],int i,int pos){
        int n=arr.length;
        int index=(i+pos)%n;

        return arr[index];
    }

    public static void main(String[] args){
        int arr[]={0,1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(findElement(arr,5,8));
    }
    }
