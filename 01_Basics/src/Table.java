import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = in.nextInt();

        for (int i = 1 ; i<=10 ; i++) {
            int prod = num*i ;
            System.out.println(num + " * " + i + " = " +prod);
        }
    }
}
