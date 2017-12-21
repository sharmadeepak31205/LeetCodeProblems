package LeetCode;

/**
 * Created by deepaksharma on 11/10/17.
 */
public class RomanToInteger {

    public static int romanToInt(String input){
        if(input == null || input.length() == 0){
            return 0;
        }

        int[] nums = new int[input.length()];

        for(int i = 0; i < nums.length; i++){
            switch (input.charAt(i)){
                case 'M' :
                    nums[i] = 1000;
                    break;

                case 'D' :
                    nums[i] = 500;
                    break;

                case 'C' :
                    nums[i] = 100;
                    break;

                case 'L' :
                    nums[i] = 50;
                    break;

                case 'X' :
                    nums[i] = 10;
                    break;

                case 'V' :
                    nums[i] = 5;
                    break;

                case 'I' :
                    nums[i] = 1;
                    break;
            }
        }

        int sum = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i+1]){
                sum -= nums[i];
            }
            else{
                sum += nums[i];
            }
        }

        return sum + nums[nums.length-1];
    }

    public static void main(String[] args){
        int result = romanToInt("XVXXVI");
        System.out.print(result);
    }
}
