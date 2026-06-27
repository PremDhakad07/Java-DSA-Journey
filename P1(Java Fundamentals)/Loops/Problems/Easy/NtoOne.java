//2. Print N to 1

import java.util.Scanner;

public class NtoOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = input.nextInt();

        for (int i=num; i>=1; i--){
            System.out.println(i);
        }

        input.close();
    }
}
