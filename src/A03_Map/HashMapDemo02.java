package A03_Map;

import java.util.*;

public class HashMapDemo02 {
    public static void main(String[] args) {
        /*
            某个班级80名学生，现在需要组成秋游活动，
            班长提供了四个景点依次是（A、B、C、D）,
            每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        */

        //定义数组，储存ABCD四个景点
        String [] sightsArr = {"A", "B", "C", "D"};

        //利用随机数模拟80哥同学的投票
        //把投票结果储存起来
        ArrayList<String> arrayList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 80; i++) {
            int index = rnd.nextInt(sightsArr.length);
            arrayList.add(sightsArr[index]);
        }

        //使用map集合进行统计
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String sight : arrayList) {
            //判断当前的景点在map集合中是否存在。
            if (hashMap.containsKey(sight)) {
                //获取当前景点已被投票的次数
                int count = hashMap.get(sight); //在map集合中通过Key去获得Value，Value在这里就是被投票的次数
                //投票加一
                count++;
                //把当前景点的名字和已被投票的次数放进map集合中。
                hashMap.put(sight, count);
            } else { //不存在
                hashMap.put(sight, 1);
            }
        }

        System.out.println(hashMap);

        //计算出被投票次数最多的景区
        int maxVote = 0;
        String maxVoteSight = "";
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int sightBeVoted = entry.getValue();
            String sightName = entry.getKey();
            if (sightBeVoted > maxVote) {
                maxVote = sightBeVoted;
                maxVoteSight = sightName;
            }
        }

        System.out.println(maxVoteSight + "=" + maxVote);
    }
}
