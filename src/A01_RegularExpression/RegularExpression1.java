package A01_RegularExpression;

public class RegularExpression1 {
    public static void main(String[] args) {
        //范围从a到z
        System.out.println("a".matches("[a-z]"));

        System.out.println("--------------");

        //只能是 a, b 或 c
        System.out.println("a".matches("[abc]"));
    }
}
