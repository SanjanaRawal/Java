import java.util.Scanner;

public class SumOfNaturalNumbersN {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter numbers : ");
        int n = in.nextInt();
        int sum = 0;

        System.out.print("The natural numbers are : ");
        for(int i = 1 ; i<=n ; i++) {
            System.out.print(i + " ");
            sum += i ;
        }
        System.out.println();
        System.out.println("Sum of above numbers = " + sum );
    }
}

