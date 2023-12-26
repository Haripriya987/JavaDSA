public class ReplaceOccurence {
    public static String replaceOccurences(String str,char o,char r){
        if(str.length()==0)
            return str;

        String ans="";
        if(str.charAt(0)==o)
           ans+=r;
        else
            ans+=str.charAt(0);

        return ans+replaceOccurences(str.substring(1),o,r);



    }

    public static void main(String[] args){
        String str="abacaz";ReplaceOccurence
        System.out.println(replaceOccurences(str,'a','q'));

    }
}
