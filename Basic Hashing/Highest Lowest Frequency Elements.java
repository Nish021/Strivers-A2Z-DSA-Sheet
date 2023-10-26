/*
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]

Output: 1 2

Explanation: The element having the highest frequency is '1', and the frequency is 3.
The elements with the lowest frequencies are '2', '3', and '4'. Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].
*/
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] getFrequencies(int []v) {
        
         Map<Integer, Integer> map = new HashMap<>();
         for(int i = 0; i < v.length; i++){
             if(map.containsKey(v[i]))
             map.put(v[i], map.get(v[i])+1);
             else
             map.put(v[i], 1);
         }

        //  System.out.println(map);

         int max_value = Integer.MIN_VALUE;
         int min_value = Integer.MAX_VALUE;
         int max_index = Integer.MAX_VALUE;
         int min_index = Integer.MAX_VALUE;

         for (Map.Entry<Integer,Integer> entry : map.entrySet())  {
             if(max_value < entry.getValue()){
                 max_value = entry.getValue();
                 max_index = entry.getKey();
             }else if(max_value == entry.getValue())
                 max_index = Math.min(max_index, entry.getKey());

             if(min_value > entry.getValue()){
                 min_value = entry.getValue();
                 min_index = entry.getKey();
             }else if(min_value == entry.getValue())
                 min_index = Math.min(min_index, entry.getKey());
          }
            
         return new int[]{max_index,min_index};
    }
}
