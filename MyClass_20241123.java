public class MyClass_20241123 {
    public static void main(String[] args) {
//        System.out.println("hello world!");
        //定义变量
//        int a = 10;
//        System.out.println(a);
//        //给变量赋值
//        a = 100;
//        System.out.println(a);
//        int b = 20;
//        int c = 30;
//        int d = 40;
//        int b = 20, c = 30, d = 40;
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

        //如果进行运算的时候,数据超出最大/最小值的范围,就会出现溢出的情况
        //此时得到的结果就是"错误的结果".
//        int a = Integer.MAX_VALUE + 1;
//        System.out.println(a);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
        //关于浮点型特殊的问题
//        double a = 1;
//        double b = 2;
//        System.out.println(a / b);
//        double a = 1.1;
//        //结果应该是1.21
//        System.out.println(a * a);
//        boolean a = true;
//        boolean b = false;
//        int a = 10;
//        long b = 20;
//        System.out.println(a);
//        System.out.println(b);
        //把 a 赋值给 b
//        b = a;
//        //把 b 赋值给 a
//        a = (int)b;
//        double a = 1.1;
//        int b = (int)a;
//        System.out.println(b);
        //不能把字符串强转为整数
        //int a = (int)"hello";
//        int a = 10;
//        long b = 20;
//        long c = a + b;
//        int d = (int)(a + b);
//          int a = 1;
//          double b = 2;
//          System.out.println(a / b);
        //只要有一个操作数是 double,另一个也会自动提升为 double

        //short / byte在进行算术运算时,即使是相同类型,也会触发类型提升~~
//        byte a = 10;
//        byte b = 20;
//        int c = a + b;
//        byte d = (byte)(a+b);
        //之所以要对short和byte进行类型提升,是因为
        //short 和 byte本身的范围太小了
//        String s = "hello";
//        System.out.println(s);
//        System.out.println(s.length());

        //把 int 转为 String
        //1.直接使用 + 把 int 和 "" 进行 + 运算,得到的结果仍然是字符串
//        String s = 10 + "";//得到的结果是"10"
//        System.out.println(s);

        //2.使用 valueOf 方法.
        //这两种方法,同样适用于 long, short, double等其他数字类型.
//        String s2 = String.valueOf(10);
//        System.out.println(s2);

        //把 String 转为 int
        //把 String 转为 double
//        String s = "10";
//        int a = Integer.parseInt(s);
//        double b = Double.parseDouble(s);
//        long c = Long.parseLong(s);
//        System.out.println(a);

        //运算符
//        int a = 10;
//        int b = 20;
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);

//        int a = 10;
//        int b = 0;
//        System.out.println(a / b);
//        double a = 2.5;
//        double b = 0.4;
//        System.out.println(a % b);

        //复合运算
//        int a = 10;
//        //相当于 a = a + 20;
//        a += 20;
//
//        int a = 10;
//        int b = a++;
//        System.out.println(b);

        int a = 10;
        int b = 20;
        int c = 30;
//        System.out.println(a > b);
//        System.out.println(!(a > b));
        System.out.println(a > b && 10 / 0 == 0);
        System.out.println(a < b || 10 / 0 == 0);

    }
}
