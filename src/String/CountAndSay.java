package String;

/**
 * Created by deepaksharma on 12/25/17.
 */
public class CountAndSay {

    public static String countAndSay(int n) {

        String s = "1";

        for(int i = 1; i < n; i++){
            s = construct(s);
        }

        return s;
    }

    public static String construct(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char curr = s.charAt(0);

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == curr){
                count++;
            }
            else{
                sb.append(String.valueOf(count));
                sb.append(curr);
                curr = s.charAt(i);
                count = 1;
            }
        }

        sb.append(String.valueOf(count));
        sb.append(curr);

        return sb.toString();
    }

    public static void main(String[] args){
        countAndSay(1);
    }
}
