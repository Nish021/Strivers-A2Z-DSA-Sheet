/*
Input: 5

Output:
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/
class Solution {

    void printTriangle(int n) {
        // code here
        for(int i = 0; i < 2*n-1; i++){
            for(int j = 0; j < 2*n ; j++){
                if(i == n-1 || ((j <= i || j >= 2*n-1-i ) && i < n-1) || ((j <= 2*n-2-i || j >= i+1 ) && i >= n))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
