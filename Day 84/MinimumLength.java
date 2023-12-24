public class MinimumLength {
    public static String minimumLength(String s){

        int min=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        int count=0;
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') {
                if (min > count){
                    min=count;
                    count=0;
                    str=s.substring(start,i);
                    //System.out.println(str);

            }
                    start=i+1;

            }
            else{
            count++;
            }

        }

        if(min>count){
            str=s.substring(start,s.length());
        }

        return  str;
    }


    public static String minString(String s){
        String arr[]=s.split("\\s+");

        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(min> arr[i].length()){
                index=i;
                min= arr[i].length();
            }


        }
        return arr[index];


    }
    public static void main(String[] args){
        String str="abc de g";
        System.out.println(minimumLength(str));
        System.out.println(minString(str));


    }
}
