import java.util.Arrays;
import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0 ; i < arr.length ; i++)
            arr[i] = in.nextInt();

        System.out.println( " Array is : " + Arrays.toString(arr));

        int min = min(arr) ;
        System.out.println("Minimum element in array : " + min);
    }

    static int min(int[] arr) {
        int min = arr[0];
        for(int i : arr) {
            if(i<min) {
                min = i;
            }
        }
        return min ;
    }
}
