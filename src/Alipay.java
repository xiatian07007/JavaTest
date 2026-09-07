public class Alipay extends  Payment implements Refundable{

    public  Alipay(double amount){
        super(amount);

    }
    @Override
    public void  pay(){
        System.out.println("支付："+getAmount());
    }
    @Override
    public void  refund(){
        System.out.println("退款："+getAmount());
    }
}
