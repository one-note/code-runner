package dsa450.arrays;

import java.util.Arrays;

public class MoveNegativeElementsOneSide {

    public static void main(String[] args) {
        int[] arr = null;
        MoveNegativeElementsOneSide app4 = new MoveNegativeElementsOneSide();
        arr = new int[]{1, -1, 2, -2, 3, -4, 5};
        app4.moveAll_NegativeOneSide(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void moveAll_NegativeOneSide(int[] arr) {
        int _veTracker = -1;
        int oneIndexTracker = -1;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current < 0) {
                _veTracker++;
                int t = arr[_veTracker];
                arr[_veTracker] = current;
                arr[i] = t;
            }
        }

    }
}
