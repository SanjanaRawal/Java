import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows of matrix : ");
        int rows = in.nextInt();
        System.out.print("Enter number of columns of matrix : ");
        int cols = in.nextInt();
        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements : ");
        for(int i = 0 ; i < arr.length ; i++)
            for(int j = 0 ; j < arr[i].length ; j++)
                arr[i][j] = in.nextInt();

        System.out.println("Matrix is as follows : ");
        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
    }
}