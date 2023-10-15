/*
Input: N = 12345
Output: 5
Explanation: N has 5 digits
*/
public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int res = 0;
        while(n > 0){
            res++;
            n = n / 10;
        }
        return res;
    }
}


