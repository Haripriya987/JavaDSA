public class PairStair {
    public static String modifyString(String str){
        if(str.length()<=1)
            return str;

        if(str.charAt(0)==str.charAt(1))
            return str.charAt(0)+"*"+modifyString(str.substring(1));
        else
            return str.charAt(0)+modifyString(str.substring(1));

    }
    public static void main(String args[]){
        String str="HHHHHHHHH";
        System.out.println(modifyString(str));
    }
}
