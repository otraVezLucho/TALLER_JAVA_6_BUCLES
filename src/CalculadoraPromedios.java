import javax.swing.*;
import java.util.Scanner;

public class CalculadoraPromedios {
    public static void calcularPromedio(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuantas notas desea ingresar?: ");
         int cantidadNotas = scan.nextInt();
         int contador =0;
        double notasEntrada =0;
        double sumaNotas =0;
        double promedio;
         for (int i = 0; i < cantidadNotas; i++){
             System.out.println("Ingrese una notas del 1 al 10: ");
             sumaNotas += notasEntrada = scan.nextDouble();
         }
         promedio = sumaNotas / cantidadNotas;
         if(promedio>=8){
             System.out.println("Excelente "+promedio);
         } else if (promedio<8 && promedio >=6) {
             System.out.println("Aprovado " + promedio);
         }else {
             System.out.println("Reprobado "+promedio);
         }
    }
}
