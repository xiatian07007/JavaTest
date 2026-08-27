public class  Cat  extends  Animal implements Swimmable{
String type;
public Cat(String name,int age,String statusType,String type){
super(name, age, statusType);
this.type=type;

}

public void aget(){
    //getName输出可以得到名称
    System.out.println("我得名字叫:"+getName()+"今年"+getAge()+"岁了"+",类型是"+getStatusType()+"性别："+type);
}
@Override
public void introduce(){
    System.out.println("我得名字叫:"+getName()+"今年"+getAge()+"岁了"+",类型是"+getStatusType()+"性别："+type);
}

//独有的方法
    public void catchMouse(){
    System.out.println("猫在抓老鼠");
    }


    //重写抽象类
    @Override
    public  void makeSound(){
        System.out.println(getName()+"在喵喵喵");
    }

    @Override
    public  void swim(){
    System.out.println(getName()+"会游泳");
    }
}
