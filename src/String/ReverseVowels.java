package String;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class ReverseVowels {

    public static String reverseVowels(String s) {

        int start = 0; int end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();

        while(start < end){

            while(start < end && !vowels.contains(arr[start]+"")){
                start++;
            }

            while(end > start && !vowels.contains(arr[end]+"")){
                end--;
            }

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }

    public static void main(String[] args){
        String res = reverseVowels("leetcode");
        System.out.println(res);
    }
}
