import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("Please enter the array elements sorted in ascending order : ");
        for (int i = 0 ; i < arr.length ; i++)
            arr[i] = in.nextInt();

        System.out.print("Ascending order sorted array is : ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter element to be searched : ");
        int ele = in.nextInt();

        int index = binarySearch(arr , ele);
        if (index == -1)
            System.out.println("Element not found in array");
        else
            System.out.println(ele + " is at index " + index);
    }

    static int binarySearch(int[] arr , int ele) {

        int start = 0 ;
        int end = arr.length - 1 ;

        while(start <= end) {
            int mid = start + (end - start)/2 ;
            if(ele < arr[mid])
                end = mid - 1 ;
            else if(ele > arr[mid])
                start = start + 1 ;
            else
                return mid ;
        }
        return -1 ;
    }
}
