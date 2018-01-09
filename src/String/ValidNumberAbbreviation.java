package String;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class ValidNumberAbbreviation {

    public static boolean validWordAbbreviation(String word, String abbr) {

        int i = 0; int j = 0;

        while( i < word.length() && j < abbr.length()){
            if(word.charAt(i) == abbr.charAt(j)){
                i++;
                j++;
                continue;
            }

            if(abbr.charAt(j) <= '0' || abbr.charAt(j) >= '9'){
                return false;
            }

            int start = j;

            while(abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9'){
                j++;
            }

            int val = Integer.parseInt(abbr.substring(start,j));

            i += val;
        }

        return i == word.length() && j == abbr.length();
    }

    public static void main(String[] args){
        boolean res = validWordAbbreviation("internationalization","i12iz4n");
        System.out.print(res);
    }
}
