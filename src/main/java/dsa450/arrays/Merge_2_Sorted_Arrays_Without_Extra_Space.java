package dsa450.arrays;

import java.util.Arrays;

public class Merge_2_Sorted_Arrays_Without_Extra_Space {

    public static void main(String[] args) {

    }

    public void mergeSortedArrayWithoutExtraSpace(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;
        int gap = m + n;
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {

            // swap in arr1
            for (i = 0; i + gap < m; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    swap(arr1, i, i + gap);
                }
            }

            // swap in arr1 and arr2. index of arr2 decided by gap and size of arr1
            for (j = gap > m ? gap - m : 0;
                 i < m && j < n;
                 i++, j++) {
                if (arr1[i] > arr2[j]) {
                    swap(arr1, i, arr2, j);
                }
            }

            // swap in arr2 from j
            if (j < n) {
                for (j = 0; j + gap < n; j++) {
                    if (arr2[j] > arr2[j + gap])
                        swap(arr2, j, j + gap);
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private int nextGap(int gap) {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }

    public int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;


        if (arr1[0] > arr2[0]) {
            mergeSortedArray(arr2, arr1);
        }

        int i = 0;
        int j = 0;

        int k = 0;
        int arr[] = new int[n1 + n2];
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                k++;
                i++;
            } else {
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < n1) {
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
        return arr;
    }


    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private void swap(int[] arr1, int i, int[] arr2, int j) {
        int t = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = t;
    }

}
