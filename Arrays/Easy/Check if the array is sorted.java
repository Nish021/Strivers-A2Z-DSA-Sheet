public class Solution {
    public static int isSorted(int n, int []a) {
        int flag = 0;
        for(int i = 0; i < n-1 ; i++){
            if(a[i] > a[i+1]){
                flag = 1;
                break;
            }
        }
        return flag == 0 ? 1 : 0;
    }
}
