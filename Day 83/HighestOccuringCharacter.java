import java.util.Locale;

public class HighestOccuringCharacter {
    public static char printHighestOccuringCharacter(String str) {
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int value=c-'a';
            arr[value]++;

        }
        int max=0;
        char ch='\0';

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int value=c-'a';
            if(arr[value]>max){
                max=value;
                ch=c;
            }

        }




    return ch;
    }

    public static void main(String[] args){
        String str="abbbcabccda";
        System.out.println(printHighestOccuringCharacter(str));
    }
}
