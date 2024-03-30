package A12_Thread.Practice.P3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;

public class HongBaoV2 implements Runnable{

    static int amount = 10000; //这里是100元，后两个零代表小数点后两位
    static final int MIN = 1; //等于0.01

    static int hongBaoShuLiang = 3; //三个红包

    @Override
    public void run() {
        synchronized (HongBaoV2.class) {
            //先获取当前线程用于之后打印线程名字
            Thread currentThread = Thread.currentThread();

            //判断红包个数，如果为零则没有抢到
            if (hongBaoShuLiang == 0) {
                System.out.println(currentThread.getName() + " 没有抢到红包");
            } else {
                //定义变量用于记录抢到的红包
                int bonus;
                //抢到的是最后一个红包，则无需再随机金额，直接复制
                if (hongBaoShuLiang == 1) {
                    bonus = amount;
                } else { //否则不是最后一个红包，需要随机金额
                    Random rnd = new Random();
                    //100元分三个红包，由于最小会是0.01，因此最大的红包会是99.98
                    //又由于每次随机都需要把先前抽到的金额扣除
                    int bounds = amount - (hongBaoShuLiang - 1) * MIN;
                    //抽取奖金
                    bonus = rnd.nextInt(bounds);
                    //抽到的奖金不能少于最小值
                    if (bonus < MIN) {
                        bonus = MIN;
                    }
                }
                //需要把金额换成保留小数点两位的
                String rightBonus = ConvertToRightBonus(bonus);
                System.out.println(currentThread.getName() + " 抽到了: " + rightBonus);
                //总额减掉上一次抽到的金额
                amount = amount - bonus;
                //红包数量减一
                hongBaoShuLiang--;
            }
        }
    }

    private static String ConvertToRightBonus(int bonus) {
        String string = Integer.toString(bonus);
        char[] chars = string.toCharArray();
        //System.out.println(Arrays.toString(chars));
        ArrayList<String> reverseBonusList = new ArrayList<>();
        int count = 0;
        //由于需要先添加小数点后两位，因此需要先从最后一位数开添加到数组，在数组的金额是反序的
        for (int i = chars.length-1; i >=0 ; i--) {
            reverseBonusList.add(Character.toString(chars[i]));
            count++;
            if (count == 2) {
                reverseBonusList.add(".");
            }
            if (chars.length == 2 && i == 0) {
                reverseBonusList.add("0");
            }
        }
        //再把数组反过来拼成字符串
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = reverseBonusList.size() - 1; i >= 0 ; i--) {
            stringBuilder.append(reverseBonusList.get(i));
        }
        return stringBuilder.toString();
    }
}
