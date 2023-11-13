package demo.join;

import java.math.BigInteger;

public class FactorialThread extends Thread{

    private long factorialNumber;
    private BigInteger result = BigInteger.ZERO;
    private boolean isFinished = false;

    public FactorialThread(long factorial){
        this.factorialNumber = factorial;
    }

    @Override
    public void run(){
        this.result = factorial(factorialNumber);
        System.err.println(factorialNumber + " : " + result);
        this.isFinished = true;
    }

    private BigInteger factorial(long factorialNumber) {
        BigInteger factResult = BigInteger.ONE;

        for (long i = 1l; i <= factorialNumber; i++) {
            factResult = factResult.multiply(new BigInteger(Long.toString(i)));
        }

        return factResult;
    }

    public boolean isFinished(){ return this.isFinished;}

    public BigInteger getResult(){ return this.result;}
}
