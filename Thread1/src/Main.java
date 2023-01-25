
class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello world! from other side" + " " + Thread.currentThread().getName());
    }
}

// task is to print one number into one thread from 1-100

class NumberPrinter implements  Runnable{
    int number;

    NumberPrinter(int num){
        this.number=num;
    }
    @Override
    public void run() {
        System.out.printf("%d, printed by thread: %s \n",number, Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!" + " " + Thread.currentThread().getName());
//        HelloWorldPrinter printer=new HelloWorldPrinter();
//        Thread t1= new Thread(printer);

        for (int i=1; i<=100; i++){
            NumberPrinter printer=new NumberPrinter(i);
            Thread t1=new Thread(printer);
            t1.start();
        }
    }
}