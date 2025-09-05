import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int first = 0;
        int second = 1;
        int next = 0;
        for (int i = 0; i < number; i++) {
            if (i <= 1) {
                next = i;
            }
            else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.println(next);
            scanner.close();
        }
    }
}
