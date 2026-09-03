public class ReviewNewCat extends ReviewAnimal {
    public String type;

    public ReviewNewCat(String name, int age, String status, String type) {
        super(name, age, status);
        this.type = type;
    }

@Override
    public void  introduce(){
    System.out.println("我得名字叫:"+getName()+"今年"+getAge()+"岁了"+",类型是"+getStatus()+"性别："+type);
}

    public void getAl(){
        System.out.println("5");
    }
}
