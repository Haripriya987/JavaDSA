public class CompressString {

    public static String compress(String str){
        String res="";
        int count=1;
        int i=0;
        for(;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                res+=str.charAt(i);
                if(count>1)
                    res+=count;

                count=1;
            }

        }
        res+=str.charAt(i);
        if(str.charAt(i-1)==str.charAt(i)){
            res+=count;
        }





        return  res;
    }

    public static void main(String[] args){
        String s="aaaaabbbbb";
        System.out.println(compress(s));
    }
}
