package ArrayListOperasjoner;

import java.util.*;
import java.util.ArrayList;

public class ArrayListOperasjoner {


    private static ArrayList<Integer> randomizer(ArrayList<Integer> aList){
        Integer temp;
        Integer random;

        Random r = new Random();

        for (int i = aList.size()-1; i >=0; i--){

            random = r.nextInt(aList.size()-1);

            temp = aList.get(random);

            aList.set(random, aList.get(i));

            aList.set(i, temp);

        }

        return aList;

    }


    public static void main(String args[]){

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(arr));

        aList.add(14);

        aList.remove(new Integer(4));

        System.out.printf("Does list contain 14? %s%n", aList.contains(14) ? "yes" : "no");

        System.out.printf("Does list contain 4? %s%n%n", aList.contains(4) ? "yes" : "no");

        aList = randomizer(aList);

        System.out.println(aList);

        java.util.Collections.sort(aList, Collections.reverseOrder());

        System.out.println(aList);


    }




}
