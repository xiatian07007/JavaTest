import java.util.ArrayList;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//PaymentManager//专门负责管理支付记录
//payments：集合变成管理类自己的属性
//addPayment()不在需要传入集合。因为集合已经在类里面了
public class PaymentManager {
    //保存一个集合//写管理类和添加方法
    private ArrayList<Payment> payments = new ArrayList<>();

    public void addPayment(Payment payment) {
        payments.add(payment);
        System.out.println("添加成功");
    }

    public void showAllPayments() {
        if (payments.isEmpty()) {
            System.out.println("暂无支付记录");
            return;
        } else {
            for (Payment payment : payments) {
                payment.showAmount();
                payment.pay();
            }
        }

    }

//    public void getPaymentByIndex(int index) {
//        if (index < payments.size() && index >= 0) {
//            Payment payment = payments.get(index);
//            payment.showAmount();
//            payment.pay();  //两个方法中的pay
//
//        } else {
//            System.out.println("下标不存在");
//        }
//    }

    public void updatePayment(int index, Payment payment) {
        if (index >= 0 && index < payments.size()) {

            Payment PaymentManager = payments.set(index, payment);
            System.out.println("修改成功" + PaymentManager);
        } else {
            System.out.println("下标不存在");
        }

    }

    public void removePayment(int index) {
        if (index >= 0 && index < payments.size()) {
            Payment removedPayment = payments.remove(index);
            System.out.println("删除成功" + payments.size() + removedPayment);
        } else {
            System.out.println("下标不存在");
        }
    }

    public void findPaymentByIndex(double targetAmount) {
        boolean found = false;

        for (Payment payment : payments) {
            if (payment.getAmount() == targetAmount) {
                payment.showAmount();
                payment.pay();
                found = true;
            }
        }
        if (!found) {
            System.out.println("没有找到金额为" + targetAmount + "的记录");
        }
    }

    //识别支持退款的方式单独识别出来
//    重点记忆
    //        子类变父类：向上转型，Java 自动完成。
//        父类恢复为子类：向下转型，需要明确写 (子类类型)，并先用 instanceof 检查。
    public void refundAllSupported() {
        if (payments.isEmpty()) {
            System.out.println("暂无支付记录");
            return;
        }
        boolean hasRefundable = false;
        for (Payment payment : payments) {
            if (payment instanceof Refundable) {
                Refundable refundable = (Refundable) payment;
                refundable.refund();
                hasRefundable = true;
            }
        }
        if (!hasRefundable) {
            System.out.println("没有支持退款的支付记录");
        }
    }

    public Payment getPaymentByIndex(int index) {
        if (index >= 0 && index < payments.size()) {
            return payments.get(index);
        } else {
            System.out.println("下标不存在，请检查输入");
            return null;
        }
    }

    public void catchError(int amount) {
        try {
            Payment payment = new Alipay(amount);
            payment.pay();
        } catch (IllegalArgumentException e) {
            System.out.println("创建失败:" + e.getMessage());
        } finally {
            System.out.println("支付流程结束");
        }
    }

    public void addAlipayByAmount(double amount) {
        try {
            Payment payment = new Alipay(amount);
            payments.add(payment);
            System.out.println("添加成功");
        } catch (IllegalArgumentException e) {
            System.out.println("添加失败" + e.getMessage());
        } finally {
            System.out.println("支付流程结束");
        }
    }

    public void addWechatByAmount(double amount) {
        try {
            Payment payment = new WechatPay(amount);
            payments.add(payment);
        } catch (IllegalArgumentException e) {
            System.out.println("添加失败" + e.getMessage());
        } finally {
            System.out.println("支付流程结束");
        }
    }

    public void addPaymentByType(String type, int amount) {
        try {
            Payment payment;
            if (type.equals("Alipay")) {
                payment = new Alipay(amount);

            } else if (type.equals("Wechat")) {
                payment = new WechatPay(amount);

            } else {
                System.out.println("未知支付类型");
                return;
            }
            //可以提取出来相同得内容
            payments.add(payment);
            payment.pay();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    //    public int getTotalAmount(){
//        int totalAmount = 0;
//        for (Payment payment : payments) {
//            System.out.println(payment.getAmount());
//            totalAmount+=payment.getAmount();
//            System.out.println(totalAmount);
//
//        }
//        return totalAmount;
//    }
    public BigDecimal getTotalAmount() {

        BigDecimal totalAmount = BigDecimal.ZERO;
        for (Payment payment : payments) {
            totalAmount = totalAmount.add(BigDecimal.valueOf(payment.getAmount()));

        }
        System.out.println(totalAmount);
        return totalAmount;
    }

    //支付记录数量统计
    public void getPaymentCount() {
        System.out.println("支付记录数量" + payments.size());

    }

    public BigDecimal showStatistics() {
        System.out.println("支付记录数量:" + payments.size());
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (Payment payment : payments) {
            totalAmount = totalAmount.add(BigDecimal.valueOf(payment.getAmount()));

        }
        System.out.println("支付的总金额:" + totalAmount);
        return totalAmount;
    }
//对象的形式
    public void countPaymentTypes() {
//        HashMap<String, Integer> 返回的对象是{字符串：整形}
        HashMap<String, Integer> hasmap = new HashMap<>();
        for (Payment payment : payments) {
            if (payment instanceof Alipay) {
                //  如果键不存在
                int count = hasmap.getOrDefault("支付宝", 0);
                //给里面添加数据  put    get是导出数据
                hasmap.put("支付宝", count + 1);
            } else if (payment instanceof WechatPay) {
                int count = hasmap.getOrDefault("微信支付", 0);
                hasmap.put("微信支付", count + 1);
            }
            System.out.println(hasmap);
        }


    }
    //数组的形式
    public ArrayList<HashMap<String, Integer>> countPaymentTypesList() {
        HashMap<String, Integer> hashmap = new HashMap<>();

        // 第一步：统计支付类型数量
        for (Payment payment : payments) {
            if (payment instanceof Alipay) {
                int count = hashmap.getOrDefault("支付宝", 0);
                hashmap.put("支付宝", count + 1);

            } else if (payment instanceof WechatPay) {
                int count = hashmap.getOrDefault("微信支付", 0);
                hashmap.put("微信支付", count + 1);
            }
        }

        // 第二步：把每个键值对转换成一个小 Map
        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            HashMap<String, Integer> item = new HashMap<>();
            item.put(entry.getKey(), entry.getValue());
            list.add(item);
        }

        return list;
    }
}


//        int totalAmount = 0;
//        for (Payment payment : payments) {
//            System.out.println(payment.getAmount());
//            totalAmount+=payment.getAmount();
//            System.out.println(totalAmount);
//
//        }
//        return totalAmount;
//    }
//    }

