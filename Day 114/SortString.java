import java.util.Arrays;

public class SortString {
    public static String sort(String str){
        str.toLowerCase();
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String args[]){
        String str="helloworld";
        System.out.println(sort(str));
    }
}
