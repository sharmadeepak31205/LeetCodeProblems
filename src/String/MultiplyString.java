package String;

/**
 * Created by deepaksharma on 12/24/17.
 */
public class MultiplyString {

    public String multiply(String num1, String num2) {


        int m = num1.length(); int n = num2.length();

        int[] p = new int[m+n];

        for(int i = m-1; i >= 0; i--){
            for(int j = n-1; j>= 0; j--){
                int d1 = num1.charAt(i) - '0';
                int d2 = num2.charAt(j) - '0';
                p[i+j+1] += d1*d2;
            }
        }

        int carry = 0;

        for(int i = p.length - 1; i >= 0; i--){
            int temp = (p[i] + carry) % 10;
            carry = (p[i] + carry)/10;
            p[i] = temp;
        }

        StringBuilder sb = new StringBuilder();

        for(int i : p){
            sb.append(i);
        }

        while(sb.length() != 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
