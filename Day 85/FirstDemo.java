//import java.util.Scanner;
public class FirstDemo{
  public static int power(int m,int n){
    if(n==1)
    return m;

    return m*power(m, n-1);

  }
  public static String printNumbers(int n){
    if(n==1)
      return n+" ";
      
      return n+" "+printNumbers(n-1);
  }
  public static int countDigits(int n){
    if(n==0)
     return 0;

     return 1+countDigits(n/10);

  }
  public static int printFibonnaci(int n){
    // if(n==0  || n==1){
    // System.out.print(n+" ");
    // return;
    // }

    // printFibonnaci(n-1);
    //  System.out.print(n+" ");
    
    // printFibonnaci(n-2);
    //  System.out.print(n+" ");
    //  int count=0;
     
    //   if(count==n-2){
    //     return;
    //   }

    if(n==0 || n==1)
    return n;

    return printFibonnaci(n-1)+printFibonnaci(n-2);
      


  }

  public static void main(String[] args){
    //Scanner in=new Scanner(System.in);
    System.out.println(power(2, 5));
    System.out.println(printNumbers(5));
    System.out.println(countDigits(155));
    System.out.println(printFibonnaci(5));
  }
}