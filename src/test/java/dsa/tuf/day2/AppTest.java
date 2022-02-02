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
        List<Integer> expectedList = Arrays.asList(1,6,5,7);
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void repeatAndMissingNumberArray_2() {
        App app = new App();
        int[] arr = {1, 2, 3, 4, 5, 1, 5};
        List<Integer> actualList = app.repeatAndMissingNumberArray(arr);
        List<Integer> expectedList = Arrays.asList(1,6,5,7);
        Assertions.assertEquals(expectedList, actualList);
    }
}