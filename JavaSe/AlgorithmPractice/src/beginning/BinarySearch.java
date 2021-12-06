package beginning;

/**
 * @author Liu
 * @version 1.0
 * @date 2021/12/6 20:05
 */
public class BinarySearch {
    public static int find(int target, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid = left + (right - left) >> 1;
        while (true) {
            if (target > arr[mid]) {
                left = mid;
            } else if (target < arr[mid]) {
                right = mid;
            } else {
                break;
            }
            mid = left + (right - left) >> 1;
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(find(3,arr));
    }
}
