//7. Check Character is Vowel or Consonant

import java.util.Scanner;

public class vowelORconsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character:");
        char ch = input.next().charAt(0);

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'|| ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
            System.out.println("The character is vowel");
        }else{
            System.out.println("Character is consonant.");
        }

        input.close();
    }
}
