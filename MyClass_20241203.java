import java.util.Arrays;
import java.util.Scanner;

public class MyClass_20241203 {
    public static void main(String[] args) {
//        int[] arr = new int[10];//创建长度为10的int数组，每个元素都初始化为0
//        int[] arr2 = {1, 2, 3, 4, 5};//创建一个长度为5的数组
//        System.out.println("请输入数组的长度：");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
        int[] arr = {1, 2, 3};
        transform(arr);
        for(int num : arr){
            System.out.println(num);
        }
        //arr.length
        //Arrays.toString(arr);
    }
    public static void transform(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * 2;
        }
    }
}
