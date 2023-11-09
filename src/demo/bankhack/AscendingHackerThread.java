package demo.bankhack;

public class AscendingHackerThread extends HackerThread {
    public AscendingHackerThread(Vault vault) {
        super(vault);
    }

    @Override
    public void run(){
        for(int i = 0; i <= Specifications.MAX_PASSWORD; i++){
            if (vault.isCorrectPassword(i)) {
                System.err.println("\nThread " + this.getName() + " guessed the password " + i + "\n\nThe application is terminating.");
                System.exit(0);
            }
        }
    }
}
