import java.util.Arrays;
import java.util.Scanner;

public class TrainPlatforms {

    public static int findPlatforms(int arr[],int dep[],int n){
        int platforms=1;
        int result=1;
        for(int i=0;i<n;i++){
            platforms=1;
            for(int j=0;j<n;j++){
                if(i!=j){

                    if(arr[i]>=arr[j]  && dep[j]>=arr[i])
                        platforms++;

                }

                result=Math.max(result,platforms);
            }
        }



        return result;
    }

    public static int findPlatformsSecond(int ar[],int de[],int n){
        Arrays.sort(ar);
        Arrays.sort(de);

        int platform=1,result=1;
        int i=1,j=0;
        while(i<n && j<n){
            if(ar[i]<=de[j]){
                platform++;
                i++;
            }
            else if(ar[i]>de[j]){
                platform--;
                j++;

            }

            result=Math.max(platform,result);
        }
        return result;
    }

    public static void main(String[] args){
        int arr[] = { 100, 300, 500 };
        int dep[] = { 900, 400, 600 };
        int n = 3;
        System.out.println(findPlatforms(arr, dep, n));
        System.out.println(findPlatformsSecond(arr, dep, n));


    }
}
