/**
 * 函数的练习
 *结构如下：
 * 修饰符  返回类型  方法名（参数）{
 *     方法体
 *     return 返回值
 * }
 */



//定义方法
public static int add(int a,int b){
    return a+b;
}

//调用方法

public static void main (String[] args){
    int result =add(10,20);
    System.out.println(result);
}