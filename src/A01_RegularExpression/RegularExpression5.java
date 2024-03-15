package A01_RegularExpression;

public class RegularExpression5 {
    public static void main(String[] args) {
        //13112345678
        //分成三部分:
        //第一部分:1 表示手机号码只能以1开头
        //第二部分:[3-9] 表示手机号码第二位只能是3-9之间的
        //第三部分:\\d{9} 表示任意数字可以出现9次，也只能出现9次

        String mobilePhoneNumRegex = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(mobilePhoneNumRegex)); //true
        System.out.println("13712345667".matches(mobilePhoneNumRegex)); //true
        System.out.println("13945679027".matches(mobilePhoneNumRegex)); //true
        System.out.println("139456790271".matches(mobilePhoneNumRegex)); //false
        System.out.println("------------------");

        //座机电话号码
        //020-2324242 02122442 027-42424 0712-3242434
        //思路:
        //在书写座机号正则的时候需要把正确的数据分为三部分
        //一:区号@\\d{2,3}
        //      0:表示区号一定是以0开头的
        //      \\d{2,3}:表示区号从第二位开始可以是任意的数字，可以出现2到3次。
        //二:- ?表示次数，零次或一次
        //三:号码 号码的第一位也不能以零开头，从第二位开始可以是任意的数字，号码的总长度:5-10位

        String landLineNumRegex = "0\\d{2,3}-?[1-9]\\d{4,9}";

        System.out.println("020-2324242".matches(landLineNumRegex));
        System.out.println("02122442".matches(landLineNumRegex));
        System.out.println("027-42424".matches(landLineNumRegex));
        System.out.println("0712-3242434".matches(landLineNumRegex));


    }
}
