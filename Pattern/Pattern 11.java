/*
Input: 5

Output:
1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1
*/

class Solution {

    void printTriangle(int n) {
        // code here
        
        int flag;
        for(int i = 0; i < n; i++){
           flag =  i%2 == 0 ? 1 : 0;
                for(int j = 0 ; j <= i ;j++){
                    System.out.print(flag + " ");
                    flag = flag == 0 ?  1:  0;
                }
            System.out.println();
            }
        }
    }
