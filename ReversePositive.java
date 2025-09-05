import java.util.Scanner;
public class ReversePositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();
        int original = number;
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        if (reverse<0) {
            reverse = reverse * -1;
        System.out.println("Reverse of " + original + " is " + reverse);
        }
        scanner.close();
    }
}