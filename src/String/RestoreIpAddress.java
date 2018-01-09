package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by deepaksharma on 12/25/17.
 */
public class RestoreIpAddress {

    public List<String> restoreIpAddresses(String s) {

        List<String> ans = new ArrayList<>();

        if(s == null || s.length() == 0){
            return ans;
        }

        int len = s.length();

        for(int i = 1; i<= 3; ++i){
            if(len-i > 9){
                continue;
            }
            for(int j = i+1; j<= i+3; ++j){
                if(len-j > 6){
                    continue;
                }

                for(int k = j+1; k <= j+3 && k < len; ++k){
                    int a,b,c,d;

                    a = Integer.parseInt(s.substring(0,i));
                    b = Integer.parseInt(s.substring(i,j));
                    c = Integer.parseInt(s.substring(j,k));
                    d = Integer.parseInt(s.substring(k));

                    if(a > 255 || b > 255 || c > 255 || d > 255){
                        continue;
                    }

                    String ip = a+"."+b+"."+c+"."+d;

                    if(ip.length() < len+3){
                        continue;
                    }

                    ans.add(ip);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args){
        RestoreIpAddress r = new RestoreIpAddress();
        List<String> res = r.restoreIpAddresses("25525511135");
        System.out.print(res);
    }
}
