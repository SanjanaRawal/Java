import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0 ; i < arr.length ; i++)
            arr[i] = in.nextInt();

        System.out.println( " Array is : " + Arrays.toString(arr));
        System.out.print("Enter element you want to search : ");
        int element = in.nextInt();

        System.out.println("Enter range of indices : ");
        int r1 = in.nextInt();
        int r2 = in.nextInt();

        int ans = linearSearch(arr , element , r1 , r2);

        if(ans == -1)
            System.out.println("Element not present in range");
        else
            System.out.println(element + " is at " + ans + " index");

    }

    static int linearSearch(int[] arr , int element , int r1 , int r2) {

        if(arr.length==0)
            return -1 ;

        for(int index = r1 ; index < r2 ; index++)
            if(arr[index]==element)
                return index ;

        return -1 ;
    }
}
