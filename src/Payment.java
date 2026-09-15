public abstract class Payment {
    private double amount;

    public Payment(double value) {
        //getName输出可以得到名称
        if (value < 0) {
            throw new IllegalArgumentException("支付金额必须大于0");
        }else{
            this.amount = value;
            System.out.println("我得名字叫:" + amount);
        }

    }

    public double getAmount() {
        return amount;
    }

    public void showAmount() {
        System.out.println("支付金额：" + getAmount());
    }
    public abstract void pay();
}
