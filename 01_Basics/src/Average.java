import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total amount of numbers : ");
        int total = in.nextInt();
        int num , sum=0 ;

        System.out.print("Enter numbers : ");
        for(int i = 1 ; i <= total ; i++) {
            num = in.nextInt();
            sum = sum + num ;
        }

        int avg = sum / total ;
        System.out.println("Average = " + avg);
    }
}
