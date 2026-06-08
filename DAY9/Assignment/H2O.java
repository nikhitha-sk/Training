public class H2O {
    int hcount = 0;
    public H2O() {
        
    }

    public synchronized  void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		while(hcount == 2){
            wait();
        }
        releaseHydrogen.run();
        hcount++;
        notifyAll();
    }

    public synchronized  void oxygen(Runnable releaseOxygen) throws InterruptedException {
        while(hcount < 2){
            wait();
        }
       
		releaseOxygen.run();
        hcount=0;
        notifyAll();
    }
    
    public static void main(String[] args) {
        H2O h2o = new H2O();
        
        new Thread(() -> {
            try {
                h2o.hydrogen(() -> System.out.print("H"));
            } catch (InterruptedException e) {}
        }).start();
        
        new Thread(() -> {
            try {
                h2o.hydrogen(() -> System.out.print("H"));
            } catch (InterruptedException e) {}
        }).start();
        
        new Thread(() -> {
            try {
                h2o.oxygen(() -> System.out.print("O"));
            } catch (InterruptedException e) {}
        }).start();
    }
}