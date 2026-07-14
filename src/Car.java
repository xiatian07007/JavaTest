public class Car extends Vehicle {
    private int doors;

public Car (String brand,int speed,int doors){
//this.brand=brand;
//this.speed=speed;
//this.doors=doors;
    super(brand,speed);
    this.doors=doors;
}

public void showInfo(){
    System.out.println(getBrand()+"速度"+getSpeed()+"车门"+doors);
}
@Override
    public void makeSound(){
    System.out.println(getBrand()+"汽车：滴滴");
}
//public  int getDoors(){
//    return doors;
//}
//    public  String getbrand(){
//        return brand;
//    }
//    public void openDoor(){
//        System.out.println(brand+"以"+speed+"的速度骑车"+"打开了" + doors + "扇门");
//        }
//    public void makeSound() {
//        System.out.println("喵喵喵");
//    }

}
