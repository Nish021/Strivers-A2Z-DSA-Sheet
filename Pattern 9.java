/*

Input: number = 5
 
Output:

       *
      * *
     * * *
    * * * *
   * * * * *
   * * * * *
    * * * *
     * * *
      * *
       *

*/

class Solution {

    void printDiamond(int n) {
        String star = "*";
       for(int i = 0 ; i < 2*n ; i++){
         //method 1
        //   if(i < n){
        //       for(int j = 0 ; j <= n-1+i ; j++){
        //           if(j >= n-1-i){
        //               System.out.print(star);
        //               star = star == "*" ? " " : "*";
        //           }else{
        //               System.out.print(" ");
        //           }
        //       }
        //   }else {
        //       for(int j = 0; j <= 3*n - 2 - i ; j++){
        //           if(j >= i-n){
        //                 System.out.print(star);
        //                 star = star == "*" ? " " : "*";
        //           }else{
        //               System.out.print(" ");
        //           }
        //       }
        //   }
         //method 2
          for(int j = 0; j < 2*n; j++){
              int mid = n-1;
              if(i < n && j <= mid+i){
                  if(j >= mid -i){
                      System.out.print(star);
                      star = star == "*" ? " " : "*";
                  }else System.out.print(" ");
              }else if(i >= n && j <= 3*n - 2 -i){
                  if( j >= i - n ){
                     System.out.print(star);
                    star = star == "*" ? " " : "*";
                  }else System.out.print(" ");
              }
          }
           star = "*";
           System.out.println();
       }
    }
}
