public class T2 implements Runnable
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

