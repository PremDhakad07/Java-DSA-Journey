//5. Count Digits

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = input.nextInt();

        int counter = 1;

        while(num/10 != 0){
            counter = counter + 1;
            num = num/10;
        }
        System.out.println("Number of digits are:" + counter);

        input.close();
    }
}
