package LeetCode;

/**
 * Created by deepaksharma on 12/21/17.
 */
public class RepeatedStringMatch {

    public static int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        int count = 1;
        while(sb.indexOf(B)<0){
            System.out.print(sb.indexOf(B));
            if(sb.length()-A.length()>B.length()){
                return -1;
            }
            sb.append(A);
            count++;
        }

        return count;
    }

    public static void main(String[] args){
        int res = repeatedStringMatch("abcd", "cdabcdab");
        System.out.print(res);
    }
}
