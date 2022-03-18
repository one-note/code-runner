package dsa450.arrays;

import java.util.ArrayList;

import java.util.List;

public class MoreThanOneMissingAndRepeatNumbers_1_N {

    public static void main(String[] args) {

        int arr[] = {1, 5, 4, 3, 2, 6, 6, 8, 9, 9, 11};
        MoreThanOneMissingAndRepeatNumbers_1_N a = new MoreThanOneMissingAndRepeatNumbers_1_N();
        List<Integer> results = a.repeatAndMissingNumberArray(arr);
        System.out.println(results);
    }

    // max value in array of size n is n+1
    // swap when arr[i]!=arr[arr[i]-1] else i++
    // if arr[i]-1!=i then duplicate = arr[i] and missing = (i+1)
    public List<Integer> repeatAndMissingNumberArray(int[] arr) {
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
       // System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 != i) {
                list.add(arr[i]);
                list.add(i + 1);
            }
        }
      //  System.out.println(list);
        return list;
    }
}
