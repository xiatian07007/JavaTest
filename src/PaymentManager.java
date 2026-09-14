import java.util.ArrayList;


//PaymentManager//专门负责管理支付记录
//payments：集合变成管理类自己的属性
//addPayment()不在需要传入集合。因为集合已经在类里面了
public class PaymentManager {
    //保存一个集合//写管理类和添加方法
    private ArrayList<Payment> payments=new ArrayList<>();
    public void addPayment(Payment payment) {
        payments.add(payment);
        System.out.println("添加成功");
    }

    public void  showAllPayments(){
        if(payments.isEmpty()){
            System.out.println("暂无支付记录");
                    return ;
        }else{
            for(Payment payment : payments){
                payment.showAmount();
                payment.pay();
            }
        }

    }
    public void getPaymentByIndex(int index){
        if(index<payments.size()&&index>=0){
           Payment payment= payments.get(index);
           payment.showAmount();
            payment.pay();  //两个方法中的pay

        }
        else{
System.out.println("下标不存在");
        }
    }

    public void updatePayment(int index,  Payment payment){
        if(index>=0&&index<payments.size()){

          Payment  PaymentManager  =   payments.set(index,payment);
            System.out.println("修改成功"+PaymentManager);
        }else{
            System.out.println("下标不存在");
        }

    }

    public void removePayment(int index){
        if(index>=0&&index<payments.size()){
            Payment removedPayment = payments.remove(index);
            System.out.println("删除成功"+payments.size()+removedPayment);
        }else{
            System.out.println("下标不存在");
        }
    }

    public void findPaymentByIndex(double targetAmount){
       boolean found =false;

       for(Payment payment:payments){
       if(payment.getAmount()==targetAmount){
         payment.showAmount();
         payment.pay();
           found=true;
       }
       }
       if(!found){
           System.out.println("没有找到金额为"+targetAmount+"的记录");
       }
    }
    //识别支持退款的方式单独识别出来
//    重点记忆
    //        子类变父类：向上转型，Java 自动完成。
//        父类恢复为子类：向下转型，需要明确写 (子类类型)，并先用 instanceof 检查。
    public void refundAllSupported(){
        if (payments.isEmpty()) {
            System.out.println("暂无支付记录");
            return;
        }
boolean hasRefundable=false;
     for(Payment payment:payments){
         if (payment instanceof Refundable) {
Refundable refundable=(Refundable) payment;
refundable.refund();
hasRefundable=true;
         }
     }
     if(!hasRefundable){
         System.out.println("没有支持退款的支付记录");
     }
    }
}

