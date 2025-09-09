import java.util.Scanner;
public class SumofArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int size = scanner.nextInt();
        System.out.println("Enter Number of Columns: ");
        int size2 = scanner.nextInt();
        int[][] numbers = new int[size][size2]; 
        System.out.println("Enter Numbers: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The numbers you entered are: ");
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = 0; j < size2; j++) {
                sum += numbers[i][j];
            }
            System.out.println("Sum of Row " + i + " is: " + sum);
        }
        scanner.close();
    }
}


//ROW WISE SUM

// ROW WISE PRODUCT
//COLUMN WISE SUM
//COLUMN WISE PRODUCT
//MULTIPY TWO  MATRIX
//ADD TWO MATRIX