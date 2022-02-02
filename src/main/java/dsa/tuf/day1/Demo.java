package dsa.tuf.day1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

    }
    // time complexity o(N)
    //space complexity o(1
    public int findDuplicateElement(int[] array) {
        int slow = array[0];
        int fast = array[0];
        do {
            slow = array[slow];
            fast = array[array[fast]];
        }while (slow != fast);

        fast = array[0];
        while(slow != fast){
            slow = array[slow];
            fast = array[fast];
        }
        return fast;
    }
    public List<List<Integer>> buildPascalTriangle(int rowNUm){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> row , pre = null;
        for (int i= 0; i<rowNUm; ++i){
            row = new ArrayList<>();
            for (int j =0; j<=i; ++j){
                if (j==0 || j==i){
                    row.add(1);
                }
                else{
                    row.add(pre.get(j-1)+pre.get(j));
                }

            }
            pre = row;
            result.add(row);
        }

        return result;
    }
}
