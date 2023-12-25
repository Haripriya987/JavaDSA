public class CheckNumberInArray {
     public static boolean checkNumberHelper(int[] arr,int key,int index){
         if(index==arr.length)
             return false;

         if(arr[index]==key)
             return true;
         else
             return checkNumberHelper(arr,key,index+1);


     }

    public static boolean checkNumber(int[] arr,int key){
        return checkNumberHelper(arr,key,0);
    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");
int arr[]={2,45,68,23,22};
System.out.println(checkNumber(arr,45));

    }
}
