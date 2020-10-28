/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/28/2020
 * Time: 11:48 AM
 */
public class OddThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("odd: " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
