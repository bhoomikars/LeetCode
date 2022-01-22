public class Main
{
    public static void main (String[] args)
    {
        Table t = new Table();
        Table r = new Table();
        T3 t3 = new T3(r);
        Thread thread3 = new Thread(t3);
        T1 t1 = new T1(t);
        T2 t2 = new T2(t);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
     thread3.start();
    }
}
