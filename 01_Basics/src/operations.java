import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float sum = a+b ;
        float diff = a-b ;
        float mul = a*b ;
        float div = a/b ;
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + mul);
        System.out.println("Quotient = " + div);
    }
}
