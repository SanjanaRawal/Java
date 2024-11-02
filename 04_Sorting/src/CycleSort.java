import java.util.Arrays;
public class CycleSort {
    public static void main(String[] args) {

        int[] arr = {8,1,6,7,4,3,5,2};

        System.out.println("Unsorted array : " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted array : " + Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        int i = 0 ;
        while(i < arr.length) {
            int correct = arr[i] - 1 ;
            if(arr[i]!=arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp ;
            }
            else
                i++;
        }
    }
}

