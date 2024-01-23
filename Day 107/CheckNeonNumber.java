import java.util.Scanner;
public class CheckNeonNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (isNeonNumber(number)) {
                System.out.println(number + " is a Neon Number.");
            } else {
                System.out.println(number + " is not a Neon Number.");
            }

            scanner.close();
        }

        // Function to check if a number is a Neon Number
        public static boolean isNeonNumber(int num) {
            int square = num * num;
            int sum = 0;

            while (square != 0) {
                sum += square % 10;
                square /= 10;
            }

            return sum == num;
        }
    }

