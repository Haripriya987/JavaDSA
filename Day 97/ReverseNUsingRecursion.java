public class ReverseNUsingRecursion {


    private static int reverseUsingRecursion(int n, int rev) {
        if (n == 0)
            return rev;

        int rem = n % 10;
        if (rev >Integer.MAX_VALUE/10 || (rev ==Integer.MAX_VALUE/10 && rem > 7)) {
            return 0;
        }

        if (rev <Integer.MIN_VALUE/10 || (rev ==Integer.MIN_VALUE/10 && rem < -8)) {
            return 0;
        }

        int newReversedNumber = rev * 10 + rem;

        return reverseUsingRecursion(n / 10, newReversedNumber);
    }

    public static int reverse(int n) {
        return reverseUsingRecursion(n, 0);
    }


    public static void main(String[] args){
        System.out.println(reverse(1534236469));
    }
}


