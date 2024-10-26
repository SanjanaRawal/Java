import java.util.Scanner;

public class CGPAcalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter required marks : ");
        System.out.print("English : ");
        float eng = in.nextFloat();
        System.out.print("Hindi : ");
        float hindi = in.nextFloat();
        System.out.print("Maths : ");
        float maths = in.nextFloat();
        System.out.print("Science : ");
        float science = in.nextFloat();
        System.out.print("Social Science : ");
        float sst = in.nextFloat();

        float cgpa = (eng+hindi+maths+science+sst)/5;
        System.out.println("Your cgpa : " + cgpa);
    }
}

