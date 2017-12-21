package LeetCode;

import java.util.*;

/**
 * Created by deepaksharma on 12/19/17.
 */
public class TopKFrequentElements {

    public static List<Integer> topKFrequent(int[] arr, int k) {
        if(arr == null || arr.length == 0) return null;

        List<Integer>[] listArr = new ArrayList[arr.length+1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(listArr[entry.getValue()] == null){
                listArr[entry.getValue()] = new ArrayList<>();
            }
            listArr[entry.getValue()].add(entry.getKey());
        }

        List<Integer> res = new ArrayList<>();

        for(int i = listArr.length - 1; i >= 0 && res.size() < k; i--){
            if(listArr[i] != null){
                res.addAll(listArr[i]);
            }
        }

        return res;
    }

    public static void main(String[] args){
        int[] arr = {1,1,1,1,2,2,2,3};
        List<Integer> result = topKFrequent(arr, 2);
        System.out.print(result);
    }

}
