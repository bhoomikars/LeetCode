public class T2 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("t2");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {

            }
        }
    }
}

