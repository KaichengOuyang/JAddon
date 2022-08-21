package Search;

public class AdvancedSearch {
    public static int AdvancedLinearSearch(int arr[], int key){
        int low;
        int high = arr.length - 1;
        for(low = 0; low < arr.length; low++){
            high--;
            if(arr[low] == key || arr[high] == key){
                return low;
            }
        }
        return -1;
    }
}
