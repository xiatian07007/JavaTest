public class Car extends Vehicle {
    private int doors;

public Car (String brand,int speed,int doors){
this.brand=brand;
this.speed=speed;
this.doors=doors;
}
public  int getDoors(){
    return doors;
}
    public  String getbrand(){
        return brand;
    }
    public void openDoor(){
        System.out.println(brand+"以"+speed+"的速度骑车"+"打开了" + doors + "扇门");
        }
    public void makeSound() {
        System.out.println("喵喵喵");
    }

}
