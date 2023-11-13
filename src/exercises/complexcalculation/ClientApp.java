package exercises.complexcalculation;

import java.math.BigInteger;

public class ClientApp {
    public static void main(String[] args) {
        ComplexCalculation calculator = new ComplexCalculation();

        BigInteger result = calculator.calculateResult(new BigInteger("1"), new BigInteger("3"),new BigInteger("2"),new BigInteger("5000000"));

        System.out.println(result);
    }
}
