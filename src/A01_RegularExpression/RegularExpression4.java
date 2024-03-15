package A01_RegularExpression;

public class RegularExpression4 {
    public static void main(String[] args) {
        //一个.表示任意一个字符
        String regex1 = ".";

        //两个..表示任意两个字符
        String regex2 = "..";

        System.out.println("1." + "a".matches(regex1));
        System.out.println("2." + "bb".matches(regex1));
        System.out.println("3." + "cc".matches(regex2));
        System.out.println("4." + "d".matches(regex2));

        System.out.println("-----------------");

        // 必须是数字 字母 下划线 至少 6位
        System.out.println("abcd1234".matches("\\w{6,}"));//true
        System.out.println("244f".matches("\\w{6,}"));//false
    }
}
