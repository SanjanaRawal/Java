import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
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

        int ans = linearSearch(arr , element);

        if(ans == -1)
            System.out.println("Element isn't present in array");
        else
            System.out.println(element + " is at " + ans + " index");

    }

    static int linearSearch(int[] arr , int element) {

        if(arr.length==0)
            return -1 ;

        for(int index = 0 ; index < arr.length ; index++)
            if(arr[index]==element)
                return index ;

        return -1 ;
    }
}
