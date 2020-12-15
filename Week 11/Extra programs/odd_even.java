class Thread1 implements Runnable {
    Thread t;
    int sum = 0;

    Thread1() {
        t = new Thread(this, "ODDThread");
        System.out.println("THREAD:" + t);
        t.start();
    }

    public void run() {
        try {
            for (int n = 1; n <= 100; n = n + 2) {
                System.out.println("ODD THREAD " + n);
                sum = sum + n;
                Thread.sleep(100);
            }
        } catch (InterruptedException ie) {
            System.out.println("ODD THREAD Interrupted");
        }
            System.out.println("ODD THREAD quitting");
            System.out.println("SUM OF ODD NUMBERS=" + sum);
        
    }

}

    class OddEven1 {
        public static void main(String ss[]) {
            int sum = 0;
            Thread1 n1 = new Thread1();
            try {
                for (int n = 2; n <= 100; n = n + 2) {
                    System.out.println("EVEN Thread" + n);
                    sum = sum + n;
                    Thread.sleep(100);
                }
            } catch (InterruptedException ie) {
                System.out.println("EVEN Thread interrupted");
            }
            System.out.println("EVEN Thread quitting");
            System.out.println("SUM OF EVEN NUMBERS=" + sum);
        }
    }
