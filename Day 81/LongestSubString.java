import java.util.*;
public class LongestSubString {

    public static int lengthOfLongestSubString(String str){
        Set<Character>  hs=new HashSet<>();
        int max=0;
        int l=0;
        for(int r=0;r<str.length();r++){
            if(!hs.contains(str.charAt(r))){
                hs.add(str.charAt(r));
                max=Math.max(max,r-l+1);
            }
            else{
                while(str.charAt(l)!=str.charAt(r)){
                    hs.remove(str.charAt(l));
                    l++;
                }
                hs.remove(str.charAt(l));
                l++;
                hs.add(str.charAt(r));
            }
        }
        return max;
    }

    public static void main(String[] args){
    String str="abcaasxsdgwwafeg";
    System.out.println(lengthOfLongestSubString(str));


    }
}
