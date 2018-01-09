package String;

/**
 * Created by deepaksharma on 12/25/17.
 */
public class StringToInteger {

    public static int myAtoi(String str) {

        long res = 0;

        if(str == null || str.length() == 0){
            return (int)res;
        }

        String sign = "";

        str = str.trim();

        int i = 0;

        if(!Character.isDigit(str.charAt(0))){
            if(str.charAt(0) == '+'){
                sign = "+";
                i++;
            }
            else if(str.charAt(0) == '-') {
                sign = "-";
                i++;
            }
            else{
                return 0;
            }
        }

        while(i < str.length()){
            if(Character.isDigit(str.charAt(i))){
                res *= 10;
                res += str.charAt(i) - '0';
                if(res > Integer.MAX_VALUE) {
                    return sign != "-" ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            else{
                return sign == "-" ? -1 * (int)res : (int)res;
            }
            i++;
        }

        return sign == "-" ? -1 * (int)res : (int)res;


    }

    public static void main(String[] args){
        String s = "       -12a3gfh4";
        int res = myAtoi(s);
        System.out.print(res);
    }
}
