import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ClosestSmallElement {
    public static void closestSmallElement(int[] arr){
        for(int i=0;i<arr.length;i++){
            int x=-1;
            for(int j=i-1;j>-1;j--){
                if(arr[i]>arr[j]){
                    x=arr[j];
                    break;
                }
            }
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void closestSmallElementWithStack(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek() > arr[i])
                st.pop();

            if(st.isEmpty())
                System.out.print(-1+" ");
            else
                System.out.print(st.peek()+" ");
            st.push(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int[] arr={2,3,5,1,6};
        closestSmallElement(arr);
        closestSmallElementWithStack(arr);


    }
}
