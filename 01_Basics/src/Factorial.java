import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = in.nextInt();

        int i = num , prod = 1;

        while (i>=1) {
            prod = prod * i;
            i--;
        }

        System.out.println("Factorial of " + num + " is " + prod);
    }
}
