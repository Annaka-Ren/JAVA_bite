public class Date {

    public int year;

    public int month;

    public int day;

    //代码块
    {
        year = 2024;
        month = 12;
        day = 14;
        System.out.println("代码块初始化");
    }

    public void setDate(int year, int month, int day){
        //通过this这样的关键字，表明哪些是成员变量
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //添加toString方法，把对象转成 String
     //注意此处的写法，方法名字固定 toString，返回值类型是String，无参数
//    public String toString(){
//        return year + "/" + month + "/" + day;
//        //toString是一个特殊的方法
//        //当打印对象的时候，编译器会自动调用 toString
//        //把对象转成String
//    }

    @Override
    public String toString() {
        return "Date{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }


    //可以根据需要些任意个构造方法，满足不同的初始化方式
//    public Date(){
////        year = 2024;
////        month = 12;
////        day = 14;
//        //this必须在第一行
//        //代码的复用
//        this(2024, 12, 14);
//        System.out.println("调用构造方法");
//    }

//    public Date(int year, int month, int day){
////        this.year = year;
////        this.month = month;
////        this.day = day;
//        System.out.println("调用第二个构造方法");
//    }

    public void printDate(){
        //如果方法中不存在局部变量名字和成员变量冲突，不写this也可以
        //方法也是如此
        System.out.println(this.year + "-" + month + "-" + day);
    }

    //三种初始化的执行顺序
    //1.就地初始化
    //2.代码块初始化
    //3.构造方法初始化
    public static void main(String[] args) {
        //Date date = new Date();
        //date.setDate(2024,12,14);
//        Date date = new Date();
//        date.printDate();
        Date date = new Date();
        System.out.println(date);
    }

}
