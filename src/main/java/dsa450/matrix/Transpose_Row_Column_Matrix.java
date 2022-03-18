package dsa450.matrix;

import java.util.Arrays;
import java.util.stream.Stream;

// swap around diagonal traversal
public class Transpose_Row_Column_Matrix {

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
