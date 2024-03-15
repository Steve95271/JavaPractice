package A09_Exception;

import A09_Exception.MyException.AgeOutOfBoundsException;
import A09_Exception.MyException.NameFormatException;
import java.util.Scanner;

public class Exception03 {
    public static void main(String[] args) {
        Person p1 = new Person();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Insert name: ");
                String name = scanner.nextLine();
                p1.setName(name);

                System.out.println("Insert age: ");
                int age = Integer.parseInt(scanner.nextLine());
                p1.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入数字");
            } catch (NameFormatException e ) {
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        System.out.println(p1);

    }
}
