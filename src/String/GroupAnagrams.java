package String;

import java.util.*;

/**
 * Created by deepaksharma on 12/24/17.
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();

        if(strs == null || strs.length == 0){
            return list;
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){

            char[] c = s.toCharArray();

            Arrays.sort(c);

            String temp = String.valueOf(c);

            if(map.containsKey(temp)){
                List<String> val = map.get(temp);
                val.add(s);
                map.put(temp, val);
            }
            else{

                List<String> val = new ArrayList<String>();
                val.add(s);
                map.put(temp, val);
            }
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            list.add(entry.getValue());
        }

        return list;
    }

    public static void main(String[] args){
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = groupAnagrams(arr);

        for(List<String> l : list){
            System.out.println(l);
        }
    }
}
