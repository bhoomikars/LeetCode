public class Table
{
    public static synchronized void printTable(int n)
    {

            for (int i = 1; i <= 5; i++) {
                System.out.println(i * n);
                try {
                    Thread.sleep(1000);
                }
                catch (Exception e) {

                }
            }

    }
}
