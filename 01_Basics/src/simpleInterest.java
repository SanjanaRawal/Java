import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principle amount , rate of interest , time period : ");
        System.out.print("P = ");
        float p = in.nextFloat();
        System.out.print("R = ");
        float r = in.nextFloat();
        System.out.print("T = ");
        float t = in.nextFloat();
        double si = (p*r*t)/100 ;
        System.out.println("Simple Interest = " + si);

    }
}
