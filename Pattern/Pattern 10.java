/*
Input: 5

Output:
* 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
*

*/
class Solution {

    void printTriangle(int n) {
        // code here
                int c = 1;
        for(int i = 0; i < 2*n-1 ; i++){
            if(i < n){
                for(int j = 0; j <= i; j++){
                    System.out.print("* ");
            }
            }else if(i >= n){
                for(int j = 0; j < i-c; j++){
                    System.out.print("* ");
                }  
                c = c + 2;
            }
            
            System.out.println();
        }
    }
}
