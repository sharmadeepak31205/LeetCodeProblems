package LeetCode;

import java.util.HashMap;

/**
 * Created by deepaksharma on 12/15/17.
 */
public class FractionToDecimal {

    public String fractionToDecimal(int numerator, int denominator) {
        if(denominator == 0){
            return "";
        }

        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);

        StringBuilder sb = new StringBuilder();

        String sign = (numerator< 0 == denominator < 0 || numerator == 0) ? "" : "-";

        sb.append(sign);
        sb.append(num/den);
        long remainder = num % den;

        if(remainder == 0){
            return sb.toString();
        }

        sb.append(".");
        HashMap<Long, Integer> map = new HashMap<>();
        while(!map.containsKey(remainder)){
            map.put(remainder , sb.length());
            sb.append(10 * remainder / den);
            remainder = (10 * remainder % den);
        }

        sb.insert( map.get(remainder),"(");
        sb.append(")");
        return sb.toString().replace("(0)", "");
    }

}
