public class Cat {
    public String name;
    public String category;
    public int age;

    public void bark(){
        System.out.println("喵喵");
    }
    public void eat(String food){
        //方法中可以直接使用前面创建的成员变量（属性）
        System.out.println(name + "正在吃" + food);
    }

    public void sleep(){
        System.out.println("正在睡觉");
    }

    public static void main(String[] args) {
        //通过一个类，可以创建多个对象
        Cat cat1 = new Cat();
        cat1.name = "月月";
        System.out.println(cat1.name);

        cat1.bark();
        cat1.eat("猫粮");
    }
}
