import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year to check : ");
        int year = in.nextInt();
        if(year%4==0)
            System.out.println("It's leap year");
        else
            System.out.println("It isn't leap year");
    }
}
