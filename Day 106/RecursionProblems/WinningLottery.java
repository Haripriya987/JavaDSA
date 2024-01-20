package RecursionProblems;

public class WinningLottery {
    public static void main(String args[]){
        int sum=9;
        int numOfDigits=2;
        int a[]=new int[numOfDigits];
        int value=sum-1;
        for(int i=numOfDigits-1;i>=0;i--){
            if(i==0) {
                a[i] = value + 1;
                break;
            }
            if(value>=9){
                a[i]=9;
                value-=9;

            }
            else{
                a[i]=value;
                value=0;
            }

        }
        for(int z:a){
            System.out.print(z);
        }
        System.out.println();
    }
}
