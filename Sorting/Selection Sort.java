public class Solution {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        for(int i = 0 ; i < arr.length-1 ; i++){
            int mini = i;
            for(int j = i+1; j < arr.length ; j++){
                if(arr[mini] > arr[j]){
                    mini = j;
                }
            }
            if(mini != i){
                    int t = arr[mini];
                    arr[mini] = arr[i];
                    arr[i] = t;
            }
        }
    }
}
