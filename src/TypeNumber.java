
public class TypeNumber {
    public static void main(String[] args) {  //程序入口固定写法
//判断是奇数还是偶数
        int listData = 100;
        if (listData % 2 == 0) {
            System.out.println("我是偶数");
        } else {
            System.out.println("我是奇数");
        }


        //使用for循环
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);


        //找出数组中的最大值
        int maxlis = 0;
        int[] numberArray = {1, 9, 3, 4, 5};

        maxlis = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {

            if (maxlis < numberArray[i]) {
                maxlis = numberArray[i];

            }
        }
        System.out.println(maxlis);
//打印9*9乘法表


        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j + "×" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }

}
