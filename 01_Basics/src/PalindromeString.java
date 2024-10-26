import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string : ");
        String str = in.next();
        String rev = "";

        for (int i = (str.length() - 1) ; i >=0 ; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.toLowerCase().equals(rev.toLowerCase()))
            System.out.println(str + " is a Palindrome String.");

        else
            System.out.println(str + " is not a Palindrome String.");

    }

}

