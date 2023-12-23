public class RemoveConsecutive {

    public static String removeRepeatedCharacters(String str){
        String res="";

        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1))
                res+=str.charAt(i);
        }

        res=res+str.charAt(str.length()-1);


        return res;
    }
    public static void main(String args[]) {
        String s = "aaaaa ";
        String val=removeRepeatedCharacters(s);
        System.out.println(val);
    }
}
