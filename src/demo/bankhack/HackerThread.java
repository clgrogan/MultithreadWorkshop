package demo.bankhack;

import demo.bankhack.Vault;

public abstract class HackerThread extends Thread{
    Vault vault;
    public HackerThread(Vault vault) {
        this.vault = vault;
        this.setName(this.getClass().getSimpleName());
        this.setPriority(Thread.MAX_PRIORITY);
    }

    @Override
    public void start(){
        System.out.println("\nStarting thread: "+this.getName());
        super.start();
    }
}
