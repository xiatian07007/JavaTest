
//💡 小技巧：在 main 方法里输入 psvm 然后按 Tab，IDEA 会自动补全整个 main 方法；输入 sout 按 Tab 自动补全 System.out.println()，非常方便！
//基础运算符
public class Practice01 {
    public static void main(String[] args) {
int a=10,b=3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b); //取余数

        //比较运算符
        System.out.println(a>b);
        System.out.println(a==b);

        //逻辑运算符
        boolean y=false,x=true;
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(!x);


        //条件判断
             int score=85;
                     if(score>=90){
                             System.out.println("优秀");
                     }else if(score>=60){
                             System.out.println("及格");
                     }else{
                             System.out.println("不及格");
                     }



//    switch语句
            int day=3;
            switch (day){
                    case 1:System.out.println("周一"); break;
                    case 2:System.out.println("周一"); break;
                    case 3:System.out.println("周一"); break;
                    default:System.out.println("其它");
            }



            //数组
            int[] nums={10,20,30,40,50};
            //访问元素
            System.out.println(nums[0]);
            //遍历数组
            for(int i=0;i<nums.length;i++){
                    System.out.println(nums[i]);
            }
            //增强for循环
            for(int n:nums){
                    System.out.println(n);
            }
    }


}
