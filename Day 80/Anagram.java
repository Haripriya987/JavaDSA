import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length())
            return false;

        s.toLowerCase();
        t.toLowerCase();
        char[] arrs=s.toCharArray();
        char[] arrt=t.toCharArray();
        Arrays.sort(arrs);
        Arrays.sort(arrt);
        for(int i=0;i<s.length();i++){
            if(arrs[i]!=arrt[i])
                return false;
        }

        return true;
    }
    public static void main(String[] args){
        String s="pat";
        String t="tap";
        System.out.println(isAnagram(s,t));

    }
}
