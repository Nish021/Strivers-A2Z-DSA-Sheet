class Solution {

     public static void reverse(int[] arr, int i, int j){

        while(i <= j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

            i++;
            j--;
        }
    }
    public void rotate(int[] arr, int k) {

        int n = arr.length;
        k = k%n;
        //left
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        //right
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        
    }
}
