public class ReturnKeypadDemo {
public static String getString(int d){
    if(d==2)
        return "abc";
    else if (d==3) {
        return "def";
    }
    else if (d==4) {
        return "ghi";
    }
    else if (d==5) {
        return "jkl";
    }
    else if (d==6) {
        return "mno";
    }
    else if (d==7) {
        return "pqrs";
    }
    else if (d==8) {
        return "tuv";
    }
    else if (d==9) {
        return "wxyz";
    }
    else
        return " ";


}

public static void printKeypad(int n,String str){

    if(n==0) {
        System.out.println(str);
        return ;
    }

    int lastdigit=n%10;
    int number=n/10;
    String option=getString(lastdigit);
    for(int i=0;i<option.length();i++){
        printKeypad(number,option.charAt(i)+str);
    }

}
public static int keypad(int n,String[] arr){
    if(n==0){
        arr[0]=" ";
        return 1;
    }

    int lastnum=n%10;
    int number=n/10;
    int answer=keypad(number,arr);
    String options=getString(lastnum);

   for(int i=0;i<options.length()-1;i++){
       for(int j=0;j<answer;j++){
           arr[j+((i+1)*answer)]=arr[j];
       }
   }
   int k=0;
    for(int i=0;i<options.length();i++){
        for(int j=0;j<answer;j++){
           arr[k]=arr[k]+options.charAt(i);
           k++;
        }
    }


    return answer*options.length();
}
public static void main(String[] args){
    String arr[]=new String[1000];
    int n=23;
    int count=keypad(n,arr);
//    for(int i=0;i<count;i++){
//        System.out.println(arr[i]);
//    }
    printKeypad(n," ");
}

}
