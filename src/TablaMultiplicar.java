import java.util.Scanner;

public class TablaMultiplicar {
    public static void tablaMultiplicar(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entre el 1 al 10: ");
        int numero = scan.nextInt();
        int resultado =0;
        System.out.println("tabla del "+numero);
        for (int i =1; i < 12; i++){
            resultado = numero * i;

            System.out.println(numero+" * "+ i +" = " +resultado );
            scan.close();
        }
    }
}
