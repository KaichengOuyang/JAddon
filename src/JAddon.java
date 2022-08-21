import JSQL.Controller;
import Search.AdvancedSearch;
import Search.BasicSearch;

public class JAddon {
    public static int LinearSearch(int[] arr, int key) {
        return(BasicSearch.LinearSearch(arr, key));
    }
    public static int BinarySearch(int[] arr, int key) {
        return(BasicSearch.BinarySearch(arr, key));
    }
    public static int InterpolationSearch(int[] arr, int key) {
        return(BasicSearch.InterpolationSearch(arr, key));
    }
    public static int JumpSearch(int[] arr, int key) {
        return(BasicSearch.JumpSearch(arr, key));
    }
    public static int ExponentialSearch(int[] arr, int key) {
        return(BasicSearch.ExponentialSearch(arr, key));
    }
    public static int AdvancedLinearSearch(int[] arr, int key) {
        return(AdvancedSearch.AdvancedLinearSearch(arr, key));
    }
    public static void main(String filePath){
        Controller.Main(filePath);
    }
}
