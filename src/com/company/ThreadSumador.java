package com.company;

/**
 * Created by Ruben on 10/31/16.
 */
public class ThreadSumador extends Thread
{
    private int a,b,result;

    ThreadSumador(int a,int b) //Combinaciones de k en n 0<=k<=n
    {
        this.a=a;
        this.b=b;
    }
    public int getResult()
    {
        return result;
    }

    @Override
    public void run()
    {
        synchronized (ThreadSumador.this)
        {
            this.result=a+b;
            notify();
        }
    }
}
