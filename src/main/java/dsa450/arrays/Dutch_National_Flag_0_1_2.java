package dsa450.arrays;

import java.util.Arrays;

public class Dutch_National_Flag_0_1_2 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 1, 2, 2};
        Dutch_National_Flag_0_1_2 app4 = new Dutch_National_Flag_0_1_2();
        app4.sort_0_1_2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void sort_0_1_2(int[] arr) {
        int zeroIndexTracker = -1;
        int oneIndexTracker = -1;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current == 0) {
                zeroIndexTracker++;
                int t = arr[zeroIndexTracker];
                arr[zeroIndexTracker] = current;
                arr[i] = t;
            }
        }

        oneIndexTracker = zeroIndexTracker;
        for (int i = zeroIndexTracker; i < arr.length; i++) {
            int current = arr[i];
            if (current == 1) {
                oneIndexTracker++;
                int t = arr[oneIndexTracker];
                arr[oneIndexTracker] = current;
                arr[i] = t;
            }
        }

    }
}
