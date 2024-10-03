package A15_Reflection;

/**
 * 获取字节码文件对象的三种方式
 */
public class ReflectionExample_01 {

    public static void main(String[] args) throws ClassNotFoundException {
        //1. Through this Class.forName() static method to get the class
        Class<?> aClass1 = Class.forName("A15_Reflection.Person");

        //2. Through class attribute to get class
        Class<Person> aClass2 = Person.class;

        System.out.println(aClass1 == aClass2);

        //3. Through object's bytecode file to get class
        Person person = new Person();
    }

}
