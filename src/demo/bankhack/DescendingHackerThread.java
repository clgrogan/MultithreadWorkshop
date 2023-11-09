package demo.bankhack;

public class DescendingHackerThread extends HackerThread {
    public DescendingHackerThread(Vault vault) {
        super(vault);
    }

    @Override
    public void run(){
        for(int i = Specifications.MAX_PASSWORD; i >= 0; i--){
            if (vault.isCorrectPassword(i)) {
                System.err.println("\nThread " + this.getName() + " guessed the password " + i + "\n\nThe application is terminating.");
                System.exit(0);
            }
        }
    }
}
