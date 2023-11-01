import java.util.ArrayList;
import java.util.List;

public class Solution {

    static void merge(int[] arr, int l, int m, int r){
        List<Integer> temp = new ArrayList<>();
        int i = l;
        int t = m + 1;
        while(i <= m && t <= r){
            if(arr[i] <= arr[t]){
                temp.add(arr[i]);
                i++;
            }else {
                temp.add(arr[t]);
                t++;
            }
        }
        while(i <= m){
            temp.add(arr[i]);
            i++;
        }
        while(t <= r){
            temp.add(arr[t]);
            t++;
        }
        int k = 0;
        for (int j = l; j <= r; j++) {
            arr[j] = temp.get(k);
            k++;
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if(l >= r)
        return;
        int m = (l+r)/2;
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        merge(arr,l,m,r); 
    }
}
