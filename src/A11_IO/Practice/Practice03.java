package A11_IO.Practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * 统计每种字符出现的次数
 * 用HashMap统计
 */
public class Practice03 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/A11_IO/files2/A.txt");

        HashMap<Character, Integer> hashMap = new HashMap<>();

        int characterByte;

        while ((characterByte = fileReader.read()) != -1) {
            char c = (char)characterByte;

            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                int value = hashMap.get(c);
                hashMap.put(c, value + 1);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        hashMap.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character character, Integer integer) {
                stringBuilder.append(character).append("(").append(integer).append(")");
            }
        });

        System.out.println(stringBuilder);
    }
}
