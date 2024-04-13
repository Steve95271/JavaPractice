package HackerRankIPK;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeConversion {
    public static void main(String[] args) {
        //System.out.println(timeConversion("12:01:00AM"));
        //System.out.println(timeConversion("11:45:30AM"));
        System.out.println(timeConversion("04:30:00PM"));
    }
    public static String timeConversion(String s) {
        // Write your code here
        String result = "";
        char[] charArray = s.toCharArray();
        switch (charArray[8]) {
            case 'A' -> {
                if (charArray[0] == '1' && charArray[1] == '2') {
                    result = "00:" + String.copyValueOf(charArray, 3, charArray.length - 5);
                } else {
                    result = String.copyValueOf(charArray, 0, charArray.length - 2);
                }
            }
            case 'P' -> {
                if (charArray[0] == '1' && charArray[1] == '2') {
                    result = String.copyValueOf(charArray, 0, charArray.length - 2);
                } else {
                    String tweHour = String.copyValueOf(charArray,0, 2);
                    int miliHour = Integer.parseInt(tweHour) + 12;
                    result = miliHour + String.copyValueOf(charArray, 2, charArray.length - 4);
                }
            }
        }


        return result;
    }
}
