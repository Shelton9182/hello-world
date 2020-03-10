import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double input1;
        double input2;
        System.out.print("Enter first operand: ");
        input1 = scan.nextDouble();
        System.out.print("Enter second operand: ");
        input2 = scan.nextDouble();

        //Calculator Menu
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Which operation do you want to perform?");
        int choice = scan.nextInt();
        scan.close();


        if (choice == 1) {
            double sum1 = input1 + input2;
            System.out.println("The result of the operation is " + sum1 + ". Goodbye!");
        }

        if (choice == 2){
            double sum2 = input1 - input2;
            System.out.println("The result of the operation is " + sum2 + ". Goodbye!");

        }

        if (choice == 3) {
            double sum3 = input1 * input2;
            System.out.println("The result of the operation is " + sum3 + ". Goodbye!");
        }

        if (choice == 4) {
            double sum4 = input1 / input2;
            System.out.println("The result of the operation is " + sum4 + ". Goodbye!");
        }

        if (choice > 4) {
            System.out.println("Error: Invalid selection! Terminating program.");
        }

        if (choice < 1) {
            System.out.println("Error: Invalid selection! Terminating program.");
        }

    }
}
