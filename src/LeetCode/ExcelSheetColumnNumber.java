package LeetCode;

/**
 * Created by deepaksharma on 12/15/17.
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {

        if(s == null || s.length() == 0){
            return 0;
        }

        int result = 0;

        for(int i = 0; i < s.length(); i++){
            result = result * 26 + (s.charAt(i) - 'A') + 1;
        }

        return result;
    }

}
