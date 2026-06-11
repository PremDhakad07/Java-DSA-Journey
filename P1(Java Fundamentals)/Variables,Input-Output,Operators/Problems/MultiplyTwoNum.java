//4. Multiply two Numbers

import java.util.Scanner;

public class MultiplyTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int mul = num1 * num2;
        System.out.println("Multiplication is: " + mul);

        input.close();
    }    
}
