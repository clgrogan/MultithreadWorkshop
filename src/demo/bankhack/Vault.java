package demo.bankhack;

public class Vault {
    private int password;
    public Vault(int password){
        this.password = password;
        System.out.println("Password: "+ this.password);
    }
    public boolean isCorrectPassword(int pwd){
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this.password == pwd;
    }
}
