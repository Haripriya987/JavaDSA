import java.util.Scanner;
public class RemoveCharacters {
    public static String removeCharacters(String s,char ch){
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ch)
            res+=s.charAt(i);
            }

            return res;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.next();
        char ch=in.next().charAt(0);

        System.out.println(removeCharacters(str,ch));

    }
}
