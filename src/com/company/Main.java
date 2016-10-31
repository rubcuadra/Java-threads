package com.company;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        int size=100;
        int[] first = new int[size];
        int[] second = new int[size];
        int[] result = new int[size];

        ThreadSumador[] hilosSumadores = new ThreadSumador[size];

        for (int i = 0; i < size; i++) //Inizializar arreglos con su index como valor
        {
            first[i]=i+1;
            second[i]=i+1;
        }

        for (int i = 0; i < size; i++) //Creamos los hilos y los disparamos
        {
            hilosSumadores[i] = new ThreadSumador(first[i],second[i]);
            hilosSumadores[i].start();
        }

        for (int i = 0; i < size; i++) //Guardamos sus resultados
        {
            synchronized (hilosSumadores[i])
            {
                if (hilosSumadores[i].isAlive()) //Si esta vivo este hilo esperamos a que acabe
                {
                    hilosSumadores[i].wait();
                }
                result[i] = hilosSumadores[i].getResult(); //Guardamos su resultado
            }
        }
        printArray(result);
    }
    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}