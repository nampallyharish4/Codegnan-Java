public class TableMul {
    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            System.out.println("Multiplication table of " + number);
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
            System.out.println(); // Blank line between tables
        }
    }
}
