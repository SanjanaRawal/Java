import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0 ; i < arr.length ; i++)
            arr[i] = in.nextInt();

        System.out.println("Unsorted array is : " + Arrays.toString(arr));
        selection(arr);
        System.out.println("Sorted array is : " + Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static int getMax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++)
            if (arr[max] < arr[i])
                max = i;

        return max;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

