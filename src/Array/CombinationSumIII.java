package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class CombinationSumIII {

    public static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();
        combination(result, new ArrayList<Integer>(), k , 1, n);
        return result;
    }

    public static void combination(List<List<Integer>> result, List<Integer> comb, int k, int start, int n){
        if(comb.size() == k && n == 0){
            List<Integer> li = new ArrayList<>(comb);
            result.add(li);
            return;
        }

        for(int i = start; i<= 9; i++){
            comb.add(i);
            combination(result, comb, k, i+1, n-i);
            comb.remove(comb.size()-1);
        }
    }

    public static void main(String[] args){
        List<List<Integer>> c = combinationSum3(3,9);
        System.out.print(c);
    }
}
