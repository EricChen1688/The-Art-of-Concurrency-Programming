package cn.eccto.chapter03;

public class DaemonThread {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " running");
                try {
                    Thread.sleep(100_000);
                } catch (Exception e) {

                }
                System.out.println(Thread.currentThread().getName() + "done.");
            }
        };
        thread.setDaemon(true);//设置为守护线程，当main线程结束，守护线程也会结束
        thread.start();
        Thread.sleep(50_000);

        System.out.println(Thread.currentThread().getName() + "finish");
    }
}
