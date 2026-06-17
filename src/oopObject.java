//定义一个人的类。写在一块的时候
public class oopObject{
    public static void main(String[] args){
        Persons p=new Persons();
        p.name="张三";
        p.age=18;
        p.sayHello();
    }
}

//使用

 class Persons{
     String name;//属性
     int age;

     //方法
     public void sayHello(){
         System.out.println("你好。我是"+name);
     }
}
