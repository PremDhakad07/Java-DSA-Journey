//1. Prime Number Check

import java.util.Scanner;

public class PrimeNum {
    static boolean isPrime(int n){
        if (n<=1)
            return false;
        

        for (int i=2;i<n;i++)
            if (n % i == 0)
                return false;
            
    return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = input.nextInt();

        if (isPrime(n)){
            System.out.println(n + " is a prime number.");
        }else{
            System.out.println(n + " is not a prime number.");
        }

        input.close();
    }
}
