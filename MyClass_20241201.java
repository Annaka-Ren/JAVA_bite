import java.util.Scanner;

public class MyClass_20241201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字n：");
        int num = scanner.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += fib(i);
        }
        return sum;
    }
    public static int fib(int count){
        // 递归求斐波那契数列的第 N 项
        if(count == 1){
            return 1; // 斐波那契数列的第0项是0
        }
        if(count == 2){
            return 1; // 斐波那契数列的第1项是1
        }
        return fib(count - 1) + fib(count - 2); // 递归计算第count项
    }
//    public static int everySum(int num){
//        //写一个递归方法，输入一个非负整数，返回组成它的数字之和
//        if(num < 9){
//            return num;
//        }
//        return num % 10 + everySum(num / 10);
//    }
//    public static void everyPlant(int num) {
//        if(num>9){
//            everyPlant(num / 10);
//        }
//        System.out.print(num % 10 + "  ");
//    }
//    public static void everyPlant(int num){
//        // 按顺序打印一个数字的每一位（例如 1234 打印出 1 2 3 4）（递归)
//        if(num == 0 || num < -10){ // 添加了对负数的处理
//            return;
//        }
//        // 递归调用处理下一位数字
//        everyPlant(num / 10);
//        // 打印当前位的数字
//        if(num >= 10){ // 确保不打印0的位数
//            System.out.print(num % 10);
//        }
//    }
//    public static int sum(int num){
//        //递归求 1 + 2 + 3 + ... + 10
//        if(num == 1){
//            return 1;
//        }
//        return num + sum(num - 1);
//    }
//    public static int factor(int num){//递归求 N 的阶乘
//        if(num == 0){//1, 2, 6, 24
//            return 1;
//        }
//        return num*factor(num-1);
//    }
//    public static double max(double a, double b){
//        //在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值？
//        return Math.max(a, b);
//    }
//    public static double max(double a, double b, double c){
//        //1, 2, 3       2, 1, 3       3, 2, 1
//        return Math.max(a, Math.max(b, c));
//    }
    //求斐波那契数列的第n项。(迭代实现)
//    public static int fib(int num){
//        int sum = 0;
//        if(num == 1 || num == 2){
//            return 1;
//        }else{
//            int a = 1;
//            int b = 1;//指前两项
//            int c = 0;//第三项
//            for(int i = 3;i <= num; i++){// 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//                c = a + b;           // a, b, c
//                a = b;                   //    a, b, c
//                b = c;                   //       a, b, c
//
//            }
//            return c;
//        }
//    }
    //求1！+2！+3！+4！+........+n!的和
//    public static int factor(int num){
//        int sum = 0;
//        for(int i = 1; i <= num; i++){
//            int place = 1;
//            for(int j = 1; j <= i; j++){
//                place *= j;
//            }
//            sum += place;
//        }
//        return sum;
//    }
}
