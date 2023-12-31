public class CheckSorted {
    static boolean checkSorted(int arr[]){
        if(arr.length<=1)
            return true;

        int  small[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            small[i-1]=arr[i];
        }

       boolean ans=checkSorted(small);

        if(!ans){
            return false;
        }
        if(arr[0]<=arr[1]){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean checkSortedSecond(int arr[]){
        if(arr.length<=1)
            return true;

        if(arr[0]>arr[1]){
            return false;
        }
        int  small[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            small[i-1]=arr[i];
        }

        boolean ans=checkSorted(small);
        return ans;

    }
        static boolean checkSortedBetter(int arr[],int index){
        if(index==arr.length-1)
            return true;

        if(arr[index]>arr[index+1])
            return false;

        boolean ans=checkSortedBetter(arr,index+1);
        return ans;


        }
        static boolean checkSortedBetter(int arr[]){
        return checkSortedBetter(arr,0);
        }

        public static int sumOfArray(int arr[]){
        return sumOfArray(arr,0);
        }
        private static int sumOfArray(int arr[],int index){
//        if(index==arr.length-1)
//            return arr[index];

            if(index==arr.length)
                return 0;

        int ans=arr[index]+sumOfArray(arr,index+1);
        return ans;


        }
        public static int checkElement(int arr[],int key){
          return checkElement(arr,key,0);
        }
    private static int checkElement(int arr[],int key,int index){
        if(index==arr.length){
            return -1;
        }

        if(arr[index]==key)
            return index;

        return checkElement(arr,key,index+1);

    }
    public static boolean checkElementExist(int arr[],int key){
        return checkElementExist(arr,key,0);
    }

    private static boolean checkElementExist(int arr[],int key,int index){
        if(index==arr.length){
            return false;
        }

        if(arr[index]==key)
            return true;

        return checkElementExist(arr,key,index+1);

    }


    public static void main(String[] args){
    int arr[]={1,2,7,8};
    System.out.println(checkSorted(arr));
        System.out.println(checkSortedSecond(arr));
        System.out.println(checkSortedBetter(arr));
        System.out.println(sumOfArray(arr));
        System.out.println(checkElement(arr,17));
        System.out.println(checkElementExist(arr,7));
    }
}
