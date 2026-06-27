//2. Print all Primes from 1 to N

import java.util.Scanner;

public class PrimeOneToN {
    static boolean isPrime(int n){
        if (n==0 || n==1)
            return false;

        for (int i=2; i<n; i++){
            if (n%i == 0)
                return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = input.nextInt();

       for (int i=1; i<=n; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
       }

       input.close();
    }
}
