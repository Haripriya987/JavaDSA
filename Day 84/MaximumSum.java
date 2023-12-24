public class MaximumSum {
    public static int maxSum(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        int s1=0;
        int s2=0;
        int max=0;

        while(i<arr1.length && j<arr2.length){

            if(arr1[i]==arr2[j]){
                max+=Math.max(s1,s2)+arr1[i];
                s1=0;
                s2=0;
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j]){
                s2+=arr2[j];
                j++;

            }
            else{
                s1+=arr1[i];
                i++;
            }

        }

        while(i<arr1.length){
            s1+=arr1[i];
            i++;
        }

        while(j<arr2.length){
            s2+=arr2[j];
            j++;
        }

        max+=Math.max(s1,s2);

        return max;
    }

    public static void main(String[] args){
        int arr1[]={1,5,10,15,20,25};
        int arr2[]={2,4,5,9,15};
        System.out.println(maxSum(arr1,arr2));

    }
}
