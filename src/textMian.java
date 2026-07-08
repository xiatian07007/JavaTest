//构造方法
//public class textMian {
//  String name;//可以添加private
//  int age; //可以添加private
////  //构造方法
//    public textMian(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
//
//    //getter获取
//    public String getName(){
//        return name;
//    }
////    setter设置
//    public void setName(String name){
//        this.name=name;
//    }
//
//    public  int getAge(){
//        return age;
//    }
//
//    public  void setAge(){
//        if(age>0){
//            this.age=age;
//        }else{
//            System.out.println("年龄不合法");
//        }
//    }
//
////    //输出
////    public void show(){
////        System.out.println(name+age);
////    }
//
//    //
public class textMian {
    //继承
    public static void main(String[] args){
    son sog=new son();
        sog.name="小黑";
        sog.eat();
        sog.bark();//自己的

    }
}
//构造方法
//textMian p =new textMian("zhansan",19)