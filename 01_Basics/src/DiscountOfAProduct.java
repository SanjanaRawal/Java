import java.util.Scanner;

public class DiscountOfAProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter original price : ");
        float op = in.nextFloat();
        System.out.print("Enter discount percent : ");
        float per = in.nextFloat();
        float discount = (per/100) * op ;
        float sp = op - discount ;

        System.out.println();
        System.out.println("Actual price : Rs " + op);
        System.out.println("Discount : Rs " + discount);
        System.out.println("Sale price : Rs " + sp);
    }
}