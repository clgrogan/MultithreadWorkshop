package mt.tools;

public interface Tools {


    static void printThreadDetails(String description, Thread aThread){
        System.out.println("\n"+description);
        System.out.println("\tgroup: "+ aThread.getThreadGroup());
        System.out.println("\tname: "+ aThread.getName());
        System.out.println("\tid, priority, state: "
                + aThread.getId()
                + ", " + aThread.getPriority()
                + ", " + aThread.getState()
        );
    }
}
