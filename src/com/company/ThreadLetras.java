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
                letraA();
                letraL();
                letraO();
                letraN();
                letraS();
                letraO();
                espacio();
                letraY();
                espacio();
                letraR();
                letraU();
                letraB();
                letraE();
                letraN();
                espacio();
                espacio();
                letraA();
                numero0();
                numero1();
                numero0();
                numero2();
                numero1();
                numero6();
                numero2();
                numero1();
                espacio();
                letraY();
                letraA();
                numero0();
                numero1();
                numero0();
                numero1();
                numero9();
                numero1();
                numero0();
                numero2();

            } catch (Exception e)
            {
                e.printStackTrace();
            }
            notify(); //Decirle a los que esten sincronizados con este hilo que ya acabo
        }
    }

    private void letraA(){
        System.out.print("          A          \n");
        System.out.print("         A A         \n");
        System.out.print("        A   A        \n");
        System.out.print("       A     A       \n");
        System.out.print("      A       A      \n");
        System.out.print("     A         A     \n");
        System.out.print("    AAAAAAAAAAAAA    \n");
        System.out.print("   A             A   \n");
        System.out.print("  A               A  \n");
        System.out.print(" A                 A \n");
        System.out.print("                     \n");}

    private void letraB(){
        System.out.print("      BBBBB          \n");
        System.out.print("      B    B         \n");
        System.out.print("      B     B        \n");
        System.out.print("      B    B         \n");
        System.out.print("      BBBBB          \n");
        System.out.print("      BBBBB          \n");
        System.out.print("      B    B         \n");
        System.out.print("      B     B        \n");
        System.out.print("      B    B         \n");
        System.out.print("      BBBBB          \n");
        System.out.print("                     \n");}

    private void letraE(){
        System.out.print("      EEEEEEE        \n");
        System.out.print("      E              \n");
        System.out.print("      E              \n");
        System.out.print("      E              \n");
        System.out.print("      EEEEE          \n");
        System.out.print("      E              \n");
        System.out.print("      E              \n");
        System.out.print("      E              \n");
        System.out.print("      E              \n");
        System.out.print("      EEEEEEE        \n");
        System.out.print("                     \n");}

    private void letraL()
    {
        System.out.print("      L              \n");
        System.out.print("      L              \n");
        System.out.print("      L              \n");
        System.out.print("      L              \n");
        System.out.print("      L              \n");
        System.out.print("      L              \n");
        System.out.print("      L              \n");
        System.out.print("      L              \n");
        System.out.print("      L              \n");
        System.out.print("      LLLLLLL        \n");
        System.out.print("                     \n");
    }
    private void letraN()
    {
        System.out.print("  NN         N        \n");
        System.out.print("  N N        N        \n");
        System.out.print("  N  N       N        \n");
        System.out.print("  N   N      N        \n");
        System.out.print("  N    N     N        \n");
        System.out.print("  N     N    N        \n");
        System.out.print("  N      N   N        \n");
        System.out.print("  N       N  N        \n");
        System.out.print("  N        N N        \n");
        System.out.print("  N         NN        \n");
        System.out.print("                      \n");
    }
    private void letraO()
    {
        System.out.print("        OOOO          \n");
        System.out.print("      OO    OO        \n");
        System.out.print("    OO        OO      \n");
        System.out.print("   OO          OO     \n");
        System.out.print("   O            O     \n");
        System.out.print("   O            O     \n");
        System.out.print("   OO          OO     \n");
        System.out.print("    OO        OO      \n");
        System.out.print("      OO    OO        \n");
        System.out.print("        OOOO          \n");

    }
    private void letraR()
    {
        System.out.print("      RRRRR           \n");
        System.out.print("     R     R          \n");
        System.out.print("     R      R         \n");
        System.out.print("     R      R         \n");
        System.out.print("     R     R          \n");
        System.out.print("     RRRRRR           \n");
        System.out.print("     R     R          \n");
        System.out.print("     R      R         \n");
        System.out.print("     R       R        \n");
        System.out.print("     R        R       \n");
        System.out.print("                      \n");
    }
    private void letraS()
    {
        System.out.print("        SSSS          \n");
        System.out.print("       S              \n");
        System.out.print("       S              \n");
        System.out.print("        S             \n");
        System.out.print("         S            \n");
        System.out.print("          S           \n");
        System.out.print("           S          \n");
        System.out.print("            S         \n");
        System.out.print("            S         \n");
        System.out.print("        SSSS          \n");
        System.out.print("                      \n");
    }
    private void letraU()
    {
        System.out.print("    U         U       \n");
        System.out.print("    U         U       \n");
        System.out.print("    U         U       \n");
        System.out.print("    U         U       \n");
        System.out.print("    U         U       \n");
        System.out.print("    U         U       \n");
        System.out.print("    U         U       \n");
        System.out.print("     U       U        \n");
        System.out.print("      U     U         \n");
        System.out.print("       UUUUU          \n");
        System.out.print("                      \n");
    }
    private void letraY()
    {
        System.out.print("   Y           Y      \n");
        System.out.print("    Y         Y       \n");
        System.out.print("     Y       Y        \n");
        System.out.print("      Y     Y         \n");
        System.out.print("       Y   Y          \n");
        System.out.print("        Y Y           \n");
        System.out.print("         Y            \n");
        System.out.print("         Y            \n");
        System.out.print("         Y            \n");
        System.out.print("         Y            \n");
        System.out.print("                      \n");
    }
    private void espacio()
    {
        System.out.print("                      \n");
        System.out.print("                      \n");
        System.out.print("                      \n");
        System.out.print("                      \n");
        System.out.print("                      \n");
        System.out.print("                      \n");
        System.out.print("                      \n");
        System.out.print("                      \n");
        System.out.print("                      \n");
        System.out.print("                      \n");
    }

    private void numero0()
    {
        System.out.print("        0000          \n");
        System.out.print("       0    0         \n");
        System.out.print("      0    000        \n");
        System.out.print("     0    00  0       \n");
        System.out.print("     0   00   0       \n");
        System.out.print("     0  00    0       \n");
        System.out.print("     0 00     0       \n");
        System.out.print("      00     0        \n");
        System.out.print("       0    0         \n");
        System.out.print("        0000          \n");
        System.out.print("                      \n");


    }

    private void numero1(){
        System.out.print("         11           \n");
        System.out.print("        1 1           \n");
        System.out.print("       1  1           \n");
        System.out.print("      1   1           \n");
        System.out.print("          1           \n");
        System.out.print("          1           \n");
        System.out.print("          1           \n");
        System.out.print("          1           \n");
        System.out.print("          1           \n");
        System.out.print("     1111111111       \n");
    }

    private void numero2()
    {
        System.out.print("     22222222222      \n");
        System.out.print("     2         2      \n");
        System.out.print("     2         2      \n");
        System.out.print("               2      \n");
        System.out.print("               2      \n");
        System.out.print("      222222222       \n");
        System.out.print("      2               \n");
        System.out.print("      2        2      \n");
        System.out.print("      2        2      \n");
        System.out.print("      2222222222      \n");
    }

    private void numero6()
    {
        System.out.print("    66666666666       \n");
        System.out.print("    6                 \n");
        System.out.print("    6                 \n");
        System.out.print("    6                 \n");
        System.out.print("    6                 \n");
        System.out.print("    66666666666       \n");
        System.out.print("    6         6       \n");
        System.out.print("    6         6       \n");
        System.out.print("    6         6       \n");
        System.out.print("    66666666666       \n");
    }

    private void numero9()
    {
        System.out.print("    66666666666       \n");
        System.out.print("    6         6       \n");
        System.out.print("    6         6       \n");
        System.out.print("    6         6       \n");
        System.out.print("    66666666666       \n");
        System.out.print("              6       \n");
        System.out.print("              6       \n");
        System.out.print("              6       \n");
        System.out.print("              6       \n");
        System.out.print("    66666666666       \n");
    }
}
