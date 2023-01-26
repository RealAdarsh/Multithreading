package SynchronizedAdderSubtractor;

public class Count {
    private int value=0;

    public int getValue(){
        return value;
    }
    public synchronized void increment(int i){
        value+=i;
    }
}
