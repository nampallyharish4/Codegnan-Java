public class MaxEnd3Loop {
    public static int[] maxEnd3(int[] nums) {
        int max = (nums[0] > nums[nums.length - 1]) ? nums[0] : nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = max;
        }
        return nums;
    }
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {11, 5, 9};
        int[] arr3 = {2, 11, 20};

        maxEnd3(arr1);
        maxEnd3(arr2);
        maxEnd3(arr3);

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }
}
