public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int age = 20;

        //Arithmetic Operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a^b);

        //Relational Operators
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);

        //Logical Operators
        System.out.println(age>18 && age<25);
        System.out.println(age<18 || age>15);
        System.out.println(!(age>18));
    }
}
