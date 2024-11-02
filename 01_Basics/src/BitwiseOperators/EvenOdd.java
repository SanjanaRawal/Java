package BitwiseOperators;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number ? ");
        int n;
        n = in.nextInt() ;
        boolean ans = isOdd(n);
        System.out.println("Is "+n+" Odd ? " + ans);
    }
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
}
