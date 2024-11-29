import java.util.Scanner;

public class MyClass_20241129 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = 0;
//        boolean isleapYear = false;
//        while(scanner.hasNextInt()){
//            System.out.println("请输入年份：");
//            year = scanner.nextInt();
//            isleapYear = isleapYear(year);
//            System.out.println(year + "是否为闰年：" + isleapYear);
//        while (true) {
//           isleapYear2();
//        }
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请分两次输入两个整数：");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            //一次 nextInt 就是输入一个整数，读两个需要调用两次
            int result = add(num1, num2);
            System.out.println("两数之和为：" + result);
        }
    }

    //        System.out.println("请输入年份：");
//        //注意：同一个作用域中{}不能存在两个相同名字的变量
//        //要么定义不同的变量名，要么去掉后续的变量定义操作
//        year = scanner.nextInt();
//        boolean isleapYear = isleapYear(year);
//        System.out.println(year + "是否为闰年：" + isleapYear);
    public static boolean isleapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void isleapYear2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + "是闰年");
            } else {
                System.out.println(year + "不是闰年");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println(year + "是闰年");
            } else {
                System.out.println(year + "不是闰年");
            }
        }
    }
    public static int add(int x, int y) {
        return x + y;
    }
}
