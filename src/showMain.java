public class showMain{
    public  static  void main(String[] args){

        //构造的写法
//        Student s=new Student("李四",20);
//        s.show();

//        //封装的写法
//        getseTest s=new getseTest("李四",29);
//        System.out.println(s.getName());
//        s.setName("张三");
//        System.out.println(s.getName());

        //继承的方法
        donInherit dog=new donInherit("xiaowang");
//        dog.name="小黑";
       dog.eat("小黑"); //继承父类
       dog.bark(); //自己写的
    }
}