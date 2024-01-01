public class printSubSequences {
    public static String[] findSubSequences(String str){
        if(str.length()==0){
            String ans[]={""};
            return ans;
        }
        String smallAns[]=findSubSequences(str.substring(1));
        String ans[]=new String[2*smallAns.length];

        int k=0;
        for(int i=0;i<smallAns.length;i++){
            ans[k++]=smallAns[i];
        }
        for(int i=0;i< smallAns.length;i++){
            //ans[i+smallAns.length]
            ans[k++]=str.charAt(0)+smallAns[i];
        }
        return ans;
    }
    public static void main(String args[]){
        String str="xyz";
        String ans[]=findSubSequences(str);
        for(String s:ans){
            System.out.println(s);
        }

    }
}
