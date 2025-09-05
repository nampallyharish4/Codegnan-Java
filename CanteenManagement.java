import java.util.Scanner;
public class CanteenManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teaPrice = 10,coffeePrice = 15,sandwichPrice = 20;
        int teaQty = 0,coffeeQty = 0,sandwichQty = 0;
        int choice = 0;
        double taxRate=0.05;
        do{
            System.out.println("Canteen Management System");
            System.out.println("========1. View Menu=========");
            System.out.println("========2. Add Items=========");
            System.out.println("========3. View Bill=========");
            System.out.println("========4. Checkout and Exit=========");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("========View Menu=========");
                    System.out.println("1. Tea:  " + teaPrice);
                    System.out.println("2.Coffee: " + coffeePrice);
                    System.out.println("3.Sandwich: " + sandwichPrice);

                case 2:
                System.out.println("======Enter the item number to add: ");
                int itemNumber = scanner.nextInt();
                System.out.println("Enter the quantity of items: ");
                int qty = scanner.nextInt();
                switch (itemNumber) {
                    case 1:
                    teaQty +=qty;
                    System.out.println(qty+" 1Tea added(s) successfully");
                    break;
                    case 2:
                    coffeeQty +=qty;
                    System.out.println(qty+" Coffee added(s) successfully");
                    break;
                    case 3:
                    sandwichQty +=qty;
                    System.out.println(qty+"Sandwich added(s) successfully");
                    break;
                    default:
                    System.out.println("Invalid item number");
                    break;
                }
                case 3:
                int teaTotal = teaQty*teaPrice;
               int coffeeTotal = coffeeQty*coffeePrice;
               int sandwichTotal = sandwichQty*sandwichPrice;
               
               int total = teaTotal + coffeeTotal + sandwichTotal;
               double tax = total*taxRate;
               double grandTotal = total + tax;
               if(teaQty>0){
                System.out.println("Tea: " + teaTotal);
               }
               if(coffeeQty>0){
                System.out.println("Coffee: " + coffeeTotal);
               }
               if(sandwichQty>0){
                System.out.println("Sandwich: " + sandwichTotal);
               }
               if (grandTotal==0){
                System.out.println("No items added");
               }
               System.out.println("Total: " + total);
               System.out.println("Tax (5%): " + tax);
               System.out.println("Grand Total: " + grandTotal);
               break;
               case 4:
                System.out.println("======Checkout and Exit=========");
                System.out.println("Total Bill: " + (teaQty*teaPrice + coffeeQty*coffeePrice + sandwichQty*sandwichPrice));
                break;
            }
        } while (choice != 4);
        scanner.close();
    }
}