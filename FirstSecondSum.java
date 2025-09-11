public class FirstSecondSum {
    public static int sumFirstTwo(int[] arr) {
        if (arr.length >= 2) {
            return arr[0] + arr[1];
        } else {
            throw new IllegalArgumentException("Array must have at least two elements!");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 40, 60};

        try {
            int sum = sumFirstTwo(arr);
            System.out.println("Sum of first and second elements: " + sum);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
