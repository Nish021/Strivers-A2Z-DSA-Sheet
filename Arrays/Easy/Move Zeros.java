class Solution {
    public void moveZeroes(int[] a) {
       int n = a.length;
       int i = 0;
       int j = 0;

       while(i < n){
           if(a[i] == 0){
               i++;
               continue;
           }
           if(i != j){
               int t = a[i];
               a[i] = a[j];
               a[j] = t;
           }
            i++;
            j++;
       }
    }
}
