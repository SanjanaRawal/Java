import java.util.Scanner;

public class BinarySearch2DArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        System.out.println("Enter number to check : ");
        int target = in.nextInt();
        boolean found = searchMatrix(matrix, target);

        if (found) {
            System.out.println(target + " found in the matrix.");
        } else {
            System.out.println(target + " not found in the matrix.");
        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}

