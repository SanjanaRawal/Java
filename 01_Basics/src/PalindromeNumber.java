import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();
        int rev = 0 ;
        int og = num ;

        while(num>0) {
            int rem = num%10 ;
            rev = rev*10 + rem ;
            num = num / 10 ;
        }

        if(rev == og) System.out.println(og + " is palindrome");

        else System.out.println(og + " isn't palindrome");
    }
}

