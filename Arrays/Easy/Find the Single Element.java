public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        for(int i = 0; i < arr.length-1 ; i = i + 2){
            if(arr[i] != arr[i+1])
            return arr[i];
        }
        return arr[arr.length-1];
    }
}
