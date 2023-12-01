/*
 + Created By AliRad
 + Time   : 12/1/2023 AT 8:03 AM
 + Github : https://github.com/AliiRad
*/

public class MyRunnable implements Runnable{

    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try{
            for(int i=0;i < 5; i++){
                System.out.println(threadName + ": count_"+i);
            }
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
