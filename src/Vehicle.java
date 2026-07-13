public class Vehicle {
  private   String brand;
   private int speed;
//    public static void main(String[] args){
//        Car dog=new Car("xiaowang",100,30);
//        dog.openDoor();
//        dog.makeSound();
//        Bike bike=new Bike("xiaowang",100,"hhh");
//        bike.ring();
//        bike.makeSound();
//    }
    public Vehicle (String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    public String getBrand() {
    return brand;
    }
    public int getSpeed(){
        return speed;
    }
}
