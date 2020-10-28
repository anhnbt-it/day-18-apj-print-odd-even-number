/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/28/2020
 * Time: 11:51 AM
 */
public class Main {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();

        Thread t1 = new Thread(odd);
        Thread t2 = new Thread(even);
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        t2.start();
    }
}
