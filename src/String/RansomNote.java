package String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            if(map.containsKey(magazine.charAt(i))){
                int value = map.get(magazine.charAt(i));
                map.put(magazine.charAt(i), value+1);
            }
            else{
                map.put(magazine.charAt(i), 1);
            }
        }

        for(int i = 0; i < ransomNote.length(); i++){
            if(map.containsKey(ransomNote.charAt(i))){
                int value = map.get(ransomNote.charAt(i));
                if(value == 0){
                    return false;
                }
                map.put(ransomNote.charAt(i), value-1);
            }
            else{
                return false;
            }
        }

        return true;
    }
}
