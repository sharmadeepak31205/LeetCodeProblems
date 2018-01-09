package Array;

import javax.jnlp.IntegrationService;
import java.net.Inet4Address;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by deepaksharma on 1/3/18.
 */
public class kNumberWithMostOccurence {

    public static void kNumber(int[] arr, int k){

        Map<Integer, Integer> map = new TreeMap<>();

        int maxElem = 1;

        for(int i : arr){
            if(map.containsKey(i)){
                int val = map.get(i);
                map.put(i, val+1);
            }
            else{
                if(i > maxElem){
                    maxElem = i;
                }
                map.put(i, 1);
            }
        }

        int[] temp = new int[maxElem];

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            temp[entry.getKey() - 1] = entry.getValue();
        }

        int count = 0;

        for(int l = maxElem-1; l > 0; l-- ){
            if(temp[l] > 0) {
                System.out.print(l + ", ");
                count++;
            }

            if(count == k){
                break;
            }
        }
    }

    public static void nextGreater(){

        int[] arr = {13, 7, 6, 12};

        int max = 0;

        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                max = -1;
                if(arr[i] < arr[j]){
                    max = arr[j];
                    break;
                }
            }
            arr[i] = max;
        }

        arr[arr.length - 1] = -1;

        for(int k : temp){
            System.out.print(k + ", ");
        }
    }

    public static void maxDiff(){

        int[] arr = {7, 9, 5, 6, 3, 2};

        int min = 0;
        int minNo = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minNo){
                minNo = arr[i];
            }

            if(arr[i] > minNo){
                min = Math.max(arr[i] - minNo, min);
            }
        }

        System.out.print(min);
    }

    public static void max(){

        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};

        int maxDiff = -1;

        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length-1; j > i; j--){
                if(arr[j] < arr[i] && maxDiff < (j-i)){
                    maxDiff = j-i;
                }
            }
        }
        System.out.print(maxDiff);
    }

    public static void slidingWindow(){
        int[] arr= {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length - k + 1; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i; j < i+3; j++){
                if(max < arr[j]){
                    max = arr[j];
                }
            }
            list.add(max);
        }

        System.out.println(list);
    }

    public static void findMinDiff(){
        int[] arr = {3, 4, 5};
        int x = 3; int y = 5;

        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
         for(int i = 0; i < arr.length; i++){
             int z = -1;
             if(arr[i] == x){
                 z = y;
             }
             else if(arr[i] == y){
                 z = x;
             }

             if(map.containsKey(z)){
                 min = Math.min(Math.abs(map.get(z) - i), min);
             }

             map.put(arr[i] , i);
         }

        System.out.print(min);
    }

    public static void maxOccuring(){
        int[] arr = {1, 2, 2, 2, 0, 2, 0, 2, 3, 8, 0, 9, 2, 3};

        int number = arr[0];
        int count = 1;
        int i = 1;

        while(i < arr.length){
            if(arr[i] == number){
                count++;
            }
            else if(count == 0){
                count++;
                number = arr[i];
            }
            else{
                count--;
            }
            i++;
        }

        count = 0;

        for(int j = 0; j < arr.length; j++){
            if(number == arr[j]){
                count++;
            }
        }
        System.out.println(number);
        System.out.println(count);
    }

    public static void maxSumPath(){
        int[] arr1 = {2, 3, 7, 10, 12};
        int[] arr2 = {1, 5, 7, 8};

        int m = arr1.length; int n = arr2.length;

        int i = 0; int j = 0;
        int sum1 = 0; int sum2 = 0;

        while(i < m && j < n){
            if(arr1[i] > arr2[j]){
                sum1 += arr1[i];
            }
        }
    }

    public static void leastAvg() {
        int[] arr = {3, 7, 90, 20, 10, 50, 40};
        int k = 3;

        int min = Integer.MAX_VALUE;
        int lo = -1;
        int hi = -1;

        if (arr.length < k) {
            return;
        }

        for (int i = 0, j = i + k - 1; j < arr.length; i++, j++) {
            int sum = 0;
            for (int l = i; l <= j; l++) {
                sum += arr[l];
            }

            if (min > sum) {
                min = sum;
                lo = i;
                hi = j;
            }
        }
    }

    public static void maxAvg(){
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        int min = Integer.MIN_VALUE;
        int lo = -1; int hi = -1;

        if(arr.length < k){
            return;
        }

        for(int i = 0, j = i+k-1; j < arr.length; i++, j++){
            int sum = 0;
            for(int l = i; l <= j; l++){
                sum += arr[l];
            }

            if(min < sum){
                min = sum;
                lo = i;
                hi = j;
            }
        }

        System.out.println(min);
        System.out.println(lo);
        System.out.println(hi);
    }

    public static void arraySumPairs(){
        int[] arr = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        int target = 7;

        Map<Integer, Integer> map = new HashMap<>();


        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(target - arr[i])){
                map.put(arr[i],arr[i]);
                System.out.println(map.get(target - arr[i]) + " "+ arr[i]);
                count++;
            }
            else{
                map.put(arr[i],arr[i]);
            }
        }

        System.out.print(count);
    }

    public static int removeDuplicates(){
//        int[] arr = {1, 2, 1, 2, 3, 4, 5};
        int[] arr = {1,1,2};
        Arrays.sort(arr);

        int i = 0;

        for(int j = 0; j < arr.length; j++){
            if(arr[i] != arr[j]){
                arr[++i] = arr[j];
            }
        }

        for(int k = 0; k < i; k++){
            System.out.println(arr[k]);
        }

        return i;
    }

    public static void maxSum(){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int max = 0;
        int maxSoFar = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            max += arr[i];
            max = Math.max(max, arr[i]);
            maxSoFar = Math.max(maxSoFar, max);
        }

        System.out.println(maxSoFar);
    }


    public static void intersection(){
        int[] arr1 = {21, 34, 41, 22, 35};
        int[] arr2 = {61, 34, 45, 21, 11};

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr1.length; i++){
            if(map.containsKey(arr1[i])){
                int value = map.get(arr1[i]);
                map.put(arr1[i], value+1);
            }
            else{
                map.put(arr1[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr2.length; i++){
            if(map.containsKey(arr2[i])) {
                int value = map.get(arr2[i]);
                if (value > 0) {
                    list.add(arr2[i]);
                }
                map.put(arr2[i], value - 1);
            }
        }

        System.out.print(list);
    }

    public static void largetsProduct(){
        int[] arr = {2,3,-2,4};

        int maxHerePre = arr[0];
        int minHerePre = arr[0];
        int maxProduct = arr[0];
        int maxHere = 0;
        int minHere = 0;

        for(int i = 1; i < arr.length; i++){
            maxHere = Math.max(Math.max(maxHerePre * arr[i], minHerePre * arr[i]), arr[i]);
            minHere = Math.min(Math.min(maxHerePre * arr[i], minHerePre * arr[i]), arr[i]);
            maxProduct = Math.max(maxHere, maxProduct);
            maxHerePre = maxHere;
            minHerePre = minHere;
        }

        System.out.print(maxProduct);
    }

    public static void longestConsecSeq(){
        int[] arr = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        int max = 0;

        for(int i = 0; i < arr.length; i++){

            if(!set.contains(arr[i]- 1)){
                int j = arr[i];

                while(set.contains(j)){
                    j++;
                }

                if(max < j-arr[i]){
                    max = j-arr[i];
                }
            }
        }

        System.out.print(max);
    }

    public static void findPivot(){
        int[] arr = {1, 7, 3, 6, 5, 6};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        int leftSum = 0;

        int res = 0;

        for(int i = 0; i < arr.length; i++){

            if(leftSum == sum - arr[i] - leftSum){
                System.out.print(i);
                res = i;
            }
            leftSum += arr[i];
        }

        if( res != 0)
        System.out.print("-1");
    }

    public static void maxLengthRepeatedSubarray(){
        int[] arr1 = {1,2,3,2,1};
        int[] arr2 = {3,2,1,4,7};

        int[][] temp = new int[arr1.length+1][arr2.length+1];
        int max = 0;
        for(int i = 0; i <= arr1.length; i++){
            for(int j = 0; j <= arr2.length; j++){
                if(i == 0 || j == 0){
                    temp[i][j] = 0;
                    continue;
                }

                if(arr1[i-1] == arr2[j-1]){
                    temp[i][j] = temp[i-1][j-1] + 1;
                    max = Math.max(max,temp[i][j]);
                }
            }
        }

        System.out.print(max);
    }

    public static void subarrayProdLess(){
        int[] arr = {10, 5, 2, 6};

        int res = 0;

        int temp = 1;

        for(int i = 0, j= 0; j < arr.length; j++){

            temp *= arr[j];

            while(i < arr.length && temp >= 100){
                temp /= arr[i++];
            }

            res += j-i+1;
        }

        System.out.print(res);
    }

    public static void degreeArray(){
        int[] arr = {1,2,2,3,1,4,2};

        Map<Integer, int[]> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int[] val = map.get(arr[i]);
                val[0] += 1;
                val[2] = i;
            }
            else{

                int[] val = new int[3];
                val[0] = 1;
                val[1] = i;
                val[2] = i;
                map.put(arr[i], val);
            }
        }

        int temp = 0;
        int res = 0;
        for(Map.Entry<Integer, int[]> entry : map.entrySet()){
            if(temp < entry.getValue()[0]){
                temp = entry.getValue()[0];
                res = entry.getValue()[2] - entry.getValue()[1] + 1;
            }
            else if(temp == entry.getValue()[0]){
                res = Math.min(entry.getValue()[2] - entry.getValue()[1] + 1 , res);
            }
        }

        System.out.println(res);
    }

    public static void longestContiIncSub(){
        int[] arr = {1,3,5,4,7};
        int count = 1;

        int max = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length;i++){
            if(arr[i] > arr[i-1]){
                count++;
            }
            else{
                max = Math.max(count,max);
                count =1;
            }
        }

        System.out.print(max);
    }

    public static int maxSwap(){
        int num = 2736;

        int[] bucket = new int[10];

        char[] arr = String.valueOf(num).toCharArray();

        for(int i = 0; i < arr.length; i++){
            bucket[arr[i]-'0'] = i;
        }

        for(int i = 0; i < arr.length; i++){
            for(int k = 9; k > arr[i]- '0'; k--){
                if(bucket[k] > i){
                    char temp = arr[i];
                    arr[i] = arr[bucket[k]];
                    arr[bucket[k]] = temp;
                    System.out.print(Integer.parseInt(new String(arr)));
                    return Integer.parseInt(new String(arr));
                }
            }
        }

        return num;
    }

    public static boolean nondecarr(){
        int[] arr = {4,2,1};

        boolean flag = true;

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                if(flag){
                    if(i > 0 && arr[i-1] > arr[i+1]){
                        arr[i+1] = arr[i];
                    }
                    else{
                        arr[i] = arr[i+1];
                    }

                    flag = false;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public static double maxAvg1(){
        int[] arr = {1,12,-5,-6,50,3};
        double k = 4;

        double maxAvg = Integer.MIN_VALUE;
        double max = Integer.MIN_VALUE;
        double sum = 0;

        int j = 0; int i = 0;

        while(j < k){
            sum += arr[j++];
        }

        while(j < arr.length){
            maxAvg = Math.max(maxAvg, sum/k);
            sum -= arr[i++];
            sum += arr[j++];
        }
        maxAvg = Math.max(maxAvg, sum/k);
        System.out.println(maxAvg);
        return maxAvg;
    }

    public static int maxProdThree(){
        int[] arr = {1,2,3,4};

        Arrays.sort(arr);

        int first = arr[0] * arr[1] * arr[arr.length-1];
        int second = arr[arr.length-3] * arr[arr.length-2] * arr[arr.length-1];

        System.out.print(Math.max(first, second));

        return Math.max(first, second);
    }

    public static boolean canPlaceFlowers(){
        int[] arr = {1,0,0,0,1};
        int n = 1;

        int temp = 1;
        int res  =0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                temp++;
            }
            else{
                res += (temp-1)/2;
                temp = 0;
            }
        }

        if(temp != 0){
            res += temp/2;
        }

        if( res >= n){
            return true;
        }

        return false;
    }

    public static void getIndexOfString(){
        String s = "This is a pen and is used to write";

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            int index = s.indexOf("is");
            list.add(index);
            s = s.substring(index+1,s.length());
        }

        System.out.println(list);
    }
    public static void stringcompression(){
        String s = "aaabccccccddee";

        int count = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(i > 0 && s.charAt(i-1) != s.charAt(i)){
                sb.append(s.charAt(i-1)).append(count);
                count = 1;
            }
            else{
                count++;
            }
        }

        sb.append(s.charAt(s.length()-1)).append(count);

        System.out.print(sb.toString());
    }

    public static void minDiff(){
        int[] arr1 = {1,3,2,15,11};
        int[] arr2 = {23,127,235,19,8};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0; int j = 0;

        int mindiff = Integer.MAX_VALUE;

        while(i < arr1.length && j < arr2.length){
            mindiff = Math.min(Math.abs(arr1[i] - arr2[j]), mindiff);

            if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        System.out.print(mindiff);
    }

    public static void subSort(){
        int[] arr = {1,2,4,7,10,11,7,12,7,16,18,19};

        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }

        Arrays.sort(temp);

        int m = 0; int n = arr.length-1;

        while(m < arr.length){
            if(arr[m] != temp[m]){
                break;
            }
            m++;
        }

        while(n >= 0){
            if(arr[n] != temp[n]){
                break;
            }
            n--;
        }

        System.out.print(m-1 +" "+(n+1));
    }

    public static void contigSubSeq(){
        int[] arr = {2,-8,3,-2,4,-10};

        int maxSoFar = 0;
        int maxEnd = 0;

        for(int i = 0; i < arr.length; i++){
            maxEnd = Math.max(arr[i], maxEnd + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEnd);
        }

        System.out.print(maxSoFar);
    }

    public static int[] sumSwap(){
        int[] arr1 = {4,1,2,1,1,2};
        int[] arr2 = {3,6,3,3};

        int[] res = null;

        int sum1 = 0; int sum2 = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];
            map.put(arr1[i],arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            sum2 += arr2[i];
        }

        int diff = Math.abs(sum1 - sum2);

        for(int i = 0 ; i < arr2.length; i++){
            if(map.containsKey(diff - arr2[i])){
                res = new int[]{arr2[i],map.get(diff-arr2[i])};
            }
        }

        System.out.print(res[0] + " "+ res[1]);
        return res;
    }

    public static void pairsum(){
        int[] arr = {1,2,4,5,3,6,8,-2};
        int target = 7;

        HashMap<Integer, int[]> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(target - arr[i])){
                System.out.println("Pairs is "+ map.get(target-arr[i])[0] + " " + arr[i]);
                int[] a = {arr[i], i};
                map.put(arr[i],a);
            }
            else{

                int[] a = {arr[i], i};
                map.put(arr[i],a);
            }
        }
    }

    public static void maxConsecOnes(){
        int[] arr = {1,1,0,1,1,1};

        int count = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 1){
                max = Math.max(max, count);
                count = 0;
            }
            else{
                count++;
            }
        }

        max = Math.max(count, max);

        System.out.println(max);
    }

    public static void numDisapp(){
        int[] arr = {4,3,2,7,8,2,3,1};

        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(temp[arr[i]-1] >= 0){
                temp[arr[i]-1] = -1;
            }
        }

        for(int i = 0; i < temp.length; i++){
            if(temp[i] >= 0){
                System.out.println(i+1);
            }
        }
    }

    public static void findDups(){
        int[] arr = {4,3,2,7,8,2,3,1};

        for(int i = 0; i < arr.length; i++){
            int index = Math.abs(arr[i])-1;
            if(arr[index] >= 0){
                arr[index] = -arr[index];
            }
            else{
                System.out.println(Math.abs(arr[i]));
            }
        }
    }

    public static void findD(){
        int[] arr = {4,3,2,6,5,2,1};

        int slow = arr[0];
        int fast = arr[arr[0]];

        while(slow != fast){
            slow = arr[slow];
            fast = arr[arr[fast]];
        }

        fast = 0;

        while(fast != slow){
            slow = arr[slow];
            fast = arr[fast];
        }


        System.out.println(slow);
    }

    public static void moveZerooo(){
        int[] arr = {0, 1, 0, 3, 12};

        int i = 0;

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != 0){
                arr[i++] = arr[j];
            }
        }

        for(int j = i; j < arr.length; j++){
            arr[j] = 0;
        }
    }

    public static void missingNu(){

        int[] arr = {9,6,4,2,3,5,7,0,1};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        int max  = (arr.length * (arr.length +1))/2;
        System.out.print(max - sum);
    }

    public static void productArraySelf(){
        int[] arr = {1,2,3,4};
        int[] temp = new int[arr.length];

        for(int i = 0, j = 1; i < arr.length; i++){
            temp[i] = j;
            j *= arr[i];
        }

        for(int i = arr.length-1, j= 1; i >= 0; i--){
            temp[i] *= j;
            j *= arr[i];
        }
    }

    public static void summaryRanges(){

        int[] arr = {0,1,2,4,5,7};

        for(int i = 0; i < arr.length; i++){

            int a = arr[i];

            while(i+1 < arr.length && arr[i+1] - arr[i] == 1){
                i++;
            }

            if(a != arr[i]){
                System.out.println(a+ "-->"+ arr[i]);
            }
            else{
                System.out.println(a);

            }
        }
    }

    public static void removeDupsII(){
        int[] arr = {1,2,3,3,4,5,6};
        int k = 2;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){

            if(i > k){
                set.remove(arr[i-k-1]);
            }

            if(!set.add(arr[i])){
                System.out.print(true);
            }
        }
    }

    public static void minSizeSubSum(){
        int[] arr = {2,3,1,2,4,3};

        int k = 7;

        int min = Integer.MAX_VALUE;

        int sum = 0; int j = 0;


        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            while(sum >= k){
                min = Math.min(min, i-j+1);
                sum -= arr[j++];
            }
        }
        System.out.println(min);
    }

    public static void findPeak(){
        int[] arr = {1, 2, 3, 1};

        for(int i = 0; i < arr.length; i++){
            if(i > 0 && arr[i] <arr[i-1]){
                System.out.println(i-1);
            }
        }
    }

    public static void findMinRotatedSortedArr(){
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        int res = helper(arr, 0, arr.length-1);
        System.out.print(res);
    }

    public static int helper(int[] arr, int lo, int hi){

        while(lo <= hi){
            int mid = (hi+lo)/2;

            if(mid > 0 && arr[mid] < arr[mid-1]){
                return arr[mid];
            }

            if(arr[mid] > arr[lo] && arr[mid] > arr[hi]){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }

        return 0;
    }

    public static void pascalTraiangle(){

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            list.add(0,1);
            for(int j = 1; j < list.size()-1; j++){
                list.set(j, list.get(j) + list.get(j+1));
            }
        }
        System.out.print(list);
    }

    public static void isArmstrong(){
        int num = 153;
        int ar = num;

        int res = 0;

        while(num > 0){
            int temp = num % 10;
            res += temp*temp*temp;
            num = num/10;
        }

        if(res == ar){
            System.out.print(res==ar);
        }
    }

    public static void countBinary(){
        String s = "00110011";

        int prev = 0;
        int curr = 1;
        int res = 0;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                curr++;
            }
            else{
                prev = curr;
                curr = 1;
            }

            if(prev >= curr){
                res++;
            }
        }

        System.out.print(res);
    }

    public static void repeatedString(){
        String a = "abcd"; String b = "cdabcdab";

        int al = a.length();
        int bl = b.length();

        StringBuilder sb = new StringBuilder();

        int res=0;

        while(sb.indexOf(b) < 0){
            if(sb.length() - al > bl){
                System.out.print("-1");
            }

            sb.append(a);
            res++;
        }

        System.out.print(res);
    }

    public static boolean validPalindrome(){
        String s = "abca";

        int l = -1; int r = s.length();

        while(++l < --r){
            if(s.charAt(l) != s.charAt(r)){
                return extendPalindrome(s, l, r+1) || extendPalindrome(s, l-1, r);
            }
        }
        return true;
    }

    public static boolean extendPalindrome(String s, int lo, int hi){

        while(--lo < ++hi){
            if(s.charAt(lo) != s.charAt(hi)){
                return false;
            }
        }

        return true;
    }

    public static boolean checkValidParenthesesi(){
        int low = 0; int high = 0;

        String s = "(*))";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                low++;
                high++;
            }
            else if(s.charAt(i) == ')'){
                if(low > 0){
                    low--;
                }
                high--;
            }
            else{
                if(low > 0){
                    low--;
                }
                high++;
            }

            if(high < 0){
                return false;
            }
        }

        return low == 0;
    }

    static int count = 0;

    public static int countPalindrome(){
        String s = "aaa";

        for(int i = 0; i < s.length(); i++){
            extendPalidrome(s,i,i);
            extendPalidrome(s,i,i+1);
        }
        System.out.print(count);
        return count;
    }

    public static void extendPalidrome(String s, int lo, int hi){

            while(lo >= 0 && hi < s.length() && s.charAt(lo) == s.charAt(hi)){
                lo--;
                hi++;
                count++;
            }
    }

    public static void reverseWords(){
        String s = "Let's take LeetCode contest";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        s = s.trim();

        String[] arr = s.split(" ");

        for(int i = 0; i < arr.length; i++){
            sb1.append(arr[i]).reverse();
            sb.append(sb1).append(" ");
            sb1.delete(0,sb1.toString().length());
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb.toString());
    }

    public static String optimalDivision() {

        int[] nums = {1000,100,10,2};

        StringBuilder sb = new StringBuilder();

        sb.append(nums[0]);

        for(int i = 1; i < nums.length; i++){
            if(i == 1 && nums.length > 2){
                sb.append("/(").append(nums[i]);
            }
            else{
                sb.append("/"+ nums[i]);
            }
        }

        System.out.print(sb.append(")").toString());

        return nums.length > 2 ? sb.append(")").toString() : sb.toString();
    }

    public static String reverseStr(String s, int k) {

        char[] c = s.toCharArray();

        int i = 0; int j = 0;

        while(i < s.length()){

            j = Math.min(i+k-1, s.length() - 1);
            reverse(c, i ,j);
            i += 2*k;
        }

        System.out.print(new String(c));

        return new String(c);

    }

    public static void reverse(char[] c, int i , int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static void minTimediff(){

        List<String> list = new ArrayList<>();
        list.add("23:59");
        list.add("00:00");

        int mm = Integer.MAX_VALUE;
        List<Integer> time = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            int hour = Integer.parseInt(list.get(i).substring(0,2));
            int min = (hour * 60 + Integer.parseInt(list.get(i).substring(3,5)));
            time.add(min);
        }

        Collections.sort(time);

        for(int i = 1; i < time.size(); i++){
            mm = Math.min(mm, time.get(i) - time.get(i-1));
        }

        int corner = time.get(0) + (1440 - time.get(time.size() - 1));

        mm = Math.min(mm, corner);

        System.out.print(mm);
    }

    public static void detectCapital(){

        String s = "Flag";

        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) - 'A' >= 0 && s.charAt(i) - 'Z' <= 0){
                count++;
            }
        }

        if(count == 0 || count == s.length() || count == 1 && s.charAt(0) - 'A' >= 0 && s.charAt(0) - 'Z' <= 0){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }

    public static void subStringPattern(){

        String s = "abcdabcdabcd";

        int l = s.length();

        for(int i = l/2; i> 0; i--){
            if(l%i == 0){
                int m = l/i;

                String sub = s.substring(0,i);
                StringBuilder sb = new StringBuilder();

                for(int j = 0; j < m; j++){
                    sb.append(sub);
                }

                if(sb.toString().equals(s)){
                    System.out.print(true);
                }
            }
        }

        System.out.print(false);
    }

    public static void stringComp(){
        String s = "aaabbccd";

        char curr = s.charAt(0);
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == curr){
                count++;
            }
            else{
                sb.append(""+curr+count);
                curr = s.charAt(i);
                count = 1;
            }
        }

        sb.append(""+curr+count);

        System.out.print(sb.toString());
    }

    public static void reverseVowels(){
        String s = "hello";
        s = s.toLowerCase();
        String vowels = "aeiou";

        char[] c = s.toCharArray();

        int i = 0; int j = s.length()-1;
        while(i <= j){
            while(i < j && !vowels.contains(c[i]+"")){
                i++;
            }

            while (j > i && !vowels.contains(c[j]+"")){
                j--;
            }

            if(i <= j){
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
            i++;
            j--;
        }

        System.out.print(new String(c));
    }

    public static void simplifyPath(){
        String s = "/a/./b/../../c/";

        String[] arr = s.split("/");
        String[] stack = new String[arr.length];
        int ptr = 0;

        for(String a : arr){
            if(a.equals(".") || a.equals("")){
                continue;
            }
            else if(a.equals("..")){
                if(ptr > 0){
                    ptr--;
                }
            }
            else{
                if(ptr >= 0){
                    stack[ptr++] = a;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < ptr; i++){
            sb.append("/").append(stack[i]);
        }

        System.out.print(sb.toString().length() == 0 ? "/" : sb.toString());
    }

    public static void addBinary(){
        String s1 = "11";
        String s2 = "1";

        StringBuilder sb = new StringBuilder();

        int len1 = s1.length()-1; int len2 = s2.length()-1;

        int carry = 0;

        while(len1 >= 0 || len2 >= 0){

            int sum = carry;

            if(len1 >= 0){
                sum += s1.charAt(len1--)-'0';
            }

            if(len2 >= 0){
                sum += s2.charAt(len2--)-'0';
            }

            sb.append(sum%2);
            carry = sum/2;
        }

        if(carry != 0){
            sb.append(carry);
        }

        System.out.print(sb.reverse().toString());
    }

    public static void multiply(){
        String s1 = "23";
        String s2 = "46";

        int[] res = new int[s1.length()+s2.length()];

        for(int i = s1.length()-1; i >= 0; i--){
            for(int j = s2.length()-1; j >= 0; j--){

                int d1 = s1.charAt(i) - '0';
                int d2 = s2.charAt(j) - '0';

                res[i+j+1] += d1*d2;
            }
        }

        int num = 0;

        for(int i = res.length-1; i >= 0; i--){
            int temp = res[i]%10 + num;
            num = res[i]/10;
            res[i] = temp;
        }

        StringBuilder sb = new StringBuilder();

        for(int i : res){
            sb.append(i);
        }

        while(sb.length() != 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        System.out.println(sb.toString().length() == 0 ? "0" : sb.toString());

    }

    public static void longestSubStringWithoutRepeatingCharacters(){

        String s = "abcdefabcbb";

        HashSet<Character> set = new HashSet<>();

        int count = 0;
        int min = Integer.MIN_VALUE;
        int i = 0; int j = 0;
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
            }
            else{
                min = Math.max(min, set.size());
                set.remove(s.charAt(i++));
            }
        }

        System.out.print(min);

    }

    public static void twoSum(){
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int i = 0; int j = arr.length-1;

        while(i < j){
            if(arr[i] + arr[j] == target){
                System.out.print(i + " "+ j);
                break;
            }
            else if(arr[i] + arr[j] > target){
                j--;
            }
            else{
                i++;
            }
        }

        System.out.print(-1 + " "+ -1);
    }

    public static void removeDupsFromSorted(){
        int[] arr = {1,1,2};

        int curr = arr[0];

        int i = 0; int j = 0;

        while(j < arr.length){
            if(curr != arr[j]){
                arr[++i] = arr[j];
            }
            j++;
        }

        System.out.println(i);
    }

    public static void removeElem(){
        int[] arr = {3,2,2,3}; int elem = 3;

        int i = 0; int j = 0;

        while(j < arr.length){
            if(arr[j] == elem){
                j++;
                continue;
            }
            else {
                arr[i++] = arr[j++];
            }
        }

        System.out.print(i);
    }

    public static void nextPerm(){
        int[] arr = {1,2,3};

        int i = arr.length-1;

        while(i>=0){
            if(i > 0 && arr[i] > arr[i-1]){
                break;
            }
            i--;
        }

        if( i < 0){
            Arrays.sort(arr);
            for(int j : arr){
                System.out.print(j);
            }
        }

        int x = arr[i-1]; int smallest = i;

        for( int j = i+1; j < arr.length; j++){
            if(arr[j] > x && arr[j] < arr[smallest]){
                smallest = j;
            }
        }

        int temp = arr[smallest];
        arr[smallest] = arr[i-1];
        arr[i-1] = temp;

        Arrays.sort(arr, i , arr.length);

        for(int j : arr){
            System.out.println(j);
        }
    }

    public static void jumpGame(){
        int[] arr = {2,3,1,1,4};

        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(max < i){
                System.out.print(false);
            }

            max = Math.max(arr[i] + i, max);
        }

        System.out.print(true);
    }

    public static void main(String[] args){

        jumpGame();
        nextPerm();
        removeElem();
        removeDupsFromSorted();
        twoSum();
        longestSubStringWithoutRepeatingCharacters();
        multiply();
        addBinary();
        simplifyPath();
        reverseVowels();
        stringComp();
        subStringPattern();
        detectCapital();
        minTimediff();
        reverseStr("abcdefg",2);
        optimalDivision();
        reverseWords();
        countPalindrome();
        repeatedString();
        countBinary();
        isArmstrong();
        pascalTraiangle();
        findMinRotatedSortedArr();
        findPeak();
        minSizeSubSum();
        removeDupsII();
        summaryRanges();
        productArraySelf();
        missingNu();
        moveZerooo();
        findD();
        findDups();
        numDisapp();
        maxConsecOnes();
        pairsum();
        sumSwap();
        contigSubSeq();
        subSort();
        minDiff();
        stringcompression();
        getIndexOfString();
        maxProdThree();
        maxAvg1();
        nondecarr();
        maxSwap();
        longestContiIncSub();
        degreeArray();
        subarrayProdLess();
        maxLengthRepeatedSubarray();
        findPivot();
        longestConsecSeq();
        largetsProduct();
        maxSum();
        intersection();
        removeDuplicates();
        arraySumPairs();
        maxAvg();
        leastAvg();
        maxOccuring();
        findMinDiff();
        slidingWindow();
        max();
        maxDiff();
        nextGreater();
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1};
        kNumber(arr, 2);
    }
}
