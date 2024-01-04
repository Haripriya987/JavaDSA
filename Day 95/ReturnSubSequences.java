public class ReturnSubSequences {
    public static String[] subsequences(String str){
        if(str.length() == 0) {
            String[] ans = {""};
            return ans;
        }

        String[] smallAns =subsequences(str.substring(1));
        String[] ans =new String[2*smallAns.length];

        int k=0;
        for(int i=0;i<smallAns.length;i++){
            ans[k]=smallAns[i];
            k++;
        }

        for(int i=0;i<smallAns.length;i++){
            //ans[i+smallAns.length]
            ans[k]=str.charAt(0)+smallAns[i];
            k++;
        }

        return ans;
    }
    public static void main(String[] args){
        String str="abcdef";
        String[] ans =subsequences(str);
        int count=0;
        for(String s:ans){
            if(s.length()==4) {
                count++;
                System.out.println(s);
            }
        }
        System.out.println(count);
    }

}
