/*
Input Format: N = 6
Result:   
F
E F
D E F
C D E F
B C D E F
A B C D E F
*/
class Solution {

    void printTriangle(int n) {
        for(int i = 0; i < n ; i++){
            for(int j = 0; j <= i ;j++){
                int t = n - i + j ;
                char abc = (char)('A' + t - 1);
                System.out.print(abc+" ");
            }
            System.out.println();
        }
    }
}
