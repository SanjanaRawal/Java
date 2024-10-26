import java.util.Scanner;

public class AreaOfShapes {

    static  Scanner in = new Scanner(System.in);
    static double pi = 3.14 ;

    public static void main(String[] args) {

        System.out.println("Use c for circle");
        System.out.println("Use t for equilateral triangle");
        System.out.println("Use r for rectangle");
        System.out.println("Use i for isosceles triages");
        System.out.println("Use p for parallelogram");
        System.out.println("Use s for square");
        System.out.println("Use b for rhombus");
        System.out.println();
        System.out.print("Enter shape whose area is to be printed : ");

        char ch = in.next().charAt(0);

        switch (ch) {

            case 'c' : circle();
                break;

            case 't' : equilateral();
                break;

            case 'r' : rectangle();
                break;

            case 'i' : isosceles();
                break;

            case 'p' : parallelogram();
                break;

            case 's' : square();
                break;

            case 'b' : rhombus();
                break;

            default : System.out.println(" Invalid choice" );
        }

    }

    static void circle() {
        System.out.print("Enter radius of circle : ");
        double r = in.nextFloat();
        double area = pi * r * r ;
        System.out.println("Area = " + area);
    }

    static void equilateral() {
        System.out.print("Enter side of a triangle : ");
        float side = in.nextFloat();
        double area = Math.sqrt(3)/4 * side * side ;
        System.out.println("Area = " + area);
    }

    static void rectangle() {
        System.out.print("Enter length : ");
        float l = in.nextFloat();
        System.out.print("Enter breadth : ");
        float b = in.nextFloat();
        double area = l*b ;
        System.out.println("Area = " + area);
    }

    static void isosceles() {
        System.out.print("Enter base : ");
        float base = in.nextFloat();
        System.out.print("Enter height : ");
        float height = in.nextFloat();
        double area = 0.5 * base * height ;
        System.out.println("Area of triangle = " + area);
    }

    static void parallelogram() {
        System.out.print("Enter base of parallelogram : ");
        float b = in.nextFloat();
        System.out.print("Enter its height : ");
        float h = in.nextFloat();
        double area = b*h ;
        System.out.println("Area = " + area);
    }

    static void square() {
        System.out.print("Enter side's length of square : ");
        float side = in.nextFloat();
        double area = side * side ;
        System.out.println("Area = " + area);
    }

    static void rhombus() {
        System.out.print("Enter length of both the diagonals : ");
        float d1 = in.nextFloat();
        float d2 = in.nextFloat();
        double area = (d1*d2)/2 ;
        System.out.println("Area = " + area);
    }

}