package A01_RegularExpression;

/**
 * 检验邮箱的正则表达式
 */
public class RegularExpression6 {
    public static void main(String[] args) {
        String emailRegex = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";

        System.out.println("3232323@qq.com".matches(emailRegex));
        System.out.println("zhangsan@itcast.cnn".matches(emailRegex));
        System.out.println("dlei0009@163.com".matches(emailRegex));
        System.out.println("dlei0009@pci.com.cn".matches(emailRegex));
    }
}
