/*
Input: A = 3, B = 6
Output: 3
Explanation: GCD of 3 and 6 is 3
*/
class Solution
{
    public int gcd(int a , int b) 
    { 
        if(a == 0)
        return b;
        
        if(b == 0)
        return a;
        
        if(a >= b)
        return gcd(a%b, b);
        else
        return gcd(b%a, a);
        
    } 
}
