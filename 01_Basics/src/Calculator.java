import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch ;

        while (true) {
            System.out.println("Enter two numbers : ");
            float num1 = in.nextFloat();
            float num2 = in.nextFloat();
            System.out.println("Enter choice of operation : ");
            ch = in.next().trim().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
                case 'x':
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}