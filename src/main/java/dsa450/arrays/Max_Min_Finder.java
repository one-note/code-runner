package dsa450.arrays;

import java.util.Arrays;

// max and min array
public class Max_Min_Finder {
    public static void main(String[] args) {

        Max_Min_Finder app2 = new Max_Min_Finder();
        int arr[] = {1,5,4,3,2};
        int[] obj =app2.minAndMaxArr(arr);
        System.out.println(Arrays.toString(obj));
    }

    public  int[] minAndMaxArr(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int v : arr) {
            if (v < min)
                min = v;
            if (v > max)
                max = v;
        }
        return new int[]{min, max};
    }
}
