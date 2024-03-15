package A01_RegularExpression;

/**
 * 检验24小时的正则表达式
 */
public class RegularExpression7 {
    public static void main(String[] args) {
        /*
        [01] 表示0或者1其中一个
        \\d 表示从0到9其中一个
        [0-3] 表示从0到3其中一个
         */
        String regex24hoursA = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";

        /*
        这种写法的效果与上面的是一样的。
        分和秒都是60进制
        所以:[0-5]\\d只需要写一次，然后用括号括起来另其成为一组，再使用{2}让这组正则表达式出现两次
         */
        String regex24hoursB = "([01]\\d|2[0-3])(:[0-5]\\d){2}";
    }
}
