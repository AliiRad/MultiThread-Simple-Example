/*
 + Created By AliRad
 + Time   : 12/1/2023 AT 8:07 AM
 + Github : https://github.com/AliiRad
*/

public class MultiThreadMain {
    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable("Thread1");
        MyRunnable runnable2 = new MyRunnable("Thread2");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        System.out.println("Main Thread is running concurrently with other threads.");
    }
}
