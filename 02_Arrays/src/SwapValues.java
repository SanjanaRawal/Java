import java.util.Arrays;
import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = {91,82,73,64,55} ;
        System.out.println("Array is : " + Arrays.toString(arr));

        System.out.println("Enter index values you wanna swap : ");
        int index1 = in.nextInt();
        int index2 = in.nextInt();

        swap(arr , index1 , index2);
        System.out.println("Modified array : " + Arrays.toString(arr));
    }

    static void swap(int[] arr , int i1 , int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp ;
    }
}

