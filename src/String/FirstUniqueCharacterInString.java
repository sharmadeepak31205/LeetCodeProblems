package String;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {
        Map<Character, int[]> map = new LinkedHashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int[] value = map.get(s.charAt(i));
                value[0] = i;
                value[1] += 1;
                map.put(s.charAt(i), value);
            }
            else{

                int[] arr = new int[2];
                arr[0] = i;
                arr[1] = 1;
                map.put(s.charAt(i), arr);
            }
        }


        for(Map.Entry<Character, int[]> entry : map.entrySet()){
            int[] value = entry.getValue();
            if(value[1] == 1){
                return value[0];
            }
        }

        return -1;
    }
}
