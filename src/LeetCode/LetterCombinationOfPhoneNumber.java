package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepaksharma on 12/3/17.
 */
public class LetterCombinationOfPhoneNumber {

    String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();

        if(digits == null || digits.length() == 0){
            return list;
        }

        combination(list,0, digits,"");

        return list;

    }


    public void combination(List<String> list, int index, String digit, String result){
        if(index >= digit.length()){
            list.add(result);
            return;
        }

        String letter = arr[digit.charAt(index) - '0'];

        for(int i = 0; i < letter.length() ; i++){
            combination(list, index+1, digit, result+letter.charAt(i));
        }
    }
}
