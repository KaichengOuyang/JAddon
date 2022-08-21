package Search;

public class BasicSearch {
    public static int LinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int BinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key){
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static int InterpolationSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (key - arr[low]) * (high - low) / (arr[high] - arr[low]);
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int JumpSearch(int[] arr, int key) {
        int step = (int) Math.sqrt(arr.length);
        while (arr[Math.min(step, arr.length) - 1] < key) {
            step += (int) Math.sqrt(arr.length);
            if (step > arr.length) {
                return -1;
            }
        }
        while (arr[step] < key) {
            step++;
        }
        if (arr[step] == key) {
            return step;
        }
        return -1;
    }

    public static int ExponentialSearch(int[] arr, int key) {
        int step = 1;
        while (step < arr.length && arr[step] < key) {
            step *= 2;
        }
        int low = 0;
        int high = step;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}