//7. Swap two numbers (using third variable)

public class SwapTwoNum {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        
        System.out.println("a:" + a);
        System.out.println("b:" + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
