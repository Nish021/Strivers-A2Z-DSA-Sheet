/*
Input: N = 153
Output: "Yes"
Explanation: 153 is an Armstrong number
since 13 + 53 + 33 = 153.
Hence answer is "Yes".
*/
class Solution {
    static String armstrongNumber(int n){
        int temp = n;
        int res = 0;
        
        while(temp > 0){
           res += Math.pow(temp%10, 3);
           temp /= 10;
        }
        return n == res ? "Yes" : "No";
    }
}
