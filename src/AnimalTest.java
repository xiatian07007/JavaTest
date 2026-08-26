public class AnimalTest {
    public static void main(){

//        Animal animal=new Animal("咪咪",2,  "布偶");
//        animal.introduce();
//        animal.setAge(-1);
//        animal.setAge(3);
//        animal.getName();
//        animal.getAge();
//
//        animal.introduce();
//        Cat cat =new Cat("kimi",5,  "耄耋","女孩子");
//        cat.aget();
//        cat.introduce();

        //多态的调用
//        父类类型 变量名 = new 子类类型(构造参数);
//        变量名.被重写的方法();
//        Animal animal=new Cat("小狗",6,"拉布拉多","男孩子");
//        animal.introduce();
//
//        Animal animalDog=new Dog("蒂帕米",16,"边牧","算数");
//        animalDog.introduce();



        //数组的练习
        //创建一个长度为2的
         Animal[] list=new Animal[2];
         list[0]=new Dog("小狗",6,"拉布拉多","叫");
        list[1]=new Cat("小猫腻",6,"拉布拉多","男孩子");
//        list[0].introduce();
//        list[1].introduce();

        //循环的多态
        for (Animal  i : list){
           i.introduce();

           if(i instanceof  Dog){
               Dog dog=(Dog) i;
               dog.gurdHome();
           }else if(i instanceof  Cat){
               Cat cat=(Cat) i;
               cat.catchMouse();
           }
        }

        //调用单独的方法
//       animalDog.guardHome();
//        animal.catchMouse();

//这个是判断它实际是不是dog,如果是那就把父类引用换成Dog类型（判断类型并且向下转型）
        //如果不这样可以直接用animal Dog=new Dog(....) ,Dog.gurdHome() 调用
//        if(animalDog instanceof Dog){
//            Dog dog=(Dog) animalDog;
//            dog.gurdHome();
//        }
//
//        if(animal instanceof  Cat){
//            Cat cat=(Cat) animal;
//            cat.catchMouse();
//        }
//        重点记忆
//        子类变父类：向上转型，Java 自动完成。
//        父类恢复为子类：向下转型，需要明确写 (子类类型)，并先用 instanceof 检查。

    }
}

