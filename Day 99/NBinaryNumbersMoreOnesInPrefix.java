public class NBinaryNumbersMoreOnesInPrefix {
    public static void findNumbers(String str,int n,int ones,int zeros){
        if(ones<zeros)
            return;

        if(n==0){
            System.out.println(str);
            return;
        }
        findNumbers(str+'1',n-1,ones+1,zeros);
        findNumbers(str+'0',n-1,ones,zeros+1);

    }
    public static void main(String[] a){
        findNumbers("",4,0,0);
    }
}
