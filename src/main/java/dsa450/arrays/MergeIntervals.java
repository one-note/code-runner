package dsa450.arrays;

import java.util.Collections;
import java.util.List;

// MERGE INTERVALS
public class MergeIntervals {
    public static void main(String[] args) {

    }

    public List<Integer[]> mergeIntervals(List<Integer[]> intervals) {
        Collections.sort(intervals, (e1, e2) -> {
            return Integer.compare(e1[0], e2[0]);
        });

        Integer[] previous = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Integer[] current = intervals.get(i);
            if (previous[0] <= current[0] && current[0] <= previous[1]) {
                if (previous[0] <= current[1] && current[1] <= previous[1]) {
                    intervals.set(i, null);
                } else {
                    intervals.set(i, null);
                    previous[1] = current[1];
                }
            }
            else {
                previous = current;
            }
        }
        return intervals;
    }
}
