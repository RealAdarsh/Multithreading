package MergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String []args) throws ExecutionException, InterruptedException {
        List <Integer> toBeSorted= List.of(7,1,3,4,5,1);
        ExecutorService executorService= Executors.newCachedThreadPool();
        MergeSorter ans= new MergeSorter(toBeSorted, executorService);
        Future <List <Integer>> futAns= executorService.submit(ans);
        System.out.println(futAns.get());
    }
}
