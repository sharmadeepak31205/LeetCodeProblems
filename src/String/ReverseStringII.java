package String;

/**
 * Created by deepaksharma on 1/2/18.
 */
public class ReverseStringII {

    public static String reverseStr(String s, int k) {
        if(s == null || s.length() == 0){
            return s;
        }

        char[] arr = s.toCharArray();

        int i = 0; int j = 0; int n = s.length();

        while(i < n){
            j = Math.min(i+k - 1, n-1);
            reverse(arr,i,j);
            i += 2*k;
        }

        return new String(arr);
    }

    public static void reverse(char[] s, int i, int j){
        while(i < j){
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }

    public static void main(String[] args){
        String s = "abcdefg";
        String res = reverseStr(s,2);

        System.out.print(res);

    }
}
