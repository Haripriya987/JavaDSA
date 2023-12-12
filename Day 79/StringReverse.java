import java.util.Scanner;

public class StringReverse {
    public static String reverseWordWise(String str){
        int end=str.length();
        int i=str.length()-1;
        StringBuilder output= new StringBuilder();
        while(i>=0){
            if(str.charAt(i)==' '){
                output.append(str.substring(i + 1, end)).append(" ");
                end=i;
            }
            i--;
        }
        output.append(str.substring(i + 1, end));

     return output.toString();
    }
    public static String reverseEachWord(String str){
        String res="";
        int wordStart=0;
        int i=0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                int wordEnd=i-1;
                String reverse="";
                for(int j=wordStart;j<=wordEnd;j++){
                    reverse=str.charAt(j)+reverse;
                }
                res+=reverse+" ";
                wordStart=i+1;

            }
        }
        int wordEnd=i-1;
        String reverse="";
        for(int j=wordStart;j<=wordEnd;j++){
            reverse=str.charAt(j)+reverse;
        }
        res+=reverse+" ";

        return res;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str="abc xy pqr";
        String res=reverseWordWise(str);
        System.out.println(res);
        System.out.println(reverseEachWord(str));
    }
}

