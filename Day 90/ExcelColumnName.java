public class ExcelColumnName {
 static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void convertColumnNumberToString(int num ){

        StringBuilder str=new StringBuilder();
        while(num>0){
            int rem=num%26;

            if(rem==0){
                str.append("Z");
                num=(num/26)-1;


            }
            else{
                str.append((char)((rem-1)+'A'));
                num=num/26;

            }

        }
        System.out.println(str.reverse());
    }
public static void convertColumnNumberToStringSecondWay(int num){

        int[] arr=new int[10000];
        int i=0;

        while(num>0){
            arr[i]=num%26;
            num/=26;
            i++;
        }
        for(int j=0;j<i-1;j++){

            if(arr[j]<=0){
                arr[j]+=26;
                arr[j+1]=arr[j+1]-1;
            }
        }
        for(int j=i;j>=0;j--){
            if(arr[j]>0)
                System.out.print((char)('A'+arr[j]-1));

        }
        System.out.println();


}
    public static String num_recurive(int num){
        if(num<26)
            return Character.toString(alpha.charAt(num-1));
        else{
            int q=Math.floorDiv(num,26);
            int r=num%26;
            if(r==0){
                if(q==1){
                    return Character.toString(alpha.charAt((26+r-1)%26));
                }
                else
                    return num_recurive(q-1) + alpha.charAt((26 + r-1)%26);
            }
            else
                return num_recurive(q) + alpha.charAt((26 + r-1)%26);
        }

    }


    public static void main(String[] args){
        convertColumnNumberToString(76);
        convertColumnNumberToStringSecondWay(76);
        System.out.println(num_recurive(76));
    }
}
