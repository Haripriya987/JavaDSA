public class SubString {
    public static void main (String args[]){
        String str1="HelloWorld";
        String str2="hello";
        System.out.println(findSubString(str1,str2));

    }

    public static boolean findSubString(String str1,String str2) {
        for(int i=0;i<str1.length()-str2.length();i++){
            String temp=str1.substring(i,str2.length());
            if(temp.equals(str2))
                return true;

        }
        return false;
    }
}
