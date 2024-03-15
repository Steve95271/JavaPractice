package A10_File;

import java.io.File;
import java.util.HashMap;

public class File07 {
    /*
        需求：键盘录入一个文件夹路径，统计文件夹中每种文件的个数并打印（考虑子文件夹）
     */


    static HashMap<String, Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        File directory = MyFileMethods.getDirectory();

        countFiles(directory);

        hm.forEach((key, value) -> System.out.println(key + ": " + value + "个"));
    }

    public static void countFiles(File dir) {
        int count = 0;

        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()){
                String fileName = file.getName();

                //以防文件没有后缀名，做一个判断
                if (fileName.contains(".")){
                    String[] splitFileName = fileName.split("\\.");//在正则表达式中使用.需要加两条右斜线

                    //以防文件有多个. 应该只获取最后的部分
                    String expandedName = splitFileName[splitFileName.length - 1];

                    //统计
                    if (!hm.containsKey(expandedName)){
                        hm.put(expandedName, 1);
                    } else {
                        hm.put(expandedName, hm.get(expandedName) + 1);
                    }
                } else { //没有后缀名，单独统计
                    count++;
                }


            } else {
                if (file.listFiles() != null) {
                    countFiles(file);
                }
            }
        }


    }


}
