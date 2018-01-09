package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class Timedifference {

    public static int findMinDifference(List<String> timePoints) {
        if(timePoints == null || timePoints.size() == 0){
            return 0;
        }

        int mm = Integer.MAX_VALUE;

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < timePoints.size(); i++){
            int h = Integer.parseInt(timePoints.get(i).substring(0,2));
            int m = (h * 60 + Integer.parseInt(timePoints.get(i).substring(3,5)));
            list.add(m);
        }

        Collections.sort(list);

        for(int i = 1; i < list.size(); i++){
            mm = Math.min(mm, list.get(i) - list.get(i-1));
        }

        int corner = list.get(0) + (1440 - list.get(list.size()-1));

        return Math.min(mm, corner);
    }

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("23:59");
        list.add("00:00");

        findMinDifference(list);
    }
}
