package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Ruben on 10/25/16.
 *
 * Crear un tercer thread o proceso hijo que haga el cálculo 
 * matemático de las combinaciones de n en k, donde el valor de la n y 
 * la k deben pasarse como 2 parámetros al ejecutable y ser definidos 
 * en el proceso padre. El resultado final del cálculo se hará al final en 
 * el proceso padre de los 3 threads (no en este proceso hijo).
 *
 * Combinaciones (n) =     n!
 *               (r)    r!(n-r)!
 */
public class ThreadOperaciones extends Thread
{
    private int n,k;
    ThreadOperaciones(int n,int k) //Combinaciones de k en n 0<=k<=n
    {
        this.n = n;
        this.k = k;
    }

    @Override
    public void run()
    {
        synchronized (ThreadOperaciones.this)
        {
            try
            {
                BigInteger nk = combinations(n,k);
                System.out.println("Numero de combinaciones "+k+" en "+n+" = "+nk);

            } catch (Exception e)
            {
                e.printStackTrace();
            }

            notify();
        }
    }

    public static BigInteger combinations(final int max_elems, final int combinaciones) //Nos devuelve el numero de combinaciones
    {
        BigInteger ret = BigInteger.ONE;
        for (int i = 0; i < combinaciones; i++)
        {
            ret = ret.multiply(BigInteger.valueOf(max_elems-i))
                    .divide(BigInteger.valueOf(i+1)); //Formula, se itera por cada lugar i
        }
        return ret;
    }

}
