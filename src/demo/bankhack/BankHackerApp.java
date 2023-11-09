package demo.bankhack;

import mt.tools.Tools;

import java.util.ArrayList;
import java.util.List;

public class BankHackerApp {
    private static Vault vault = new Vault(Tools.generateRandomPositiveIntUpToN(Specifications.MAX_PASSWORD));
    public static void main(String args[]){
        List<Thread> threads = new ArrayList<>();
        threads.add(new DescendingHackerThread(vault));
        threads.add(new AscendingHackerThread(vault));
        threads.add(new Police());


        System.out.println("Let the hacking begin!");
        threads.stream().forEach(e -> e.start());
    }
}
