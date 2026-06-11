//5. Calculate area of rectangle

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = input.nextInt();

        System.out.print("Enter breath: ");
        int breath = input.nextInt();

        int area = length * breath;
        System.out.println("Area of rectangle is: " + area);

        input.close();
    }
}
