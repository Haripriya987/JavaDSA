import java.util.Scanner;
public class StringCharacterProblems {
    static int countVowels(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch))
                count++;
        }
        return count;
    }

    private static boolean isVowel(char ch) {
        if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u'|| ch =='A'|| ch =='E'|| ch =='I'|| ch =='O'|| ch =='U') {
            return true;
        }

        return false;
    }

    static int consonantCount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch<='Z'&& ch>='A')||(ch<='z'&& ch>='a')){
                if(!isVowel(ch))
                    count++;
            }
        }
        return count;
    }
    static int numberCount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch<='9'&&ch>='0')
                count++;
        }
        return count;
    }
    static int specialSymbolCount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!((ch<='9'&&ch>='0')||(ch<='Z'&& ch>='A')||(ch<='z'&& ch>='a')))
             count++;
        }
        return count;
    }
    static int spaceCount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ')
                count++;
        }
        return count;
    }
    static int countWords(String s){
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch==' '&&s.charAt(i+1)!=' ')
                count++;
        }
        return count+1;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(countVowels(str));
        System.out.println(consonantCount(str));
        System.out.println(numberCount(str));
        System.out.println(specialSymbolCount(str));
        System.out.println(spaceCount(str));
        System.out.println(countWords(str));
    }
}
