package dsa.tuf.day2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void missingElementInSortedArray_1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18};
        App app = new App();
        int actualValue = app.missingElementInSortedArray(arr);
        Assertions.assertEquals(16,actualValue);
    }

    @Test
    public void missingElementInSortedArray_2() {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        App app = new App();
        int actualValue = app.missingElementInSortedArray(arr);
        Assertions.assertEquals(5,actualValue);
    }
}