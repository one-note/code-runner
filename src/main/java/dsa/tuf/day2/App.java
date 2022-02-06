package dsa.tuf.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

    }

    // max value in array of size n is n+1
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
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 != i) {
                list.add(arr[i]);
                list.add(i + 1);
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
                result = (arr[l] + arr[h]) / 2;
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

    public void transposeOfSquareMatrix(int[][] arr) {
        int diagonal = 0;
        int i = 0;
        int j = 0;
        int m = arr.length;
            while (true) {
                if (diagonal > arr.length)
                    break;
                if (i < m && j < m) {
                    int t = arr[diagonal][j];
                    arr[diagonal][j] = arr[j][diagonal];
                    arr[j][diagonal] = t;
                    i++;
                    j++;
                }
                if (i == arr.length) {
                    diagonal++;
                    i = j = diagonal;
                }
        }
        Stream.of(arr).forEach(e -> {
            System.out.println(Arrays.toString(e));
        });
    }
}
