package String;

import LeetCode.IntegerToRoman;

/**
 * Created by deepaksharma on 12/25/17.
 */
public class DecodeWays {

    public int numDecodings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        int len = s.length();
        int[] dc = new int[len+1];

        dc[0] = 0;
        dc[1] = s.charAt(0) != '0' ? 1 : 0;

        for(int i = 2; i <= len; i++){
            int first = Integer.parseInt(s.substring(i-1,i));
            int second = Integer.parseInt(s.substring(i-2,i));

            if(first >= 1 && first <= 9){
                dc[i] += dc[i-1];
            }

            if(second >= 10 && second <= 26){
                dc[i] += dc[i-2];
            }
        }

        return dc[len];
    }
}
