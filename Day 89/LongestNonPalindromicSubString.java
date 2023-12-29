public class LongestNonPalindromicSubString {

    public static boolean isPalindrom(String str){
        int n=str.length();

        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1))
                return false;
        }
        return true;
    }

    static int maxLengthPalindrome(String str){

        int n=str.length();
        char ch=str.charAt(0);

        int i=1;
        for(;i<n;i++){
            if(str.charAt(i) != ch)
                break;
        }
        if(i==n)
            return 0;

        if(isPalindrom(str))
            return n-1;

        return n;

    }


    public static void main(String[] args){
        String str="abba";
        System.out.println(maxLengthPalindrome(str));
    }
}
