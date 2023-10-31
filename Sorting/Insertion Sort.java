class Solution
{
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  { 
      for(int i = 0; i < n; i++){
          int j = i;
          while(j > 0 && arr[j] < arr[j-1]){
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                    j--;
          }
        }
  }
}

//Recursive solution
public class Solution {

    static void Recursive(int i, int n, int[] arr){
        if(i == n)
        return;

       int j = i;
          while(j > 0 && arr[j] < arr[j-1]){
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                    j--;
          }

        Recursive(i+1, n, arr);
    }
    public static void insertionSort(int[] arr, int size) {
        Recursive(0, size, arr);
    }
}
