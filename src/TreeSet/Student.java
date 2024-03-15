package TreeSet;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int chineseScore;
    private int mathScore;
    private int englishScore;

    public Student() {
    }

    public Student(String name, int age, int chineseScore, int mathScore, int englishScore) {
        this.name = name;
        this.age = age;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    /*
    重写compareTo方法实现下面的排序规则
        按照总分从高到低输出到控制台
        如果总分一样，按照语文成绩排
        如果语文一样，按照数学成绩排
        如果数学成绩一样，按照英语成绩排
        如果英文成绩一样，按照年龄排
        如果年龄一样，按照姓名的字母顺序排
        如果都一样，认为是同一个学生，不存。
     */
    @Override
    public int compareTo(Student o) {
        int scoreSum1 = this.getChineseScore() + this.getEnglishScore() + this.getMathScore();
        int scoreSum2 = o.getChineseScore() + o.getMathScore() + o.getEnglishScore();

        //比较两者的总分
        int i = scoreSum1 - scoreSum2;
        //如果总分一样，按照语文成绩排序
        i = i == 0 ? this.getChineseScore() - o.getChineseScore() : i;
        //如果语文成绩一样，按照数学成绩排序
        i = i == 0 ? this.getMathScore() - o.getMathScore() : i;
        //如果数学成绩一样，按照英语成绩排序
        i = i == 0 ? this.getEnglishScore() - o.getEnglishScore() : i;
        //如果英语成绩一样，按照年龄排序
        i = i == 0 ? this.getAge() - o.getAge() : i;
        //如何年龄一样，按照姓名字母顺序排序
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;

        return i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                '}';
    }
}
