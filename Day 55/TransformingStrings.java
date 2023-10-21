import java.util.Scanner;
public class TransformingStrings {
    static String adjustCharacters(String s){
        String t="";
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch<='9' && ch>='0'){
                num+=ch-48;
            }
            else{
                t+=ch;
            }
        }
        return num==0?t:t+num;
    }
    //In this first it will print all uppercase letters,then lowercase,then digits and special characters
    static String changeFormat(String s){
        String U="";
        String L="";
        String N="";
        String S="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch<='Z' && ch>='A')
                U+=ch;
            else if(ch<='z' && ch>='a')
                L+=ch;
            else if(ch<='9' && ch>='0')
                N+=ch;
            else
                S+=ch;
        }

        return U+L+N+S;
    }
//In this we have to add * before whenver we find character a

    static String addCharacterBeforeA(String s){
        String t="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                t+="*a";
            }
            else{
                t+=ch;
            }
        }
        return t;
    }
    //Changing cases If a character is A-Z then change into a-z viceversa
    static String interchangeCases(String s){
        String t="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch<='Z' && ch>='A'){
                t=t+(char)(ch+32);
            }
            else if(ch<='z' && ch>='a'){
                t+=(char)(ch-32);
            }
            else{
                t+=ch;
            }

        }
        return t;
    }
    static String removeFirstLastSpace(String s){
        String t="";
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ') {
                start = i;
                break;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ') {
                end = i;
                break;
            }
        }
        for(int i=start;i<=end;i++){
            t=t+s.charAt(i);
        }
        return t;
    }
    static String removeExtraSpaces(String s){
        String t=removeFirstLastSpace(s);
        String n="";
        for(int i=0;i<t.length();i++){
         if( t.charAt(i)!=' ' || (t.charAt(i)==' ' && t.charAt(i+1)!=' '))
             n+=t.charAt(i);
        }
        return n;
    }
    static boolean findSubstringOrNot(String s,String sub){
        int i=0;
        int j=0;

        while(i<s.length()){
            if(sub.charAt(j)==s.charAt(i)){
                i++;
                j++;
            }
            else
            i++;
        }
        return j==sub.length()?true:false;
    }
public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String sub="hackerrank";
        System.out.println(adjustCharacters(s));
        System.out.println(changeFormat(s));
    System.out.println(addCharacterBeforeA(s));
    System.out.println(interchangeCases(s));
    System.out.println(removeFirstLastSpace(s));
    System.out.println(removeExtraSpaces(s));
    System.out.println(findSubstringOrNot(s,sub));

    }
}