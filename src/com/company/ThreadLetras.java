package com.company;

/**
 * Created by Ruben on 10/25/16.
 */
public class ThreadLetras  extends Thread
{
    ThreadLetras() {}

    @Override
    public void run()
    {
        synchronized (ThreadLetras.this)
        {
            try
            {
                /*
                    Aqui va el codigo
                 */

            } catch (Exception e)
            {
                e.printStackTrace();
            }
            notify(); //Decirle a los que esten sincronizados con este hilo que ya acabo
        }
    }
}
