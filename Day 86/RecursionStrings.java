public class RecursionStrings {
    public static String  removeCharacters(String str,char ch){
        if(str.length()==0){
            return str;
        }
        String ans="";
        if(str.charAt(0)!=ch){
            ans+=str.charAt(0);
        }
        String small=removeCharacters(str.substring(1),ch);
        return ans+small;

    }
    public static void main(String[] args){
        String str="Hxellxox";
        System.out.println(removeCharacters(str,'x'));
    }

}
