import java.util.*;
public class SortedArrayProblems {
    static void printOccurence(int[] arr){
        int count=1;
        for(int i=0;i< arr.length-1;i++){
           if(arr[i]==arr[i+1]){
               count++;
           }
           else{
               System.out.println(arr[i]+ " - "+count);
               count=1;
           }
        }
         System.out.println(arr[arr.length-1]+ " - "+ count);
    }
    static void printRepeatedOccurence(int[] arr){
        int count=1;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                if(count>1)
                     System.out.println(arr[i]+ " - "+count);
                count=1;
            }
        }
        if(count>1)
                System.out.println(arr[arr.length-1]+ " - "+ count);


    }
    static void printUnique(int[] arr){
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                count++;
            else{
                if(count==1)
                    System.out.println(arr[i]+ "-  1");
                count=1;
            }

        }
        if(count==1)
            System.out.println(arr[arr.length-1]+" - 1");

    }
    static void printMaxUniqueElement(int[] arr){
        int count=1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==arr[i-1])
                count++;
            else{
                if(count==1){
                    System.out.println(arr[i]);
                    return;}
                count=1;

            }
        }
        if(count==1)
            System.out.println(arr[0]);

    }
    static void printMinUniqueElement(int[] arr){
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                count++;
            else{
                if(count==1){
                System.out.println(arr[i]);
                return;}
                count=1;
                }
            }
        if(count==1)
                 System.out.println(arr[arr.length-1]);
        }



    static void printMaxOccurenceElement(int[] arr){
        for(int i= arr.length-1;i>0;i--){
                if(arr[i]==arr[i-1]) {
                        System.out.println(arr[i]);
                        return;
                }
        }
    }
    static void printMinOccurenceElement(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
                return;
            }

        }

    }
    static void printPairs(int[] arr){
        System.out.println();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++)
               System.out.println(arr[i]+ " "+arr[j]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        printOccurence(arr);
        System.out.println();
        printUnique(arr);
        System.out.println();
        printRepeatedOccurence(arr);
        System.out.println();
        printMaxUniqueElement(arr);
        System.out.println();
        printMinUniqueElement(arr);
        System.out.println();
        printMinOccurenceElement(arr);
        System.out.println();
        printMaxOccurenceElement(arr);
        System.out.println();
        printPairs(arr);

    }
}
