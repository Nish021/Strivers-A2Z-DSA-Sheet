/*
Input: 4
Output:
   A
  ABA
 ABCBA
ABCDCBA
*/

class Solution {

    void printTriangle(int n) {
        char abc = 'A';
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j <= n-1+i ; j++){
                if(j >= n-1-i){
                    if(j < n-1){
                        System.out.print(abc);
                        abc++;
                    }else if(j > n-1){
                        abc--;
                        System.out.print(abc);
                    }else if(j == n-1){
                        System.out.print(abc);
                    }
                }
                else
                System.out.print(" ");
            }
            abc='A';
            System.out.println();
        }
    }
}
