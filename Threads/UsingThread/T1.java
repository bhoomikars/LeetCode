public class T1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("t1");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {

            }
        }
    }
}
