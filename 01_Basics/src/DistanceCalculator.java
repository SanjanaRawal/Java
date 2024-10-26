//To calculate distance between two points

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter coordinates of 1st point : ");
        int x1 = in.nextInt() , y1 = in.nextInt() ;
        System.out.print("Enter coordinates of 2nd point : ");
        int x2 = in.nextInt() , y2 = in.nextInt() ;

        int x = x1 - x2 ;
        int y = y1 - y2 ;

        double distance ;
        distance = Math.sqrt(x*x + y*y);
        System.out.println("Distance between both the points is : " + distance);
    }
}
