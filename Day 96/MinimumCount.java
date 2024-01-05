public class MinimumCount {

    public static int getSquaresCount(int n){
        if(n<=3)
            return n;

        int res=n;
        for(int i=1;i*i<=n;i++){
            int temp=i*i;
            res=Math.min(res,1+getSquaresCount(n-temp));
        }
        return res;

    }

    public static void main(String[] args){
        int n=50;
        System.out.println(getSquaresCount(n));
    }
}
