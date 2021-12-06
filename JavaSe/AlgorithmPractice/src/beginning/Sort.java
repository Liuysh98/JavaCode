package beginning;

/**
 * @author Liu
 * @version 1.0
 * @date 2021/12/6 17:58
 */


public class Sort {

    /* A utility function to swap the two elements of arr*/
    public static void swap(int[] arr, int i, int j) {
        // 不用额外的空间怎么交换两个值
        arr[i] = arr[i] ^ arr[j];
        // j = i^j ^j=i
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];

    }

    /* Function to sort array using bubble sort*/
    public static void bubbleSort(int[] arr) {
        //avoid
        if (arr == null || arr.length < 2) {
            return;
        }
        //bubble area
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }

    /* Function to sort array using insertion sort*/
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //0到i-1有序，想让0到i有序
        for (int i = 1; i < arr.length; i++) {
            //当i左比i大且不越界，就换
            for (int j = i - 1; arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    // Driver method
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 3, 8, 8, 7, 5, 1, 7, 7, 9, 7, 6, 9, 5, 3, 0, 2};
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }


}
