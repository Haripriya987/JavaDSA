public class PrintKeypad {
    public static String getString(int a){
        if(a==2)
            return "abc";
        if(a==3)
            return "def";
        if(a==4)
            return "ghi";
        if(a==5)
            return "jkl";
        if(a==6)
            return "mno";
        if(a==7)
            return "pqrs";
        if(a==8)
            return "tuv";
        if(a==9)
            return "wxyz";

        return "abc";
    }
    private static void printKeypad(int n, String output) {
        if(n==0) {
            System.out.println(output);
            return ;
        }
        int lastDigit=n%10;
        int smallNumber=n/10;
        String options=getString(lastDigit);
        for(int i=0;i<options.length();i++){
            printKeypad(smallNumber,options.charAt(i)+output);
        }
    }

    public static void main(String args[]){
        int n=23;
        printKeypad(n,"");
    }

}
