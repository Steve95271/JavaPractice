package A02_Generics.Practice;

public class LihuaCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的狸花猫正在吃饼干");
    }
}
