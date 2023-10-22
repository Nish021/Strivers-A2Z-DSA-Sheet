public class Solution {

    public static void reverse(int i, int j , int []nums){
        
        if(i > j)
        return ;

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        reverse(i+1,j-1,nums);
    }
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        reverse(0,n-1,nums);
        return nums;

    }
}
