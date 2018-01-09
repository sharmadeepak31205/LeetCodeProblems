package Array;

/**
 * Created by deepaksharma on 12/22/17.
 */
public class CanPlaceFlowers {

    /*Logic is that keep counting consecutive zero and when there is one 1 come up
      then deduct one zero as you can't place flower near 1 and then add half of the count
      int the result and make count zero again.
    */

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed == null || flowerbed.length == 0 || n > flowerbed.length){
            return false;
        }

        int count = 1;
        int res = 0;

        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                count++;
            }
            else{
                res += (count-1)/2;
                count = 0;
            }
        }

        if(count != 0){
            res += count/2;
        }

        return res >= n;
    }
}
