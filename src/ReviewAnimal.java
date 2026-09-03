public class ReviewAnimal {
 private  String name;
 private  int  age;
 private String status;
public  ReviewAnimal(String name,int age,String status){
    this.name=name;
    this.age=age;
    this.status=status;
}
public String getName(){
    return name;
}
    public int getAge(){
        return age;
    }
    public String getStatus(){
        return status;
    }


    public void setName(String name){
       this.name=name;
    }
    public void setAge(int age){
        if(age<18){
            System.out.println("你是 未成年");
        }else{
            this.age=age;
        }
    }
    public void setStatus(String status){
        this.status=status;
    }
    //赋值普通得方法
    public void  introduce(){
    System.out.println("我叫"+getName()+"今年"+getAge()+"岁属于"+getStatus());
    }


}
