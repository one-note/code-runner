package dsa.tuf.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

    }

    // max value in array of size n is n+1
    public List<Integer> repeatAndMissingNumberArray(int[] arr){
        for (int i = 0; i < arr.length; ) {
            int tempIndex = arr[i] - 1;
            if (tempIndex >= arr.length) {
                i++;
                continue;
            }
            if (arr[i] != arr[tempIndex]) {
                int t = arr[tempIndex];
                arr[tempIndex] = arr[i];
                arr[i] = t;
            } else {
                i++;
            }
        }

        // duplicate value at ith position value
        // missing value is ith_index + 1
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-1 !=i){
                list.add(arr[i]);
                list.add(i+1);
            }
        }
        System.out.println(list);
        return list;
    }
    // _ARRAYS
    public int missingElementInSortedArray(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        int result = -1;
        while (h > l) {
            int m = (l + h) / 2;
            System.out.println(l + " " + h);
            if (h - l == 1) {
                result = (arr[l] + arr[h])/ 2;
                break;
            }

            if (arr[m] - m > 1) {
                h = m;
                continue;
            }

            if (arr[h] - h > 1) {
                l = m;
                continue;
            }

        }
        return result;
    }
}
