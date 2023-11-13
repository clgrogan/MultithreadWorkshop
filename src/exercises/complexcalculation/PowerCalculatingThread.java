package exercises.complexcalculation;

import java.math.BigInteger;

public class PowerCalculatingThread extends Thread{
    private BigInteger result = BigInteger.ONE;
    private BigInteger base;
    private BigInteger power;
    private boolean isFinished;

    public PowerCalculatingThread(BigInteger base, BigInteger power) {
        this.base = base;
        this.power = power;
    }

    @Override
    public void run(){
        for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0 ; i = i.add(BigInteger.ONE)) {
            result = result.multiply(base);
        }
        isFinished = true;
    }

    public boolean isFinished(){ return this.isFinished;}

    public BigInteger getResult(){ return this.result;}
}
