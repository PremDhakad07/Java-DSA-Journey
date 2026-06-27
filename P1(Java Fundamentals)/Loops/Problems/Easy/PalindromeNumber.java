//7. Palindrome Number

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = input.nextInt();

        int original = num;
        int reversed = 0;

        while(num!=0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }

        if (original==reversed){
            System.out.println(original + " is a Palindrome number.");
        }
        else{
            System.out.println(original + " is not a Palindrome number.");
        }

        input.close();
    }
}
