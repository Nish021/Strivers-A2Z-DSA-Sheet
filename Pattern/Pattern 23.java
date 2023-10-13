/*
Input: 5

Output:
E
E D
E D C
E D C B
E D C B A
*/
class Solution {

    void printTriangle(int n) {
        // code here
        char abc = (char) ('A' + n - 1);
        for(int i = 0; i < n ; i++){
            for(int j = 0; j <= i ;j++){
                System.out.print(abc+" ");
                abc--;
            }
            abc = (char) ('A' + n - 1);
            System.out.println();
        }
    }
}
