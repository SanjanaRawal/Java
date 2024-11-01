import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter sorted array : ");
        for (int i = 0 ; i < arr.length ; i++)
            arr[i] = in.nextInt();

        System.out.print("Sorted array is : ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter number to be searched : ");
        int target = in.nextInt();

        int ans = orderAgnosticBS(arr, target);

        if(ans==-1)
            System.out.println("Element not found");
        else
            System.out.println(target + " is at index " + ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
