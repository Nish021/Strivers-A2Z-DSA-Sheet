import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < a.length && j < b.length){
           
            if(a[i] <= b[j] ){
                if(res.size() == 0 || res.get(res.size()-1) != a[i]){
                res.add(a[i]);
                }
                i++;
            }else if(a[i] > b[j]){
                 if(res.size() == 0 || res.get(res.size()-1) != b[j]){
                res.add(b[j]);
                 }
                j++;
            }
        }

        while(i < a.length){
            if(res.size() == 0 || res.get(res.size()-1) != a[i])
            res.add(a[i]);
            i++;
        }

         while(j < b.length){
            if(res.size() == 0 || res.get(res.size()-1) != b[j])
            res.add(b[j]);
            j++;
        }

        return res;
        
    }
}
