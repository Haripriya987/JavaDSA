import java.util.Scanner;
public class ReverseString {
    public static String reverseString(String stringdemo){
        String reverseString=" ";
        String a=stringdemo;
        for(int i=0;i<a.length();i++){
            reverseString=a.charAt(i)+reverseString;
        }

        return reverseString;
    }
    //Another approach
    public static String reverseString2(String string){
        String reverseString="";
        String a=string;
        for(int i=a.length()-1;i>=0;i--){
            reverseString+=a.charAt(i);
        }

        return reverseString;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.next();
        System.out.println(reverseString(str));
        System.out.println(reverseString2(str));
    }
}
