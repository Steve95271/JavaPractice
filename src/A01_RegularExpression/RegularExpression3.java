package A01_RegularExpression;

public class RegularExpression3 {
    public static void main(String[] args) {
        String string = "had";

        //1.要求字符串是小写辅音字符开头，后跟ad
        String regex = "[a-z&&[^aeiou]]ad";
        System.out.println("1." + string.matches(regex));

        //2.要求字符串是aeiou中的某个字符开头，后跟ad
        regex = "[a|e|i|o|u]ad";
        System.out.println("2." + string.matches(regex));
    }
}
