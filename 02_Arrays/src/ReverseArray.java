import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
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

        reverse(arr);
    }

    static void reverse(int arr[]) {
        int start = 0 ;
        int end = arr.length - 1 ;

        while(start<end) {
            swap(arr , start , end );
            start++;
            end--;
        }
        System.out.println("Reverse of array is : " + Arrays.toString(arr));
    }

    static void swap(int[] arr , int i1 , int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp ;
    }
}

