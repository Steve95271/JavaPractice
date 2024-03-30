package A12_Thread;

public class TicketThread extends Thread{
    //static关键字使得所有对象都会共用一个ticket资源
    static int ticket;


    //同步代码块需要传入一个Object，这个Object同样需要static进行修饰。

    static Object object = new Object();



    @Override
    public void run() {

        while (true) {
            //同步代码块
            //传入唯一的参数也可以是使用类名.class
            synchronized (object) {
                if (ticket <= 500) {

                    System.out.println(getName() + ": " + ticket);
                } else {
                    break;
                }
                ticket++;
            }
        }

    }
}
