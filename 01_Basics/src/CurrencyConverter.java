import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rupee amount : ");
        double Rs = in.nextFloat();
        double USD = Rs/83.89 ;
        System.out.println(Rs+ " Rs = " + USD + " USD ");
    }
}
