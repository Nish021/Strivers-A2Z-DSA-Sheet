/*
Input: 5

Output:
    *
   ***  
  *****
 *******
*********

*/
class Solution {

    void printTriangle(int n) {
        for(int i = 0; i < n ; i++){
            for(int j = 1 ; j < 2*n+1; j++){
                if(j >= n-i && j <= n+i){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
