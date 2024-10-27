import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();

        System.out.print("Array is as follows : ");
        System.out.println(Arrays.toString(arr));

        max(arr);
    }

    static void max(int arr[]) {
        int max = 0 ;
        for(int i = 0 ; i < arr.length ; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value present in array : " + max);
    }
}
