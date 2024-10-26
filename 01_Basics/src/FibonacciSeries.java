import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no. of elements you want to see : ");
        int nums = in.nextInt();

        int a = 0 ;
        int b = 1 ;

        if(nums==0) System.out.print(" ");
        else if(nums==1) System.out.print(a);
        else System.out.print(a + " " + b + " ");

        for(int i = 3 ; i<=nums ; i++) {
            int next = a+b ;
            System.out.print(next + " ");
            a = b ;
            b = next ;
        }
    }
}
