package dsa450.arrays;

public class MissingElementInSortedArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8,9};
        MissingElementInSortedArray a = new MissingElementInSortedArray();
        int v = a.missingElementInSortedArray(arr);
        System.out.println(v);
    }
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
}
