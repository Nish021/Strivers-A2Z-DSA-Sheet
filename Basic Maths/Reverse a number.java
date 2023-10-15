/*
Input : 122
Output: 221
Explanation: By reversing the digits of 
number, number will change into 221.

*/
class Solution
{
    public long reverse_digit(long n)
    {
        long res=0;
        while(n > 0){
           res = res*10 + n % 10;
           n /= 10;
        }
        return res;
    }
}
