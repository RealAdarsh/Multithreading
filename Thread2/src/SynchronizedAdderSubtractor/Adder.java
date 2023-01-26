package SynchronizedAdderSubtractor;

public class Adder implements Runnable{
    Count count;

    Adder(Count count){
        this.count=count;
    }

    @Override
    public void run() {
        for (int i=0; i<=10000; i++){
//            synchronized (count){
//                count.increment(i);
//            }
            count.increment(i);

        }
    }
}
