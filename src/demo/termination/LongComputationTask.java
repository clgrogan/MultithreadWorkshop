package demo.termination;

import java.math.BigInteger;

public class LongComputationTask implements Runnable{
    private BigInteger base;
    private BigInteger power;

    public LongComputationTask(BigInteger base, BigInteger power) {
        this.base = base;
        this.power = power;
    }

    @Override
    public void run() {
        System.out.println("\nStarting " + this.getClass().getSimpleName() + " thread.");
        System.out.println("\n"+base+" ^ "+ power + " = "+ pow(base,power));
    }

    private BigInteger pow(BigInteger base, BigInteger power){
        BigInteger result = BigInteger.ONE;

        for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0 ; i = i.add(BigInteger.ONE)) {
            if (Thread.currentThread().isInterrupted()) {
                System.err.println("\nInterrupted at iteration " + i);
                return BigInteger.ZERO;
            }
            result = result.multiply(base);
            if (i.remainder(new BigInteger("1000")).equals(BigInteger.ZERO))
                System.out.println("\tIteration: " + i);
        }

        return result;
    }
}
