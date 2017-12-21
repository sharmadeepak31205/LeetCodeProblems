package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by deepaksharma on 12/8/17.
 */
public class MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null || intervals.size() == 0){
            return intervals;
        }

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        Interval prev = null;
        List<Interval> result = new ArrayList<>();

        for(Interval i : intervals){
            if(prev == null || prev.end < i.start){
                result.add(i);
                prev = i;
            }
            else if(prev.end < i.end){
                prev.end = i.end;
            }
        }
        return result;
    }
}
