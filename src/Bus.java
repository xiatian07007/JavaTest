public class Bus extends Vehicle{
    private int capacity; //载客数量
    public Bus (String brand,int speed,int capacity){
super(brand,speed);
this.capacity=capacity;
    }
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println(getBrand()+"sad");
    }
    public void showInfo(){
        System.out.println(getBrand()+"汽车"+getSpeed()+"m/s"+capacity+"个座位");
    }
}
