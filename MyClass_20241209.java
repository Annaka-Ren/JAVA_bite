import java.util.Arrays;

public class MyClass_20241209 {
    public static void main(String[] args) {
//        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int[] arr2 = {1, 3, 9, 4, 6};
//        int[] arr3 = {3, 2, 3};
        int[] arr4 = {1, 2, 3, 4, 5, 6};
//        int target = 7;
        System.out.println(Arrays.toString(moveForwardOddNumber(arr4)));
    }

    //给定一个有序整型数组, 实现二分查找
//    public static int binarySearch(int[] arr, int target){
//        int left = 0;
//        int right = arr.length - 1;
//        int mid = 7;
//        while(arr[left] <= arr[right]){
//            mid = (left + right) / 2;
//            if(target > arr[mid]){
//                left = mid;
//            }else if(target <arr[mid]){
//                right = mid;
//            }else if(target == arr[mid]){
//             break;
//            }
//        }
//        return mid;
//    }

    //给定一个整型数组, 实现冒泡排序(升序排序)
//    public static int[] bubbleSort(int[] arr) {
//        for(int i = 0; i < arr.length - 1; i++){
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//        return arr;
//    }
    //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
//    public static int[] findNumbers(int[] arr){
//        int count = 1;
//        int j = 0;
//        int[] arr2 = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            for(j = 1; j < arr.length; j++){
//                if(arr[i] == arr[j]){
//                    count += 1;
//                    arr[j] = 0;
//                    continue;
//                }
//            }
//            if(count > arr.length / 2){
//                arr2[i] = arr[i];
//            }
//        }
//        return arr2;
//    }

    //奇数位于偶数之前
//    public static int[] moveForwardOddNumber(int[] arr){
//        for(int i = 0; i < arr.length - 1; i++){
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] % 2 == 0) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//        return arr;
//    }
}