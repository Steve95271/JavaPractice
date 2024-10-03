package A15_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

/**
 * 获取构造方法
 */
public class ReflectionExample_02 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //get bytecode file class
        Class<?> aClass = Class.forName("A15_Reflection.Person");

        //get constructor object
        System.out.println("1.getConstructors(). Only public");
        Constructor<?>[] cons1 = aClass.getConstructors();
        for (Constructor<?> constructor : cons1) {
            System.out.println(constructor);
        }
        System.out.println("=================");

        // get constructor object include private
        System.out.println("2.getDeclaredConstructors(). Include private");
        Constructor<?>[] cons2 = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : cons2) {
            System.out.println(constructor);
        }
        System.out.println("==================");

        // get constructor by parameter, only public
        System.out.println("3.get specific public constructor");
        Constructor<?> constructorWithNoPar = aClass.getConstructor();
        Constructor<?> constructorWithPar = aClass.getConstructor(String.class, int.class, String.class);
        System.out.println(constructorWithNoPar);
        System.out.println(constructorWithPar);
        System.out.println("===================");

        // public and private - use getDeclaredConstructor(), can pass parameter to get the specific constructor
        System.out.println("4.get specific public or private constructor");
        Constructor<?> cons3 = aClass.getDeclaredConstructor(String.class, String.class);
        System.out.println(cons3);
        System.out.println("===================");

        // getModifier()
        System.out.println("5.get modifier");
        int modifiers = cons3.getModifiers();
        System.out.println(modifiers);
        System.out.println("===================");

        // getParameters()
        System.out.println("6.get parameters");
        Parameter[] parameters = cons3.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        System.out.println("===================");

        // create instance by constructors from reflect
        System.out.println("7.create instance by constructors from reflect");
        // Here only give the example create by a private constructor.
        // Create instance with public constructor will be same, only one step different from private constructor
        // Set the private constructor can be use outside the class
        cons3.setAccessible(true);
        Person person = (Person) cons3.newInstance("Alice", "female");
        person.setAge(19);
        System.out.println(person);

    }

}
