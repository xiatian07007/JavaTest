public class Vehicle {
    String brand;
    int speed;
    public static void main(String[] args){
        Car dog=new Car("xiaowang",100,30);
        dog.openDoor();
        dog.makeSound();
        Bike bike=new Bike("xiaowang",100,"hhh");
        bike.ring();
        bike.makeSound();
    }
}
