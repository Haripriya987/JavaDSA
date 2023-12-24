import java.util.*;
public class FindLeaders {
    public static void findLeaders(int arr[]){
        List<Integer> ls=new ArrayList<>();

        int n=arr.length;
//        for(int i=n-1;i>0;i--){
//            boolean flag=true;
//            for(int j=i+1;j<n;j++){
//                if(arr[i]<arr[j]){
//                    flag=false;
//                    break;
//                }
//
//            }
//            if(flag)
//                System.out.println(arr[i]);
//
//        }
////        ls.add(arr[n-1]);
////
////
////    int size=ls.size();
////        for(int j=size-1;j>=0;j--){
////            System.out.println(ls.get(j));
////        }

        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--) { //o(n)
            if(arr[i]>=max){
                System.out.print(arr[i]+ " ");
                max=Math.max(max,arr[i]);
            }
        }
    }



    public static void main(String[] args){
    int arr[]={3,12,34,2,0,-1};
    int arr2[]={13,17,5,4,6};
    findLeaders(arr2);

    }
}
