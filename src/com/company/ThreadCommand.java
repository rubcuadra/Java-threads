package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ruben on 10/24/16.
 */
class ThreadCommand extends Thread
{
    private String command;
    ThreadCommand(String cmd)  //Constructor que recibe un comando a ejecutar
    {
        command = cmd;
    }
    @Override
    public void run()
    {
        synchronized (ThreadCommand.this)
        {
            try
            {
                Process p = Runtime.getRuntime().exec(command); //Executar comando
                p.waitFor();
                //Preparar para leer del buffer de respuesta que genero el comando
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line;

                while ((line=reader.readLine())!=null)
                {
                    System.out.println(line);   //Imprimir cada linea que devolvio el comando
                }

            } catch (Exception e)
            {
                e.printStackTrace();
            }
            notify(); //Decirle a los que esten sincronizados con este hilo que ya acabo
        }
    }
}