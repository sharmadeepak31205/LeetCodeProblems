package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by deepaksharma on 12/15/17.
 */
public class LargestNumber {

    public static String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return "0";
        }

        String[] str = new String[nums.length];

        for(int i = 0; i < nums.length; i++){
            str[i] = String.valueOf(nums[i]);
        }

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1+o2;
                String s2 = o2+o1;
                return s2.compareTo(s1);
            }
        };

        Arrays.sort(str,comp);

        if(str[0].equals("0")){
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for(String s : str){
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args){
        int[] arr = {3, 30, 34, 5, 9};

        String res = largestNumber(arr);

        System.out.print(res);
    }
}
