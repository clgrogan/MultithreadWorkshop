package thread.creation;

import demo.bankhack.DescendingHackerThread;

import static mt.tools.Tools.printThreadDetails;

public class MyThread extends Thread{
    @Override
    public void run(){
        printThreadDetails("\nrun() executed for:", this);
    }

}
