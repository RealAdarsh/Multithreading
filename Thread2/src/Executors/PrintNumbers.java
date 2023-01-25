package Executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NumberPrinter implements Runnable{

    int number;

    NumberPrinter(int num){
        number=num;
    }

    @Override
    public void run() {
        System.out.println("Number = " + number + " Thread Name: "+ Thread.currentThread().getName());
    }
}

public class PrintNumbers {
    public static void main(String [] args){
        ExecutorService executorService= Executors.newFixedThreadPool(10);

        for (int i=0; i<100; i++){
            if (i==5 || i==7 || i==9 || i==11 ||i==15 || i==17 || i==25){
                System.out.println(i);
            }
            NumberPrinter num=new NumberPrinter(i);
            executorService.submit(num);
        }
        executorService.shutdown();
    }
}
