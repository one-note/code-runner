package dsa.tuf.day2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AppTest {

    @Test
    public void missingElementInSortedArray_1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18};
        App app = new App();
        int actualValue = app.missingElementInSortedArray(arr);
        Assertions.assertEquals(16, actualValue);
    }

    @Test
    public void missingElementInSortedArray_2() {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        App app = new App();
        int actualValue = app.missingElementInSortedArray(arr);
        Assertions.assertEquals(5, actualValue);
    }

    @Test
    void repeatAndMissingNumberArray_1() {
        App app = new App();
        int[] arr = {2, 3, 1, 4, 5, 1, 5};
        List<Integer> actualList = app.repeatAndMissingNumberArray(arr);
        List<Integer> expectedList = Arrays.asList(1, 6, 5, 7);
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void repeatAndMissingNumberArray_2() {
        App app = new App();
        int[] arr = {1, 2, 3, 4, 5, 1, 5};
        List<Integer> actualList = app.repeatAndMissingNumberArray(arr);
        List<Integer> expectedList = Arrays.asList(1, 6, 5, 7);
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void mergeSortedArraysWithoutExtraSpace() {


        int arr1[] = {1, 2, 4, 6, 8, 9};
        int arr2[] = {3, 5, 7};
        App app = new App();
        app.mergeSortedArray(arr1, arr2);
    }

    @Test
    void mergeSortedArrayWithoutExtraSpace_1() {
        int arr1[] = {1, 8};
        int arr2[] = {4, 5};
        App app = new App();
        app.mergeSortedArrayWithoutExtraSpace(arr1, arr2);
        Assertions.assertArrayEquals(new int[]{1, 4}, arr1);
        Assertions.assertArrayEquals(new int[]{5, 8}, arr2);
    }

    @Test
    void mergeSortedArrayWithoutExtraSpace_2() {
        int arr1[] = {1, 2};
        int arr2[] = {3, 4};
        App app = new App();
        app.mergeSortedArrayWithoutExtraSpace(arr1, arr2);
        Assertions.assertArrayEquals(new int[]{1, 2}, arr1);
        Assertions.assertArrayEquals(new int[]{3, 4}, arr2);
    }

    @Test
    void mergeSortedArrayWithoutExtraSpace_3() {
        int arr1[] = {1, 2};
        int arr2[] = {3, 4, 5};
        App app = new App();
        app.mergeSortedArrayWithoutExtraSpace(arr1, arr2);
        Assertions.assertArrayEquals(new int[]{1, 2}, arr1);
        Assertions.assertArrayEquals(new int[]{3, 4, 5}, arr2);
    }

    @Test
    void mergeSortedArrayWithoutExtraSpace_4() {
        int arr1[] = {1, 6};
        int arr2[] = {3, 4, 5};
        App app = new App();
        app.mergeSortedArrayWithoutExtraSpace(arr1, arr2);
        Assertions.assertArrayEquals(new int[]{1, 3}, arr1);
        Assertions.assertArrayEquals(new int[]{4, 5, 6}, arr2);
    }

    @Test
    void mergeSortedArrayWithoutExtraSpace_5() {
        int arr1[] = {1, 6, 7, 8};
        int arr2[] = {3, 4, 5};
        App app = new App();
        app.mergeSortedArrayWithoutExtraSpace(arr1, arr2);
        Assertions.assertArrayEquals(new int[]{1, 3, 4, 5}, arr1);
        Assertions.assertArrayEquals(new int[]{6, 7, 8}, arr2);
    }

    @Test
    void transposeOfSquareMatrix() {

        App app = new App();
        int input[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int output[][] = new int[][]{
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };
        app.transposeOfSquareMatrix(input);
        Assertions.assertArrayEquals(input,output);
    }
}