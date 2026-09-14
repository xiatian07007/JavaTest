public class ArrayPractice {

    public static void main(String[] args) {

        // ============ 练习1：数组的三种初始化方式 ============
        // 方式1：静态初始化（直接给值）
        int[] arr1 = {10, 20, 30, 40, 50};

        // 方式2：先声明再静态初始化
        int[] arr2;
        arr2 = new int[]{1, 2, 3, 4, 5};

        // 方式3：动态初始化（指定长度，默认值都是 0）
        int[] arr3 = new int[5];
        arr3[0] = 7;
        arr3[4] = 9;

        System.out.println("arr1 长度：" + arr1.length);

        // ============ 练习2：两种方式遍历数组 ============
        System.out.println("--- 普通 for 遍历 ---");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        System.out.println("--- 增强 for 遍历 ---");
        for (int n : arr1) {
            System.out.print(n + " ");
        }
        System.out.println();

        // ============ 练习3：求数组的和、平均值 ============
        int sum = 0;
        for (int n : arr1) {
            sum += n;
        }
        double avg = (double) sum / arr1.length; // 注意转成 double，否则整数相除会丢小数
        System.out.println("arr1 的和 = " + sum);
        System.out.println("arr1 的平均值 = " + avg);

        // ============ 练习4：求最大值和最小值 ============
        int max = arr1[0];
        int min = arr1[0];
        for (int n : arr1) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("最大值 = " + max);
        System.out.println("最小值 = " + min);

        // ============ 练习5：查找元素，返回下标 ============
        int target = 30;
        int index = findIndex(arr1, target);
        if (index == -1) {
            System.out.println(target + " 不在数组中");
        } else {
            System.out.println(target + " 的下标是 " + index);
        }

        // ============ 练习6：反转数组 ============
        reverse(arr1);
        System.out.println("反转后的 arr1：");
        for (int n : arr1) {
            System.out.print(n + " ");
        }
        System.out.println();

        // ============ 练习7：二维数组 ============
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("二维数组 matrix：");
        for (int i = 0; i < matrix.length; i++) {        // 外层循环：行
            for (int j = 0; j < matrix[i].length; j++) { // 内层循环：列
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // 每打印一行换行
        }
    }

    // 查找元素，找到返回下标，找不到返回 -1
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // 反转数组：第一个和最后一个交换，第二个和倒数第二个交换……
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
