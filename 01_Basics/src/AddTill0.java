//To input the numbers till 0 is entered and then add all numbers

import java.util.Scanner;

public class AddTill0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int num = in.nextInt();
        int sum = 0;
        while(num!=0) {
            sum = sum + num ;
            num = in.nextInt();
        }
        System.out.println("Sum off all entered numbers = " + sum);
    }
}
