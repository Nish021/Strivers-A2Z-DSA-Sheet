/*
Input: 5

Output:
ABCDE
ABCD
ABC
AB
A
*/

class Solution {

    void printTriangle(int n) {
        char abc = 'A';
        for(int i = n-1; i>=0 ; i--){
            for(int j = 0; j <= i; j++){
                System.out.print(abc);
                abc++;
            }
            abc='A';
            System.out.println();
        }
    }
}
