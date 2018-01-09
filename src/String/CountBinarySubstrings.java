package String;

/**
 * Created by deepaksharma on 12/21/17.
 */


/* Input: "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".

Notice that some of these substrings repeat and are counted the number of times they occur.

Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.*/
public class CountBinarySubstrings {

    public int countBinarySubstrings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        int prevRun = 0;
        int currRun = 1;
        int res = 0;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                currRun++;
            }
            else{
                prevRun = currRun;
                currRun = 1;
            }

            if(prevRun >= currRun){
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args){
        String s = "00110011";
        CountBinarySubstrings c = new CountBinarySubstrings();
        int res = c.countBinarySubstrings(s);
        System.out.print(res);
    }
}
