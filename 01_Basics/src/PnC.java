import java.util.Scanner;

public class PnC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = in.nextInt();
        System.out.print("Enter r : ");
        int r = in.nextInt();

        System.out.print("Permutaion = ");
        permutation(n , r);
        System.out.print("Combination = ");
        combination(n , r);
    }

    static void permutation(int n , int r) {
        int nPr = fact(n) / fact(n-r);
        System.out.println(nPr);
    }

    static void combination (int n , int r) {
        int nCr = fact(n)/(fact(r)*fact(n-r));
        System.out.println(nCr);
    }

    static int fact(int x){
        int prod = 1;
        for(int i = x ; i>=1 ; i--) {
            prod = prod * i ;
        }
        return prod ;
    }
}
