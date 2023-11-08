class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int one_cnt = 0;
       int max_one = -1;

       for(int i = 0; i < nums.length ; i++){
           if(nums[i] == 1)
               one_cnt++;
           else
               one_cnt = 0;

           max_one = Math.max(max_one, one_cnt);
       }
       return max_one;
    }
}
