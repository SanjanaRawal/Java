import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = in.nextLine();
        System.out.print("Enter your id : ");
        int id = in.nextInt();
        System.out.print("Enter previous reading : ");
        int prev = in.nextInt();
        System.out.print("Enter present reading : ");
        int pres = in.nextInt();

        int units = pres - prev ;
        double amount ;

        if(units<100)
            amount = units * 1.5 ;

        else if (units>100 && units<200)
            amount = ( 100 * 1.5 ) + (units-100)*5 ;

        else
            amount = (100*1.5) + (100*5) + (units-200)*8 ;

        System.out.println("CustName \t\t CustID \t Previous Reading \t Present Reading \t Amount");
        System.out.println(name + "\t" + id + "\t\t\t" + prev + "\t\t\t\t" + pres + "\t\t\t" + amount);

    }
}
