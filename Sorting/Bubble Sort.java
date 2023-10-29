class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        int swapTrue = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    
                    swapTrue = 1; //optimization if all elements are already sorted
                }
            }
            if(swapTrue == 0)
            break;
        }
    }
}
