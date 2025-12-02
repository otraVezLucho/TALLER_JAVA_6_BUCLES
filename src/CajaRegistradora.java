import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CajaRegistradora {

    /*

    1. Caja Registradora de Comida Rápida

Simula el funcionamiento de una caja registradora para un restaurante de
comida rápida.

1. Muestra un menú con opciones de comida (ejemplo: Hamburguesa $50,
Papas $30, Refresco $20).

2. Permite al usuario seleccionar múltiples artículos y calcular el total.

3. Usa un bucle do-while para que el usuario pueda agregar más artículos
hasta que decida salir.

4. Al final, muestra el total y el cambio si paga más del monto.
     */
    public static void menuComida(){
        Scanner scan = new Scanner(System.in);
        int opcion;
        double total = 0;



            do {
                System.out.println("\nMenu del dia.\n");
                System.out.println("1. Hamburguesa - $15");
                System.out.println("2. Perro caliente - $14");
                System.out.println("3. Salchipapa Costeña - $13");
                System.out.println("4. Salchipapa Americana - $11");
                System.out.println("5. Pizza - $8");
                System.out.println("6. Salir");
                System.out.println("Elige la opcion que quieres del menu: ");
                opcion = scan.nextInt();
                scan.nextLine();

                switch (opcion){
                    case 1 -> {
                        total += 15;
                        System.out.println("Resumen de  compra: "+ total);
                    }
                    case 2 -> {
                        total += 14;
                        System.out.println("Resumen de  compra: " + total);

                    }
                    case 3 -> {
                        total += 13;
                        System.out.println("Resumen de  compra: " + total);
                    }
                    case 4 -> {
                        total += 11;
                        System.out.println("Resumen de  compra: " + total);

                    }
                    case 5 -> {
                        total += 9;
                        System.out.println("Resumen de  compra: " + total);
                    }
                }
            }while (opcion != 6);
        System.out.println("Ingrese su disponible para relizar el pago: ");
        double presupuesto = scan.nextDouble();
        if (total<presupuesto){
            System.out.println("total a pagar: " + total);
            System.out.println("Pago realizado, se da un cambio de "+(presupuesto - total));

        }else {

        System.out.println("total a pagar: " + total);
        System.out.println("no cuenta con el dinero para realizar el pago" );
        }
        scan.close();
    }
}



