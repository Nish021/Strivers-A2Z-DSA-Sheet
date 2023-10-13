/*
Input: 5

Output:
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1
*/
class Solution {

    void printTriangle(int n) {
        // code here
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < 2*n ; j++){
                if(j <= i|| (j >= 2*n - 1 - i && j <= 2*n - 1 + i)){
                    if(j < n)
                    System.out.print(j+1 + " ");
                    else
                    System.out.print( (2*n-j) + " ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
