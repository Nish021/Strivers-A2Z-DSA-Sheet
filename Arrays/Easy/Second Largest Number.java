public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i = 0; i < n ; i++){
            if(max < a[i]){
                smax = max;
                max = a[i];
            }else if(a[i] < max && a[i] > smax){
                smax = a[i];
            }

            if(min > a[i]){
                smin = min;
                min = a[i];
            }else if(a[i] > min && a[i] < smin){
                smin = a[i];
            }
        }
        return new int[]{smax, smin};
    }
}
