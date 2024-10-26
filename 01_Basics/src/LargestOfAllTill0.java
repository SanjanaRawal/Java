//To input several numbers till a zero is entered and then output largest amongst all

import java.util.Scanner;

public class LargestOfAllTill0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int num = in.nextInt();
        int max = 0 ;
        while(num!=0) {
            if(max<num)
                max=num;
            num = in.nextInt();
        }
        System.out.println(max + " is largest amongst all entered numbers");
    }
}