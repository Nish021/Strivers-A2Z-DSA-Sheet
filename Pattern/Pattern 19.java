/*
Input: 5

Output:
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/
class Solution {
    void printTriangle(int n) {
       for(int i = 0; i < 2*n ; i++){
           for(int j = 0; j < 2*n ; j++){
               if((j >= 0 && (j < n-i|| j <= i-n) )|| ((j >= n + i || j >= 3*n - i -1 ) && j < 2*n) )
               System.out.print("*");
               else
               System.out.print(" ");
           }
           System.out.println();
       }
    }
}
