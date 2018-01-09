package String;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class StringCompression {

    public int compress(char[] chars) {

        //Using two pointer and done inspace.

        int indexAns = 0;
        int index = 0;

        while(index < chars.length){
            char curr = chars[index];
            int count = 0;

            while(index < chars.length && curr == chars[index]){
                index++;
                count++;
            }

            chars[indexAns++] = curr;

            if(count != 1){
                for(char i : String.valueOf(count).toCharArray()){
                    chars[indexAns++] = i;
                }
            }
        }

        return indexAns;
    }

}
