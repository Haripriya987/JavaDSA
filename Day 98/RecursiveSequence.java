public class RecursiveSequence {

    public static long sequence(int N){
        long val=1;
        long res=0;
        for(int i=1;i<=N;i++){
            long z=1;
            for(int j=1;j<=i;j++){
                z*=val;
                val++;
            }
            res+=z;
        }

        return res;


    }
    public static long recursiveSequence(int N){
        if(N==1)
            return N;

        int tot=(N*(N-1))/2;
        int res=1;
        for(int m=tot+1;m<=tot+N;m++){
            res*=m;
        }

        return res+recursiveSequence(N-1);

    }
    public static void main(String[] args){
        System.out.println(sequence(5));
        System.out.println(recursiveSequence(5));
    }
}
