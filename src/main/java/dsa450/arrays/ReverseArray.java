package dsa450.arrays;

import java.util.Arrays;

// reverseArray
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        reverseArray(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr, int i, int j) {
        if (i > j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        reverseArray(arr,i,j);
    }
}
