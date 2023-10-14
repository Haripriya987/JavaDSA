import java.util.*;
import java.util.Deque;

public class SlidingWindowProblem {

public static void main(String[] args){
//    int arr[]={12,14,15,20,9,8,12,14,8};
    int arr[]={15,16,21,16,14,12,13,16,18};
    maxSubOfK(arr,3);
}
    static void maxSubOfK(int[] arr,int k){
        Deque<Integer> dq=new ArrayDeque();
        for(int i=0;i<k;i++){
            while(dq.size()>0 && arr[i]>= arr[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        for(int i=k;i<arr.length;i++){
            System.out.print(arr[dq.peekFirst()]+ " ");

            while(dq.size()>0 && dq.peekFirst() <=i-k){
                dq.pollFirst();
            }

            while(dq.size()>0 && arr[i]>=arr[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        System.out.println(arr[dq.peekFirst()]);
    }
}
