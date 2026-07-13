public class Bike extends Vehicle{
    private String type;
    public Bike(String brand, int speed, String type) {
//        this.brand = brand;
//        this.speed = speed;
        super(brand,speed);
        this.type = type;
    }

    // 方法
    public void ring() {
        System.out.println(getBrand() + "以" + getSpeed() + "的速度骑" + type + "：叮叮叮");
    }
//    public void makeSound() {
//        System.out.println("ding");
//    }
}
