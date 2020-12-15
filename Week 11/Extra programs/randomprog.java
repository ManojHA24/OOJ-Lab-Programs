import java.util.Random;
class thread8 implements Runnable{
    Thread m,n,p;
    thread8(){
        m = new Thread(this,"THREAD1");
        n = new Thread(this,"THREAD_2");
        p = new Thread(this,"THREAD_3");
        n.start();
        p.start();
    }

    public void run(){
        try {
            Random rand = new Random();
            for (int i=0;i<5;i++) {
                int rand_int = rand.nextInt(10);
                if (rand_int % 2 == 0) {
                    int temp, sq;
                    temp = rand_int;
                    sq = temp * temp;
                    System.out.println("SQUARE OF: "+temp+ " :"+ sq);
                    Thread.sleep(2000);
                } else {
                    int temp1, cube;
                    temp1 = rand_int;
                    cube = temp1 * temp1 * temp1;
                    System.out.println("CUBE OF: "+temp1+" :"+cube);
                    Thread.sleep(4000);
                }

            }
        } catch(InterruptedException e){
                System.out.println("CHILD THREADS ARE INTERRUPTED WHILE SLEEPING");
            }

    }
}


class W11extra2{
    public static void main(String ss[]){
        thread8 n1 = new thread8();
        thread8 n2 = new thread8();
        thread8 n3 = new thread8();
    }
}
