import java.util.Arrays;
import java.util.Scanner;

public class AdvancedBubbleSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0 ; i < arr.length ; i++)
            arr[i] = in.nextInt();

        System.out.println("Unsorted array is : " + Arrays.toString(arr));

        Sort(arr);
        System.out.println("Sorted array is : " + Arrays.toString(arr));
    }
    static void Sort(int[] arr) {

        boolean swapped ;

        for(int i = 0 ; i < arr.length ; i++) {
            swapped = false ;
            for(int j = 1 ; j < arr.length - i ; j++) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                    swapped = true ;
                }
            }
//            if(swapped == false)
            if(!swapped)
                break ;
        }
    }
}

