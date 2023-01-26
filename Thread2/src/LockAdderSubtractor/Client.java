package LockAdderSubtractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock= new ReentrantLock();
        Adder add= new Adder(count, lock);
        Subtract sub= new Subtract(count, lock);
        Thread t1= new Thread(add);
        Thread t2= new Thread(sub);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
//        add.run();
//        sub.run();

       System.out.println(count.value);
    }
}
