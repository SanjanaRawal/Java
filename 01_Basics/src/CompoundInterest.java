import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter principal amount : ");
        float p = in.nextFloat();
        System.out.print("Enter rate of interest : ");
        float r = in.nextFloat();
        System.out.print("Enter no. of times interest is compounded per year : ");
        float n = in.nextFloat();
        System.out.print("Enter time period : ");
        float t = in.nextFloat();

        double amount = p * Math.pow((1 + (r/n)),n*t);
        System.out.println("Amount = " + amount);
    }
}
