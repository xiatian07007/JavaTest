public class Animal {
   //类
   private    String  name;
     private   int age ;
     private String  statusType;
//构造方法
public Animal(String name,int age,String statusType){
this.name=name;
this.age=age;
this.statusType=statusType;
}

//get方法
public String getName(){
//    System.out.println(this.name);
    return name;


}
    public int getAge(){
//        System.out.println(this.age);
        return age;

    }
    public String getStatusType(){
        return statusType;
    }

    //set方法
    public void setName(String name){
    this.name=name;
    }

    public void setAge(int age){
        if(age<=-1){
            System.out.println("年龄必须大于 0");
        }else{
            this.age=age;
        }
    }

    public void SetStatusType(String statusType){
        this.statusType=statusType;
    }

    public void introduce(){
    System.out.println("我得名字叫:"+name+"今年"+age+"岁了"+",类型是"+statusType);
    }
}
