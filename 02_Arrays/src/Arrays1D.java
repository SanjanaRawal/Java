import java.util.Arrays;
import java.util.Scanner;

public class Arrays1D {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements : ");
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = in.nextInt();

        System.out.print("Array is as follows : ");
        System.out.println(Arrays.toString(arr));
    }
}
