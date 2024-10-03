package HackerRankIPK;

import java.util.Stack;

public class FlippingBits {
    public static long flippingBits(long n) {

        long[] binaryArray = new long[32];

        for (int i = 31; i >= 0; i--) {
            if (n > 0) {
                binaryArray[i] = n % 2;
                n = n / 2;
            }else {
                binaryArray[i] = 0;
            }
        }

        int i = 0;
        for (long l : binaryArray) {
            if (l == 1) {
                binaryArray[i] = 0;
            } else {
                binaryArray[i] = 1;
            }
            i++;
        }


        StringBuilder stringBuilder = new StringBuilder();

        for (long l : binaryArray) {
            stringBuilder.append(l);
        }

        String s = stringBuilder.toString();

        long result = stringBinaryToDecimal(s);

        return result;

    }

    static long stringBinaryToDecimal(String s)
    {
        long ans = 0, p = 0;

        // length of String
        int len = s.length();

        // Traversing the String
        for (int i = len - 1; i >= 0; i--) {

            if (s.charAt(i) == '1') {
                // Calculating Decimal Number
                ans += Math.pow(2, p);
            }
            // incrementing value of p
            p++;
        }
        System.out.println("Decimal Equivalent of " + s
                + " is " + ans);

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(flippingBits(9));
        System.out.println("======");
        System.out.println(flippingBits2(9));
    }

    static long flippingBits2(long n) {
        for (int i = 0; i < 32; i++)
            n = (n ^ (1 << i));

        return Long.parseLong(Long.toUnsignedString(n, 2).substring(32), 2);
    }
}
