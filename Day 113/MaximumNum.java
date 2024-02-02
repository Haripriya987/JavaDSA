public class MaximumNum {
    static int extractMaximum(String S)
    {
        int max=-1;
        int sum=0;
        for(int i=0;i<S.length();i++){
            if(Character.isDigit(S.charAt(i))){
                sum=sum*10+Character.getNumericValue(S.charAt(i));
                max=Math.max(sum,max);
            }
            else if(!Character.isDigit(S.charAt(i))){
                sum=0;
            }

        }
        return max;
    }
    public static void main(String args[]){
        String str="100klh564abc365bg";
        System.out.println(extractMaximum(str));

    }
}
