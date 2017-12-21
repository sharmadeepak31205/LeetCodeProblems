package LeetCode;

/**
 * Created by deepaksharma on 12/15/17.
 */
public class MajorityElement {

    public static int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }

    public static void main(String[] args){
        int[] arr = {1,2,1,2,1,2,1,2,1,2,3,2,4,5,6,7,8,9,1,2,3,4,5,6};
        int res = majorityElement(arr);
        System.out.print(res);
    }
}
