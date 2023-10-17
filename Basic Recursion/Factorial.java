/*
Input:
N = 5
Output:
120
Explanation:
5*4*3*2*1 = 120
*/

class Solution{
    static long factorial(int N){
        if(N == 1 || N == 0)
        return 1;
        
        return factorial(N-1)*(N) ;
    }
}
