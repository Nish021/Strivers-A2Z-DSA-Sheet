/*
Input: 5

Output:

*********
 *******
  *****
   ***
    *
*/

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i = 0; i < n ;i++){
            for(int j = 0; j < 2*n-1; j++){
                
                if(j >= i && j < 2*n-1-i){
                    System.out.print("*");
                }else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
