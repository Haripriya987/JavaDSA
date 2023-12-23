public class ReverseEach {

    public static void reverseEach(String sentence){
        String arr[]=sentence.split("\\s+");
        for(int i=0;i<arr.length;i++){
            System.out.print(reverse(arr[i])+" ");
        }

    }
    public static String reverse(String str){
        String res="";
        for(int i=0;i<str.length();i++){

            res=str.charAt(i)+res;
        }

        return res;
    }

    public static void main(String args[]) {
        String sentence="abc     an  av ";
        System.out.println(sentence);
        reverseEach(sentence);
    }
}
