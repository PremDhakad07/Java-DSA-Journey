//2. Take number as input and print it.

import java.util.Scanner;

public class NumInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Number is: " + num);

        input.close();
    }    
}
