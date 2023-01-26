package LockAdderSubtractor;

import org.w3c.dom.html.HTMLCollection;

import java.util.Locale;
import java.util.concurrent.locks.Lock;

public class Subtract implements  Runnable{
    Count count;
    Lock lock;

    Subtract(Count count, Lock lock){

        this.count=count;
        this.lock=lock;
    }
    @Override
    public void run() {
        for(int i=0; i<=10000; i++){
            lock.lock();
            count.value-=i;
            lock.unlock();
        }
    }
}
