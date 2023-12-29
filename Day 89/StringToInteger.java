public class StringToInteger {
    public static int changeStringToInteger(String str){
        if(str.length()==1){
            return str.charAt(0)-'0';
        }

        int res=changeStringToInteger(str.substring(0,str.length()-1));
        int last=str.charAt(str.length()-1)-'0';

      return res*10+last;

    }
    public static void main(String[] args){
        String str="1234";
        System.out.println(changeStringToInteger(str));
    }
}
