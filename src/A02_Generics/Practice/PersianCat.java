package A02_Generics.Practice;

public class PersianCat extends Cat{

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的波斯猫正在吃饼干");
    }

}
