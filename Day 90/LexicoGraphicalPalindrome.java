public class LexicoGraphicalPalindrome {
    static int MAX_CHAR=26;
    public static String findPalindromicString(String str) {

        int len=str.length();
        int freq[]=new int[MAX_CHAR];
        countFreq(str,freq,len);
        boolean res=canMakePalindrome(freq,len);
        if(!res){
            return "No Palindromic String ";
        }
        String odd_s=findOddRemoveItsFrequency(freq);

        String front_str="",rear_str="";

        for(int i=0;i<MAX_CHAR;i++){
            String temp="";
            if(freq[i]!=0){
                char ch=(char)(i+'a');

                for(int j=1;j<=freq[i]/2;j++){
                    temp=temp+ch;
                }
                front_str=front_str+temp;
                rear_str=temp+rear_str;

            }
        }

        return (front_str+odd_s+rear_str);
    }

    private static String findOddRemoveItsFrequency(int[] freq) {
        String odd_s="";
        for(int i=0;i<MAX_CHAR;i++){
            if(freq[i]%2!=0){
                freq[i]--;
                odd_s=odd_s+(char)(i+'a');
                return odd_s;
            }
        }
        return odd_s;
    }

    private static boolean canMakePalindrome(int[] freq, int len) {
        int count_odd=0;
        for(int i=0;i<MAX_CHAR;i++){
            if(freq[i]%2!=0){
                count_odd++;
            }
        }
        if(len%2==0){
            if(count_odd!=0){
                return false;
            }
            return true;
        }
        else{
            if(count_odd!=1)
                return false;

            return true;

        }


    }

    private static void countFreq(String str, int[] freq, int len) {
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);
            int value=ch-'a';
            freq[value]++;
        }

    }


    public static void main(String[] args){
//        String str="malayalam";
        String str="madam";
        System.out.println(findPalindromicString(str));
    }


}
