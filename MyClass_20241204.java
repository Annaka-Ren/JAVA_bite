import java.util.Arrays;
import java.util.Scanner;

public class MyClass_20241204 {
    public static void main(String[] args) {
        //第一个代码，new出了一个数组，并且创建引用指向这个数组。
//        int[] arr1 = new int[]{1, 2, 3};
//        //第二个代码，没有new数组，而是只创建一个引用，这个引用指向的是刚才的这个数组。
//        int arr2[] = arr1;
//        arr2[0] = 100;
//        arr2[1] = 200;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

        //创建了一个 arr 数组引用，指向 null
        //此时这个引用其实是一个无效的引用，此时不能针对这个引用进行[]或者 . 操作。
        //进行赋值或者是进行 == / ！= 是 ok 的。
//        int[] arr = null;
//        int[] arr2 = arr;
//        System.out.println(arr == arr2);
//        int[] arr = {1, 2, 3};
//        int[] arr2 = Arrays.copyOf(arr, arr.length);
        //创建新数组，并把旧数组的元素一个一个的赋值过去

//        int[] arr = {1, 2, 3, 4, 5};
//        //[ 1, 3)区间
//        int[] arr2 = Arrays.copyOfRange(arr, 1, 3);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
        //range意为“区间”， 编程中绝大部分区间， 都是前闭后开区间
        //少数情况是前后闭区间
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("请输入一个数字：");
//
//        int target = scanner.nextInt();
//
//        int[] nums = {2, 7, 11, 15};
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if (nums[i] + nums[j] == target) {
//
//                    System.out.println("[" + i + "," + j + "]");
//
//                }
//
//            }
//
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入5个数字, 以空格分隔：");
        int[] arr = new int[5]; // 直接使用int数组，避免后续转换
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt(); // 直接读取整数
        }
        scanner.close(); // 关闭Scanner以释放资源
        int flag = 0;
        for(int i = 0; i < arr.length; i++){
            flag = 0;
            for(int j = 0; j < arr.length; j++){
                if (i != j) { // 避免自身异或
                    flag = flag ^ arr[j];
                }
            }
            if(flag == arr[i]){
                System.out.println(arr[i]);
                break;
            }
        }
//
//        boolean found = false; // 使用布尔变量来表示是否找到连续三个奇数
//        int oddCount = 0; // 当前连续的奇数计数
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) { // 检查是否为奇数
//                oddCount++; // 增加奇数计数
//                if (oddCount == 3) { // 如果连续奇数达到3个
//                    found = true; // 设置找到标志
//                    break; // 无需继续检查，直接退出循环
//                }
//            } else {
//                oddCount = 0; // 重置奇数计数（遇到非奇数时）
//            }
//        }
//
//        if (found) {
//            System.out.println("存在三个连续的奇数：true");
//        } else {
//            System.out.println("存在三个连续的奇数：false");
//        }

        //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

    }
}