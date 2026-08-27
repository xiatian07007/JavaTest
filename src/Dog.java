public class Dog extends Animal implements Swimmable , train  {
    private   String skill;
    public Dog(String name,int  age,String statusType,String skill){
        super(name,age,statusType);
        this.skill=skill;
    }
@Override
    public void introduce(){
        System.out.println("你好我是"+getName()+"我会"+skill);
    }

    //独有的方法
    public void gurdHome(){
        System.out.println("小狗在看家");
    }

    @Override
    public void makeSound(){
        System.out.println("汪汪汪");
    }


    @Override
    public  void swim(){
        System.out.println(getName()+"会游泳");
    }
    @Override
    public void freeTrain(){
        System.out.println(getName()+"练习算术");
    }
}
