import java.util.*;

public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
    //    Map<Integer, Integer> map = new HashMap<>();
    //    for(int i = 0; i < n ; i++){
    //        if(map.containsKey(nums[i]))
    //        map.put(nums[i], map.get(nums[i])+1);
    //        else
    //        map.put(nums[i], 1);
    //    }
    //     for(int i = 0; i < n; i++){
    //         if(map.containsKey(i+1)){
    //         nums[i] = map.get(i+1);
    //         // System.out.print(nums[i]);
    //         }else
    //         nums[i] = 0;
    //     }
    //    return nums;

        int []ans  = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(nums[i] <= n)
            ans[nums[i]-1]++;
        }
        return ans;
    }
}
