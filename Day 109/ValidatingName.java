import java.util.Scanner;
import java.util.regex.Pattern;
public class ValidatingName {
    public static String nameValidation(String str) {
        String temp="^[a-zA-Z][0-9a-zA-Z_]{2,23}[^_]$";
        String res="";
        if(Pattern.matches(temp,str))
            res="true";
        else
            res="false";

        return res;
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(nameValidation(in.nextLine()));
    }
}
