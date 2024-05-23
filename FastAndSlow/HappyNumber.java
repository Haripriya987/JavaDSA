package FastAndSlow;

public class HappyNumber{

  public static boolean isHappy(int num){

    int slow=num;
    int fast=num;

    do{
      slow=square(slow);
      fast=square(square(fast));
    }while(slow!=fast);

    return fast==1;
  }
  public static int square(int num){
    int s=0;
    while(num>0){
      int rem=num%10;
      s+=(rem*rem);
      num=num/10;
    }
    return s;
  }

  public static void main(String args[]){
 
    
  }

}