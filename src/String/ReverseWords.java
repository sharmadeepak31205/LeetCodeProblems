package String;

/**
 * Created by deepaksharma on 12/25/17.
 */
public class ReverseWords {

    public String reverseWords(String s) {

        s = s.trim();

        String[] str = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = str.length - 1; i >= 0; i--){

            str[i] = str[i].trim();
            if(str[i].equals("")){
                continue;
            }
            sb.append(str[i]).append(" ");

        }

        return sb.toString().trim();
    }

    public static void main(String[] args){
        ReverseWords r = new ReverseWords();
        String res = r.reverseWords("   a   b ");
    }
}
