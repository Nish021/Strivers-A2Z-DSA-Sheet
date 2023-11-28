class Solution {
    public boolean check(int[] a) {
        int cnt = 0;
        for(int i = 0; i < a.length-1; i++){
            if(a[i] > a[i+1])
            cnt++;

            if(cnt > 1)
            return false;  //break more than once
        }

        if(a[0] < a[a.length-1]){
            if(cnt == 0)
            return true; // sorted and not break
            else
            return false; // break once but not sorted
        }

        return true; //break once and sorted

      //brute force
    //    boolean flag = false;
    //    int cnt = 0;
    //    if(a.length == 1)
    //    return true;

    //    for(int i = 0; i < a.length-1; i++){
    //        if(a[i] <= a[i+1]){
    //            flag = true;
    //        }else if(a[i] > a[i+1]){
    //            cnt++;
    //            if(a[i+1] <= a[0] && a[i] >= a[a.length-1] && 
    //            a[a.length-1] <= a[0]){
    //                flag = true;
    //            }else {
    //                return false;
    //            }
    //        }
    //    }
    //    if(cnt > 1)
    //    flag = false;

    //    return flag;
    }
}
