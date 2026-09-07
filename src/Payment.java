public  abstract class Payment {
    private double amount;
    public  Payment(double value){
        //getName输出可以得到名称
        this.amount=value;
        System.out.println("我得名字叫:"+amount);
    }

    public double getAmount() {
        return amount;
    }

    public void showAmount(){
        System.out.println("支付金额：" + getAmount());
    }

    public abstract void pay();
}
