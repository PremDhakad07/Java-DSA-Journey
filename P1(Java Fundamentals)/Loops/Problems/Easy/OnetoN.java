//1. Print 1 to N

import java.util.Scanner;

public class OnetoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = input.nextInt();

        for (int i=1;i<=num;i++){
            System.out.println(i);
        }

        input.close();
    }
}
