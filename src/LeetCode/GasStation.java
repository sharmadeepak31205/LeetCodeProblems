package LeetCode;

/**
 * Created by deepaksharma on 12/12/17.
 */
public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int sum=0;
        int res=0;
        int total=0;
        for(int i=0; i<gas.length; ++i){
            sum+=gas[i]-cost[i];
            if(sum<0){
                total+=sum;
                sum=0;
                res=i+1;
            }
        }
        total+=sum;
        return total<0?-1:res;
    }

    public static void main(String[] args){
        int[] gas = {1,2,3,3};
        int[] cost = {2,1,5,1};

        canCompleteCircuit(gas,cost);
    }
}
