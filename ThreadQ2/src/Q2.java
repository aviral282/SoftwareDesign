public class Q2 extends Thread
{
    public static void main(String[] args)
    {
             Incrementer  i = new Incrementer();                     
            // i.incrementer();
             i.start();
             Decrementer d = new Decrementer();                  
         //    d.decrementer();
           d.start();
    }
}


/**************************************/


class Incrementer extends Thread{
     public void run()
    {             for (int i = 1; i <= 6; i++)
                  {
                                 System.out.println("Incrementer: "+ i);
                                 try{ Thread.sleep(1000);}
                                 catch(Exception e){}
                      }
    }}


/**************************************/

class Decrementer extends Thread{
      public void run()
      {             for (int i = 6; i >0; i--)
                    {
                                  System.out.println("Decrementer: "+ i);
                                  try{ Thread.sleep(1000);}
                                  catch(Exception e){}
        }
    }
}

