public class Lottery {
    public static void main(String args[]){
        int s=9;
        int t=3;
        int arr[]=new int[t];
        int sum=s-1;
        for(int i=t-1;i>=0;i--){
            if(i==0){
                arr[i]=sum+1;
                break;
            }
            if(sum>=9){
                arr[i]=9;
                sum-=9;
            }
            else{
                arr[i]=sum;
                sum=0;
            }

        }
        for(int z:arr){
            System.out.print(z);
        }
    }
}
