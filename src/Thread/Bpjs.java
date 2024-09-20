package Thread;

public class Bpjs {

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
           try {
               Thread.sleep(3000);
               System.out.println("BPJS");
           }catch (Exception e){
               System.out.println(e);
           }

        });

        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(1000);
                System.out.println("Allianz");
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        });

        t1.start();
        t2.start();
    }
}
