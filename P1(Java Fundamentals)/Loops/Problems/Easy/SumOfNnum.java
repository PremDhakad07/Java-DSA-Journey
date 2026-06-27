//3. Sum of First N Numbers

import java.util.Scanner;

public class SumOfNnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = input.nextInt();

        int sum = 0;

        for (int i=1;i<=num;i++){
            sum = sum + i;
        }
        System.out.print("Sum is:" + sum);

        input.close();
    }    
}
