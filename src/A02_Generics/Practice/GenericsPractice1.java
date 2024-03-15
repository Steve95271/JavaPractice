package A02_Generics.Practice;

import java.util.ArrayList;

/**
 * 泛型练习
 * 编写两个方法：
 * 一个只能够放进猫类动物的集合。
 * 另一个只能够放进狗类动物的集合。
 */
public class GenericsPractice1 {
    public static void main(String[] args) {
        ArrayList<PersianCat> persianCats = new ArrayList<>();
        ArrayList<LihuaCat> lihuaCats = new ArrayList<>();
        ArrayList<Teddy> teddies = new ArrayList<>();
        ArrayList<Husky> huskies = new ArrayList<>();

        keepCat(persianCats);
        keepCat(lihuaCats);

        keepDog(teddies);
        keepDog(huskies);
    }


    /*
    这个泛型中写的? extends Cat的意思是，该ArrayList只能够把Cat类及其子类的对象放进list
     */
    public static void keepCat(ArrayList<? extends Cat> list) {

    }

    /*
    这里的泛型的写法的作用与上面的keepCat一致
     */
    public static void keepDog(ArrayList<? extends Dog> list) {

    }
}
