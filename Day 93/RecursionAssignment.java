public class RecursionAssignment
{
    public static String replace(String str){
        if(str.length()<=1)
            return str;

        if(str.charAt(0)=='p' && str.charAt(1)=='i')
            return "3.14"+replace(str.substring(2));
        else
            return str.charAt(0)+replace(str.substring(1));
    }
    public static String removeX(String str){
        if(str.length()==0)
            return "";

        if(str.charAt(0)=='x')
            return removeX(str.substring(1));
        else
            return str.charAt(0)+removeX(str.substring(1));
    }
    public static int stringToInteger(String str){
        if(str.length()==1)
            return str.charAt(0)-'0';

        int res=stringToInteger(str.substring(0,str.length()-1));
        int last=str.charAt(str.length()-1)-'0';
        return res*10+last;
    }
public static String pairStair(String str){
        if(str.length()<=1)
            return str;

        if(str.charAt(0)==str.charAt(1))
            return str.charAt(0)+"*"+pairStair(str.substring(1));
        else
            return str.charAt(0)+pairStair(str.substring(1));

}
    public static void Hanoi(int n,char S,char A,char D){
        if(n==0)
            return;
        Hanoi(n-1,S,D,A);
        System.out.println(n+" "+S+"  -> "+D);
        Hanoi(n-1,A,S,D);

    }

    public static void main(String[] args){
        String str="xpipix";
       // System.out.println(replace(str));
        String str2="xx";
        System.out.println(removeX(str2));
        String str3="123";
      //  System.out.println(stringToInteger(str3));
        String s4="aaaa";
        System.out.println(pairStair(s4));
        Hanoi(3,'S','A','D');
    }
}
