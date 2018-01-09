package String;

/**
 * Created by deepaksharma on 12/23/17.
 */
public class OptimalDivision {

    public String optimalDivision(int[] nums) {

        StringBuilder sb = new StringBuilder();

        if(nums == null || nums.length == 0){
            return sb.toString();
        }

        sb.append(nums[0]);

        for(int i = 1; i < nums.length; i++){
            if(i == 1 && nums.length > 2){
                sb.append("/(").append(nums[i]);
            }
            else{
                sb.append("/").append(nums[i]);
            }
        }

        return nums.length > 2 ? sb.append(")").toString() : sb.toString();
    }
}
