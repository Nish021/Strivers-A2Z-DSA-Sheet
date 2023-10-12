/*
Input: 5

Output:
A
AB
ABC
ABCD
ABCDE
*/
class Solution {

    void printTriangle(int n) {
        // code here
        char abc = 'A';
        for(int i = 0;i < n; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print(abc);
                abc++;
            }
            abc = 'A';
            System.out.println();
        }
    }
}
