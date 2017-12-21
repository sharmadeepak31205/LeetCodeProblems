package LeetCode;

import java.util.Objects;

/**
 * Created by deepaksharma on 12/15/17.
 */
public class CountPrimes {

    public static int countPrimes(int n) {

            if(n == 0){
                return 0;
            }

            int count = 0;

            boolean[] prime = new boolean[n];

            for(int i = 2; i < n; i++){
                if(prime[i] == false){
                    count++;
                    for(int j = 2; j*i < n; j++){
                        prime[j*i] = true;
                    }
                }
            }
            return count;
    }

    public static void main(String[] args){
        int n = 13;
        int res = countPrimes(n);

        System.out.print(res);
    }
}
