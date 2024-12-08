import java.util.Arrays;

public class MyClass_20241207 {
    public static void main(String[] args) {
        //调用一下二分查找
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int index = binarySearch(arr, 8);
//        System.out.println(index);

        //调用冒泡排序
//        int[] srr = {9, 5, 2, 7, 3, 6};
////        bubbleSort(arr);
//        //标准库也提供了现成的排序算法
//        Arrays.sort(arr);//优先使用标准库的排序
//        System.out.println(Arrays.toString(arr));

        //调用逆序操作
//        int[] arr = {1, 2, 3, 4, 5};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));

        //定义二维数组
        //创建了 3 行 4 列的二维数组
//        int[][] arr = new int[3][4];
//        //一个疮毒为散的一维数组，每个元素长度为4
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
    }



    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        //此处不需要写作<=
        //一个元素不需要进行交换
        while (left < right) {
            //交换操作
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;

            left++;
            right--;
        }
    }

//    public static void bubbleSort(int[] arr){
//        //确定接下来要冒泡多少趟
//        //数组有多长，就应该冒多少泡
//        for(int i = 0; i < arr.length - 1; i++){
//            //进行每一趟具体的冒泡
//            for(int j = 0; j < arr.length - i - 1; j++){
//                if(arr[j] > arr[j +1]){//此处决定升降序
//                    //交换两个元素
//                    arr[j] ^= arr[j+1];
//                    arr[j+1] ^= arr[j];
//                    arr[j] ^= arr[j+1];
//                }
//            }
//        }
//    }

    //找到了返回对应元素的下标
    //没找到返回-1

//    public static int binarySearch(int[] arr, int target) {
//        //待查找区间左右两边的元素
//        int left = 0;
//        int right = arr.length - 1;
//        //此处的mid就是中间位置元素的下标， 需要进行取整， 不能得到小数
//
//        while(left <= right){
//            int mid = (left + right)/2;
//            //比较中间位置的元素，是否和目标元素相同
//            //并且根据大小关系，决定下一步查找的区间
//            if(target < arr[mid]){
//                right = mid - 1;
//            }else if(target > arr[mid]){
//                left = mid + 1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;//没找见
//    }
}
