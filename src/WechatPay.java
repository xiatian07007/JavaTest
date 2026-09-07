public class WechatPay extends Payment {
public WechatPay(double amount){
    super(amount);
}
@Override
    public void pay(){
System.out.println("微信支付：" + getAmount());
}
}
