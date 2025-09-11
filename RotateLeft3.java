public class RotateLeft3 {
    public static void rotateLeft3(int[] nums) {
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {5, 11, 9};
        int[] arr3 = {7, 0, 0};

        rotateLeft3(arr1);
        rotateLeft3(arr2);
        rotateLeft3(arr3);

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }
}
