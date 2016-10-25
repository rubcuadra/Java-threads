package com.company;

public class Main
{
    private static final String command = "ps -fea | grep -i root"; //Mostrar procesos corriendo pertenecientes al root

    public static void main(String[] args) throws InterruptedException
    {
        args = new String[]{"10","2"}; //En terminal se mandaria a llamar el "ejecutable 10 2"

        if (args.length == 2)
        {
            ThreadLetras a = new ThreadLetras();
            ThreadCommand b = new ThreadCommand(command);
            ThreadOperaciones c = new ThreadOperaciones //Pasamos los parametros como integers
                    (Integer.parseInt(args[1]),Integer.parseInt(args[0]));

            synchronized (a) //Con esto estamos pendientes al synchronized del hilo a
            {
                a.start();  //Ejecuta el run del hilo a
                System.out.println("Esperando a que acabe a ...");
                a.wait(); //Esperamos a que el run() synchronized de a nos diga notify()
                System.out.println("a Terminado");
            }
            synchronized (b) //Con esto estamos pendientes al synchronized del hilo b
            {
                b.start();  //Ejecuta el run del hilo b
                System.out.println("Esperando a que acabe b ...");
                b.wait(); //Esperamos a que el run() synchronized de b nos diga notify()
                System.out.println("b Terminado");
            }
            synchronized (c) //Con esto estamos pendientes al synchronized del hilo c
            {
                c.start();  //Ejecuta el run del hilo b
                System.out.println("Esperando a que acabe c ...");
                c.wait(); //Esperamos a que el run() synchronized de c nos diga notify()
                //c.getTotal() //??? Preguntar a moi
                System.out.println("c Terminado");
            }
            System.out.println("Finalizado main");
        }
        else
            System.out.println("Parametros insuficientes");
    }
}
