public class getseTest {
    private String name;
    private int age;

    //构造方法
    public getseTest(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //获取name
    public String getName(){
        return name;
    }
    //设置name
    public void setName(String name){
        this.name=name;
    }
    //获取age
    public int getAge(){
        return  age;
    }

    //设置age
    public void setAge(int age){
        this.age=age;
    }
}
