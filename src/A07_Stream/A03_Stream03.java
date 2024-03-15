package A07_Stream;

import java.util.stream.Stream;

/**
 * 一堆零散的数据可以直接使用Stream接口的静态方法进行遍历
 * Stream.of()
 */
public class A03_Stream03 {
    public static void main(String[] args) {
        Stream.of("A",2,"b","llm").forEach(element -> System.out.println(element));

        /*
        注意：
        Stream接口中的静态方法of的细节
        方法的形式参数是一个可变参数，可以传递一堆零散的数据，也可以传递数组
        但是数组必须是引用数据类型的，如果传递基本数据类型，会把整个数组当成一个元素放到Stream中。
         */

        //例如传递整数数组就会出现这个问题
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        Stream.of(array).forEach(element -> System.out.println(element)); //打印[I@24d46ca6
    }
}
