/**
 * 函数的练习
 *结构如下：
 * 修饰符  返回类型  方法名（参数）{
 *     方法体
 *     return 返回值
 * }
 */


/**
 *
 *求两个数据的和
 * @param a
 * @param b
 * @return
 */
//定义方法
public static int add(int a,int b){
    return a+b;
}


/**
 * p判断奇偶数
 */
public  static String checkOddEven(int num){
    if(num%2==0){
        return "偶数";
    }else{
        return "奇数";
    }
}

/**
 *
 * @param 求数组的最大值
 */
public static int getMax(int[] nums){
    int max=nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i]>max){
                    max=nums[i];
                }
            }
            return max;
}

/**
 *
 * @param 九九乘法表封装
 */
public static void printTable(){
    for(int i=1;i<=9;i++){
        for(int j=1;j<=i;j++){
            System.out.println(j + "×" + i + "=" + (i * j) + "\t");
        }
        System.out.println();
    }
}


//每个里面只能有一个main
public static void main (String[] args){
  //求和
    int result =add(10,20);
    System.out.println(result);
 //计算奇偶数
    System.out.println(checkOddEven(4));
    System.out.println(checkOddEven(5));
 //求最大值和最小值
    int[] nums={3,9,1,7,5};
    System.out.println(getMax(nums));
//乘法表
    printTable();
}
