
public class LightUpTheBulbs {
    public static int lightTheBulbs(int n,int x,int y,String str){
        int zeroCount=0;
        int i=0;
        if(str.charAt(i)=='0'){
            zeroCount++;
        }
        i=1;
        while(i<n-1){
            if(str.charAt(i)=='1' &&  str.charAt(i+1)=='0'){
                zeroCount++;
            }
            i++;
        }

       int min=Math.min(x,y);
        return zeroCount-1*min+y;
    }
    public static int lightTheBulbsAnotherWay(int n,int x,int y,String str){
        int cost=0;
        if(str.charAt(0)=='0'){
            cost+=x;
        }

        for(int i=1;i<n;i++){

             if( str.charAt(i)=='0' &&  str.charAt(i-1)=='1'){
                cost+=x;
            }
             if( str.charAt(i)=='1' &&  str.charAt(i-1)=='0'){
                cost+=y;
            }
        }
        return cost;
    }

    public static void main(String[] args){

       // String str="01000";
         String str="0011011100";

        System.out.println(lightTheBulbs(str.length(),1,10,str));
        System.out.println(lightTheBulbsAnotherWay(str.length(),1,10,str));

    }
}
//public static int lightTheBulbsAnotherWay(int n, int x, int y, String str) {
//    int cost = 0;
//
//    if (str.charAt(0) == '0') {
//        cost += x;
//    }
//
//    for (int i = 1; i < n; i++) {
//        if (str.charAt(i) == '0' && str.charAt(i - 1) == '1') {
//            // Check if there is no '1' between i-1 and i
//            int j = i - 1;
//            while (j >= 0 && str.charAt(j) == '1') {
//                cost -= y;
//                j--;
//            }
//            cost += x;
//        } else if (str.charAt(i) == '1' && str.charAt(i - 1) == '0') {
//            cost += y;
//        }
//    }
//
//    return cost;
//}
