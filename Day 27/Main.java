import java.util.Stack;

public class Main {
    static int min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
        }

        return min;
    }
    static int max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }

        return max;
    }
    static void arrayMinMaxSum(int arr[]){
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr2.length;i++){
            int value=0;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    value+=arr[j];
                }
            }
            arr2[i]=value;
        }
        System.out.println("Min Sum : "+min(arr2));
        System.out.println("Max Sum : "+max(arr2));

    }
    static void closestSmallElements(int[] arr){
        Stack<Integer> stack = new Stack();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()>arr[i])
                stack.pop();

                if(stack.isEmpty())
                    System.out.print(-1+" ");
                else
                    System.out.print(stack.peek()+" ");
                stack.push(arr[i]);

        }

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arr[]={4,5,9,8,0};
        arrayMinMaxSum(arr);
        closestSmallElements(arr);

    }
}
/*
   void returnLastNNodes2(int n){
        if(head==null){
            return;
        }
        Node slow=head;
        Node fast=head;
        int count=1;
        while(fast.next!=null && fast.next.next!=null){
            count++;
            slow=slow.next;
            fast=fast.next.next;
        }
        int sizeN=0;
        if(fast.next!=null){
             sizeN=2*count;
        }
        else {
             sizeN=2*count-1;
        }
        int temp=sizeN-n;
        int traverse=0;
        if(temp==count){
            traverse=0;
        }
        else{
            traverse=(temp-count)-n;
        }
        for(traverse=0;traverse<=0;traverse++){
            slow=slow.next;
        }
//
//        int traverse=1;
//
//        while(traverse<(sizeN-count)){
//            slow=slow.next;
//            traverse++;
//        }

        while(slow!=null){
            System.out.print(slow.data+" ");
            slow=slow.next;
        }

        System.out.println();
    }


 */



/*        */
