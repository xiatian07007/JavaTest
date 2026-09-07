public class ReviewDog  extends ReviewAnimal{
    private String  skill;
public  ReviewDog(String name,int age,String status,String skill){
   super(name,age,status);
   this.skill=skill;

}
    @Override
    public void introduce(){
        System.out.println(     "名字：" + getName()
                + "，年龄：" + getAge()
                + "，状态：" + getStatus()
                + "，技能：" + skill);
    }
}

