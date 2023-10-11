/*
Input:
N = 4

Output:
1
2 3
4 5 6
7 8 9 10
*/

class Solution{
    static void printFloydTriangle(int n){
        // code here
        int m = 1;
        for(int i = 0; i < n;i++){
            for(int j = 0; j <= i ; j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }
}
