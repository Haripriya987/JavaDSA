public class NDigitSum {

    public static void findDigitNum(String res,int n,int target){
        if(n>0 && target>=0){
            char d='0';
            if(res.equals("")){
                d='1';
            }
            while(d<='9'){
                findDigitNum(res+d,n-1,target-(d-'0'));
                d++;
            }
        }
        else if(n==0 && target==0){
            System.out.println(res+" ");
        }

        return;
    }

    public static void main(String[] args){
        int n=2;
        int target=8;
        findDigitNum("",n,target);
    }
}
