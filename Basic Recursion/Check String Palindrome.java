public class Solution {
    public static boolean reverse(int i, int j, String str){
        if(i > j)
        return true;

         if (str.charAt(i) == str.charAt(j)) {
            return reverse( i + 1, j - 1, str);
        }
        return false;
    }
    //Alternate
    //     return (str.charAt(i) == str.charAt(j) && reverse(i+1, j-1, str));
    // }


    public static boolean isPalindrome(String str) {
        boolean res = reverse(0, str.length()-1, str);
        return res;
    }
}
