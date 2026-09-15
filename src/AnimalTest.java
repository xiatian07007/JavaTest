import java.util.ArrayList;
import java.util.HashMap;
import java.util.IllformedLocaleException;

public class AnimalTest {

    public static void main() {

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
//        Animal animal = new Cat("小狗", 6, "拉布拉多", "男孩子");
//        animal.introduce();
////
//        Animal animalDog = new Dog("蒂帕米", 16, "边牧", "算数");
//        animalDog.introduce();
//
//        //抽象类
//
//        animal.makeSound();
//
//        animalDog.makeSound();
//
//        //多态抽象的数组
//        Animal[] abstris = new Animal[2];
//        abstris[0] = new Cat("小猫腻", 6, "拉布拉多", "男孩子");
//        abstris[1] = new Dog("小狗", 6, "拉布拉多", "叫");
//        for (Animal i : abstris) {
//            i.makeSound();
//            if (i instanceof Swimmable) {
//                Swimmable swimm = (Swimmable) i;
//                swimm.swim();
//            }
//
//            if (i instanceof train) {
//                train free = (train) i;
//                free.freeTrain();
//            }
//        }


//        //数组的练习
//        //创建一个长度为2的
//         Animal[] list=new Animal[2];
//         list[0]=new Dog("小狗",6,"拉布拉多","叫");
//        list[1]=new Cat("小猫腻",6,"拉布拉多","男孩子");
////        list[0].introduce();
////        list[1].introduce();
//
//        //循环的多态
//        for (Animal  i : list){
//           i.introduce();
//
//           if(i instanceof  Dog){
//               Dog dog=(Dog) i;
//               dog.gurdHome();
//           }else if(i instanceof  Cat){
//               Cat cat=(Cat) i;
//               cat.catchMouse();
//           }
//        }

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


        //调用新的方法

//        ReviewNewCat review=new ReviewNewCat("旺财",2,"健康","看家");
//
////        review.setName("托托");
////        review.setAge(18);
////        review.setStatus("金渐层");
////        review.introduce();
//        review.setAge(-1);
//        review.getAl();
//        review.introduce();
//
//
//        //测试支付
////        Alipay alipay = new Alipay(100);
////        alipay.showAmount();
////        alipay.pay();
//
//        //循环调用
//        Payment[] payments=new Payment[2];
//        payments[0]=new Alipay(100) ;
//        payments[1]=new WechatPay(20);
//        Refundable refundable = new Alipay(100);
//        refundable.refund();
//for(Payment payment:payments){
//
//    payment.showAmount();
//    payment.pay();
//}


//多数组
//        ArrayList<Payment> payments=new ArrayList<>();
//        payments.add(new Alipay(100));
//        payments.add(new WechatPay(50));
//        for(Payment payment:payments){
//
//    payment.showAmount();
//    payment.pay();
//}


//        payments.set(1, new Alipay(500));payments.add(new Alipay(50));
//        Payment payment = payments.get(1);
//        payment.showAmount();
//        payment.pay();
//        System.out.println("支付记录数量：" + payments.get(1)+","+payments.size());
//        payments.remove(0);
//
//        System.out.println("支付记录数量：" + payments.get(1)+","+payments.size());


//        for (Payment payment:payments) {
//            if(payment.getAmount()==50){
//                System.out.println("找到支付记录：");
//                payment.showAmount();
//                payment.pay();
//            }
//        }
//        Alipay alipay = new Alipay(1000);
//        findByAmount(payments, 50);
//        findByAmount(payments, 999);

//        //添加数据
//        addPayment(payments,new Alipay(1000));
//        addPayment(payments,new WechatPay(1000));
//        alipay.refund();
//        removePayment(payments,1);
//        System.out.println("当前记录数：" + payments.size());
////        QueryPayment(payments,new Alipay(20));
//        updatePayment(payments,new Alipay(5800));
//        QueryPayment(payments);


        //调用测试类封装的功能
//        PaymentManager manager = new PaymentManager();
//
////        manager.showAllPayments();
//        manager.addPayment(new Alipay(5800));
//        manager.addPayment(new WechatPay(2000));
//
////        manager.showAllPayments();
//        manager.getPaymentByIndex(0);
//        manager.getPaymentByIndex(1);
//        manager.getPaymentByIndex(5);
//        manager.updatePayment(0,new Alipay(6600));
//
//        manager.removePayment(1);
//        manager.showAllPayments();
//
//        manager.findPaymentByIndex(6600);
//        manager.refundAllSupported();

        //故意制造异常
//        ArrayList<Payment> payments = new ArrayList<>();
//        payments.add(new Alipay(100));
//        payments.add(new WechatPay(200));
//        try {
//            Payment payment = payments.get(5);
//            payment.pay();
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("下标不存在，请检查输入");
//        }
        PaymentManager manager = new PaymentManager();
//        manager.addPayment(new Alipay(5800));
//        manager.addPayment(new WechatPay(2000));
//        Payment payment = manager.getPaymentByIndex(1);
//        if (payment != null) {
//            payment.showAmount();
//            payment.pay();
//        }
//        try {
//            Payment payment = new Alipay(-100);
//            payment.pay();
//        } catch (IllegalArgumentException e) {
//            System.out.println("创建失败：" + e.getMessage());
//        }finally{
//            System.out.println("支付流程结束");
//        }
//        manager.catchError(-100);

        //
//    manager.addWechatByAmount(100);
//    manager.addWechatByAmount(200);
//    manager.addWechatByAmount(-300);
//    manager.showAllPayments();
        manager.addPaymentByType("Alipay", 200);
        manager.addPaymentByType("Alipay", 100);
        manager.addPaymentByType("Wechat", 100);
        manager.addPaymentByType("Wechat", -10);
//        System.out.println("总金额：" + manager.getTotalAmount());
        manager.getPaymentCount();
        manager.showStatistics();
        manager.countPaymentTypes();

        ArrayList<HashMap<String, Integer>> result =
                manager.countPaymentTypesList();

        System.out.println(result);

    }


////查询方法
//    public static void findByAmount(ArrayList<Payment> payments, double targetAmount) {
//        boolean found = false;
//        for (Payment payment : payments) {
//            if (payment.getAmount() == targetAmount) {
//                payment.showAmount();
//                payment.pay();
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("没有找到金额为 " + targetAmount + " 的付款记录");
//        }
//    }
////添加方法
//    public static  void addPayment(ArrayList<Payment>payments,Payment payment){
//        payments.add(payment);
//        System.out.println("添加成功");
//    }
//    //查询
//    public static void QueryPayment(ArrayList<Payment>payments){
//
//        for (Payment payment : payments) {
//            payment.showAmount();
//            payment.pay();
//        }
//
//    }
//    //修改方法
//    public static void updatePayment(ArrayList<Payment>payments,Payment payment){
//        payments.set(0,payment);
//    }
//    //删除方法
//public static void removePayment(ArrayList<Payment> payments,
//                                 int index){
//        if(index>=0&&index<payments.size()){
//            Payment removerdPayment=payments.remove(index);
//            System.out.println("删除成功");
//            removerdPayment.showAmount();
//            removerdPayment.pay();
//            System.out.println("剩余数量：" + payments.size());
//        }else{
//            System.out.println("下标不存在");
//        }
//}
}
