package String;

import java.util.List;

/**
 * Created by deepaksharma on 12/25/17.
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {

        if(s == null || s.length() == 0 || numRows <= 1){
            return s;
        }

        int len = s.length();

        StringBuilder[] sb = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++){
            sb[i] = new StringBuilder();
        }

        int index = 0;
        int incre = 1;

        for(int i = 0; i < len; i++){
            sb[index].append(s.charAt(i));
            if(index == 0){
                incre = 1;
            }
            if(index == numRows-1){
                incre = -1;
            }
            index += incre;
        }

        StringBuilder sb1 = new StringBuilder();

        for(int i = 0; i < sb.length; i++){
            sb1.append(sb[i].toString());
        }

        return sb1.toString();
    }

    public static void main(String[] args){

        ZigZagConversion z = new ZigZagConversion();
        String res = z.convert("PAYPALISHIRING", 3);
        System.out.print(res);
    }
}
