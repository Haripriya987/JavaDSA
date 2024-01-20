package RecursionProblems;

import java.util.Arrays;

public class TriangleProblem {
    public static void perimeter(int arr[]){
        int a=-1,b=-1,c=-1;

        int n=arr.length;
        int maxPerimeter=-1;
        Arrays.sort(arr);

        for(int i=n-1;i>=2;i--){
            int x=arr[i];
            int y=arr[i-1];
            int z=arr[i-2];
            int currentPerimeter=x+y+z;
            if(x<y+z && (currentPerimeter>maxPerimeter ||  currentPerimeter==maxPerimeter ) ){
                a=z;
                b=y;
                c=x;
                maxPerimeter=currentPerimeter;
            }

        }

        if(maxPerimeter==-1){
            System.out.println(-1);
        }
        else{
            System.out.println(a+" "+b+" "+c);
        }
    }
    public static void main(String args[]){
        int arr[]={2,2,4};
        int arr2[]={1,1,1,3,3 };
        perimeter(arr2);

    }

}
