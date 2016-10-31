package com.company;

public class Main
{
    private static final String command = "ps -fea | grep -i root"; //Mostrar procesos corriendo pertenecientes al root

    public static void main(String[] args) throws InterruptedException
    {
        int size=100;
        int[] first = new int[size];
        int[] second = new int[size];
        int[] result = new int[size];
        //ThreadSumador[] hilosSumadores = new ThreadSumador[size];

        for (int i = 0; i < size; i++) //Inizializar arreglos con su index como valor
        {
            first[i]=i+1;
            second[i]=i+1;
        }

        for (int i = 0; i < size; i++) //Iteramos sobre las sumas
        {
            ThreadSumador current = new ThreadSumador(first[i],second[i]);

            synchronized (current)
            {
                current.start();
                current.wait();
                result[i] = current.getResult();
            }
        }

        for (int i = 0; i < size; i++)
        {
            System.out.println(result[i]);
        }
    }
}