import java.util.Random;
import java.util.Scanner;

public class MyClass_20241127 {
    public static void main(String[] args) {
//        //求一个整数，在内存当中存储时，二进制1的个数。
//        System.out.print("请输入一个整数：");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int count = 0;
//        for(int i = 0; i < 32; i++){
//            if((num & (1 << i)) == (1 << i)){
//                count++;
//            }
//        }
//        System.out.println("二进制1的个数为：" + count);
        //给定两个数，求这两个数的最大公约数
        //例如：
        //输入：20 40
        //输出：20
//        System.out.println("请输入两个数以空格分隔：");
//        Scanner scanner = new Scanner (System.in);
//        //读取两个整数
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        //以下求最大公约数
//        while (num2 != 0) {
//            int temp = num2;
//            num2 = num1 % num2;
//            num1 = temp;
//        }
//        System.out.println("最大公约数为：" + num1);
        //求出0～n之间的所有“水仙花数”并输出。
        // (“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身
        // 如；153＝1^3＋5^3＋3^3，则153是一个“水仙花数“。）
//        int a = 100;
//        for(a = 100; a <= 999; a++){
//            if(Math.pow(a%10,3) + Math.pow((a/10)%10,3) + Math.pow((a/100)%10,3) == a){
//                System.out.println(a + "是一个水仙花数");
//            }
//        }
        //输出一个整数的每一位，如：123的每一位是3，2，1
//        System.out.print("请输入一个整数：");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        while(num != 0){
//            System.out.println(num%10);
//             num /= 10;
//        }
//        System.out.println("请输入：");
//        Scanner scanner = new Scanner(System.in);
//        if(scanner.hasNext()){
//            String s = scanner.next();
//            System.out.println("输入的字符串是：" + s);
//        }else{
//            System.out.println("输入有误");
//        }
        //处理多组输入,输入若干个整数，计算其平均值
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//        while(scanner.hasNextInt()){
//            int num = scanner.nextInt();
//            sum += num;
//            count++;
//        }
//        System.out.println("平均值是:" + (double)sum/count);
        //猜数字.
        //1.先生成一个 1 - 100 之间的随机整数
        Random random = new Random();
        int answerNum = random.nextInt(100) + 1;
        //2.让用户输入一个数字，进行猜测过程
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入一个整数[1-100]：");
            int guessNum = scanner.nextInt();
            if(guessNum < answerNum){
                System.out.println("猜小了");
            } else if (guessNum > answerNum) {
                System.out.println("猜大了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }

    }
}
