public class Sum {
public static int sumOfdigits(int n){
    if(n<10)
        return n;

    return (n%10)+sumOfdigits(n/10);

}
public static void main(String[] args){
    System.out.println(sumOfdigits(23498));
}
}
