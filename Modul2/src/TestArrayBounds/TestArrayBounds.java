package TestArrayBounds;

import java.util.Scanner;

public class TestArrayBounds {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args){

        int[] arrayz = new int[] {1, 2312 ,32, 23, 5, 1, 31, 45, 6, 457,
                45, 46, 6546, 4, 54, 645, 546, 2, 5254, 9,
                12, 2764, 9654, 213, 546, 867, 5, 23, 5, 123,
                1,87, 7, 4536, 4, 123, 268, 9634, 34, 667,
                223, 66, 445, 112, 88, 990, 11, 2, 78, 19,
                65, 767, 351, 79, 89, 00, 1231, 544, 23, 111,
                64, 72, 85, 91, 722, 511, 32, 333, 513, 317,
                23, 222, 656, 899, 110, 540, 90, 10, 603, 20,
                8, 6, 2, 1, 4563, 8657, 234, 736, 1113, 909,
                48, 313, 894, 999, 73, 731, 12, 19, 265, 132};

        System.out.print("Enter an index number: ");

        int indexValue = sc.nextInt();

        try{
            System.out.println("The element is " + arrayz[indexValue]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");

        }


    }

}
