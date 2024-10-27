//Dynamic array or ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        //To add different elements in array list
        list.add(51);
        list.add(3);
        list.add(9);
        list.add(74);
        list.add(0);
        list.add(66);
        list.add(48);
        list.add(123);
        list.add(2);
        list.add(504);
        list.add(15);
        list.add(12);
        list.add(4);

        //To display arraylist
        System.out.println(list);

        //To check for a number
        System.out.print("Enter number you wanna check : ");
        int num = in.nextInt();
        System.out.println(list.contains(num));

        //To update an element at an index
        list.set(0,9999);
        System.out.println("Updated array : ");
        System.out.println(list);

        //To remove an element at 4th index
        list.remove(4);
        System.out.println("Updated array : ");
        System.out.println(list);
    }
}