package SynchronizedAdderSubtractor;

import java.util.concurrent.locks.Lock;

public class Subtract implements  Runnable{
    Count count;

    Subtract(Count count){
        this.count=count;
    }
    @Override
    public void run() {
        for(int i=0; i<=10000; i++){
//            synchronized (count){
//                count.increment(i);
//            }
            count.increment(-i);

        }
    }
}
