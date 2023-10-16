/*
for String
Input: S = "abba"
Output: 1
Explanation: S is a palindrome

for number
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

*/
class Solution {
    int isPalindrome(String S) {
        
        int i = 0;
        int j = S.length()-1;
        
        while(i <= j){
            if(S.charAt(i) == S.charAt(j)){
                i++;
                j--;
            }else 
            return 0;
        }
        return 1;
    }
};
// o(S.length)

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)//negative
        return false;

        //reversing and storing in y
        int y = 0;
        int temp = x;
        while(temp > 0){
            y = y*10 + temp%10 ;
            temp /= 10;
        }
        return x == y ? true : false;
    }
}
// o(log n) -> for reversing a number
