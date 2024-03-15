package A01_RegularExpression;

public class RegularExpression2 {
    public static void main(String[] args) {
        //不能出现abc
        String regex1 = "[^abc]";
        System.out.println("a".matches(regex1));

        System.out.println("----------------");

        //从小写a到z以及大写A到Z
        String regex2 = "[a-zA-z]";
        System.out.println("a".matches(regex2));

        System.out.println("----------------");

        //[a-d[m-p]] 从a到d，或m到p
        String regex3 = "[a-d[m-p]]";
        System.out.println("e".matches(regex3));
        System.out.println("c".matches(regex3));

        System.out.println("----------------");

        // [a-z&&[def]] a-z和def的交集。即：def
        String regex4 = "[a-z&&[def]";
        System.out.println("");




    }
}
