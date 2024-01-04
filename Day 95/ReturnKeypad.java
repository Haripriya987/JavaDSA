public class ReturnKeypad {
    public static String getString(int a){
        if(a==2)
            return "abc";
        if(a==3)
            return "def";
        if(a==4)
            return "ghi";
        if(a==5)
            return "jkl";
        if(a==6)
            return "mno";
        if(a==7)
            return "pqrs";
        if(a==8)
            return "tuv";
        if(a==9)
            return "wxyz";

        return "abc";
    }
    private static int keypad(int n, String[] arr) {
        if(n==0) {
            arr[0] = " ";
            return 1;
        }

        int lastDigit=n%10;
        int small=n/10;
        int smallOutput=keypad(small,arr);
        String option=getString(lastDigit);

        for(int i=0;i<option.length()-1;i++){
            for(int j=0;j<smallOutput;j++){
               arr[j+(i+1)*smallOutput]=arr[j];

            }
        }
        int k=0;
        for(int i=0;i<option.length();i++){
           for(int j=0;j<smallOutput;j++){
               arr[k]=arr[k]+option.charAt(i);
                k++;
           }
        }

      return smallOutput*option.length();
        
    }


    public static void main(String args[]){
        int n=22;
        String[] arr=new String[1000];
        int count=keypad(n,arr);
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }

    }


}
