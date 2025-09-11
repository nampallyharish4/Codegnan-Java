public class CommonEndArraysOfArrays {

    public static boolean commonEnd(int[][] arrays) {
        int firstA = arrays[0][0];
        int lastA = arrays[0][arrays[0].length - 1];

        int firstB = arrays[1][0];
        int lastB = arrays[1][arrays[1].length - 1];

        return (firstA == firstB || lastA == lastB);
    }

    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 2, 3},
            {7, 3}
        };

        int[][] arr2 = {
            {1, 2, 3},
            {7, 3, 2}
        };

        int[][] arr3 = {
            {1, 2, 3},
            {1, 3}
        };

        System.out.println(commonEnd(arr1)); 
        System.out.println(commonEnd(arr2)); 
        System.out.println(commonEnd(arr3)); 
    }
}
