import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-10 , 99 , 0 , 734 , -152 , 33 , 0 , - 8 , 61 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 1 ; j < arr.length - i ; j++) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                }
            }
        }
    }
}
