import java.util.*;
public class FirstReverse {
    public static String FirstReverse(String str) {

        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res+=str.charAt(i);
        }
        return res;
    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}
