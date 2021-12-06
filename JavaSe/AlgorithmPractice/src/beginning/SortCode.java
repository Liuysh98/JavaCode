//package beginning;
//
//import org.jetbrains.annotations.NotNull;
//
///**
// * @author Liu
// * @version 1.0
// * @date 2021/12/6 17:37
// */
//public class SortCode {
//
//
//
//    public static void bubbleSort(int[] arr) {
//        //预防傻逼
//        int limit = 2;
//        if (arr == null || arr.length < limit) {
//            return;
//        //肯定要冒长度轮,每次把最大的数冒到末位
//        for (int b = arr.length - 1; b > 0; b--) {
//            //从第一个开始冒
//            for (int i = 0; i < b; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    swap(arr, i, i + 1);
//                }
//            }
//
//        }
//
//    }
//
//    public static void selectionSort(int[] arr) {
//        zeroOne(arr);
//    }
//
//    public static void insertionSort(int[] arr){
//            //预防傻逼
//            int limit = 2;
//            if (arr == null || arr.length < limit) {
//                return;
//
//                for (int i = 0; i < arr.length; i++) {
//                    for (int j = i; j > 0; j--) {
//                        if arr
//                    }
//
//                }
//            }
//
//
//    public static void swap ( int @NotNull [] arr, int i, int j){
//                // 不用额外的空间怎么交换两个值
//                arr[i] = arr[i] ^ arr[j];
//                // j = i^j ^j=i
//                arr[j] = arr[i] ^ arr[j];
//                // i = i^j ^i=j
//                arr[i] = arr[i] ^ arr[j];
//            }
//        }