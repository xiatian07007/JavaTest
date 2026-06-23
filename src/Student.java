
public class Student {
    String name;
    int age;

    //构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("姓名" + name + ",年龄：" + age);
    }
}
