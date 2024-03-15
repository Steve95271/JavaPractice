package A04_Args;

/**
 * 可变参数例子
 * 方法的形式参数是可以发生变化的。不再是有限个的参数
 * 格式：属性类型...参数名字
 * 例如：int...args
 */
public class A01_Args {
    public static void main(String[] args) {
        int result = getSum(1,2,3,4,5,6,7,8,9,10);
        System.out.println(result);

        System.out.println("----------");

        result = getSum2(result, 1,2,3,4,5,6,7,8,9,10);
        System.out.println(result);
    }

    /*
    可变参数的底层是一个数组
    Java会自动创建
     */
    public static int getSum(int...args) {
        int sum = 0;
        for (int i : args) {
            sum = sum + i;
        }
        return sum;
    }

    /*
    可变参数的细节
    一个方法中只能够有一个可变参数
    但是可以同时有形式参数和可变参数
    要注意的是，编写的时候，形式参数要放在可变参数前面
     */
    public static int getSum2 (int arg1, int...arg2){
        int sum = arg1;
        for (int i : arg2) {
            sum = sum + i;
        }
        return sum;
    }
}
