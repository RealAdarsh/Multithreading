package AdderSubractor;

public class Adder implements Runnable{
    Count count;

    Adder(Count count){
        this.count=count;
    }

    @Override
    public void run() {
        for (int i=0; i<=10000; i++){
            count.value+=i;
        }
    }
}
