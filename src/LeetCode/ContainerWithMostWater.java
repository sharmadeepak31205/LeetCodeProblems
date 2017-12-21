package LeetCode;

/**
 * Created by deepaksharma on 12/3/17.
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        if(height == null || height.length == 0){
            return 0;
        }

        int i = 0;
        int j = 0;
        int area = 0;
        int maxArea = 0;


        while(i < j) {
            area = Math.min(height[i], height[j]) * (j - i);
            maxArea = Math.max(area, maxArea);

            if (height[i] < height[j]) {
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}
