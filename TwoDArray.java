public class TwoDArray {
    public static void main(String[] args) {
        int[][] numbers = {{100,110,45},{60,80}};
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("PRINTING ENHANCED FOR LOOP");
        for (int[] row:numbers){
            for (int x:row){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
