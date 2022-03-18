package dsa450.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindPairs_Sum_K {

    public static void main(String[] args) {

        FindPairs_Sum_K a = new FindPairs_Sum_K();
        int[] arr = {8, 7, 2, 5, 3, 1, 2, 8, 9};
        int k = 10;
        a.printPairs(arr, k);
    }

    // if diff = target - currentValue exits in set
    //     then diff, currentValue is pair. remove diff from set
    // else store currentValue in set

    public void printPairs(int[] arr, int target) {
        Set<Integer> map = new HashSet<>();

        for (int index = 0; index < arr.length; index++) {
            int currentValue = arr[index];
            int diff = target - currentValue;
            if (map.contains(diff)) {
                //int indexValue = map.get(diff);
                System.out.println("pair: " + diff + " " + currentValue);
                //return;
                map.remove(diff);// for  pair to be in order as in array
            } else {
                map.add(currentValue);
            }
        }
    }
}
