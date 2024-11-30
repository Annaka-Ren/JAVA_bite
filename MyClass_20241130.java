public class MyClass_20241130 {
    public static void main(String[] args) {
//        //计算1！ + 2！ + 3！ + 4！ + 5！的和
//        int sum = 0;
//        for(i = 1; i <= 5; i++){
//            int result = factor(i);
//            sum += result;
//        }
//        System.out.println(sum);
//        int num = 10;
//        function(num);
//        System.out.println(num);
////        System.out.println(factor(5));
//        print(1234);
        System.out.println(sum(1729));
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和。
    //例如，输入1729，则返回 1+7+2+9 ，它的和是19
//    public static int place(int num){
//        if(num == 0){
//            return num;
//        }
//        return num % 10;
//    }
//    public static int sum(int num){
//        int sum = 0;
//        while(num != 0){
//            sum += place(num);
//            num /= 10;
//        }
//        return sum;
//    }
    //针对这个num整数的每一位进行求和
    //num是 >= 0的整数
    public static int sum(int num){
        if(num < 10){
            //一位数.
            return num;
        }
        //多位数，个位的值 + 递归的其他位的结果
        return num % 10 + sum(num / 10);
    }
//    //通过递归的方式求阶乘
//    public static int factor(int n){
//        if(n == 1){
//            return 1;
//        }
//        return n * factor(n-1);
//    }
//    public static int swap(int x, int y){
//        x ^= y;
//        y ^= x;
//        x ^= y;
//
//    }
//    //计算n的阶乘是多少
//    public static int factor(int n){
//        int result = 1;
//        for(int i = 1; i < n; i++){
//            result *= i;
//        }
//        return result;
//    }
//    public static void function(int n){
//        n = 100;
//        System.out.println(n);
////    }
//    public static void print(int num){
//        if(num >= 10){
//            print(num / 10);
//        }
////        System.out.print(num % 10 + " ");
//    }

}
