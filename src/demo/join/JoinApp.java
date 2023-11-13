package demo.join;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinApp {
    public static void main(String[] args){
        List<Long> inputNumbers = Arrays.asList(0L, 100000l,3l, 5l, 435l, 4356l, 2354l, 5000l);
        List<FactorialThread> threads = new ArrayList<>();
        List<BigInteger> factorialResults = new ArrayList<>();

        inputNumbers.stream().forEach(e -> threads.add(new FactorialThread(e)));

        threads.stream().forEach(thread -> {
            thread.start();
            try {
                thread.join(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        for (int i = 0; i < inputNumbers.size(); i++) {
            FactorialThread factorialThread = threads.get(i);
            if (factorialThread.isFinished()){
                System.out.println(inputNumbers.get(i) + "! = " + factorialThread.getResult());
            } else {
                System.out.println("\tThe calculation is still in progress for " + inputNumbers.get(i)+"!");
            }
        }
    }
}
