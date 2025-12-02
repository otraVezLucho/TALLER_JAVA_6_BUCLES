import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void calcularDescuento(){
        Scanner scan = new Scanner(System.in);


        System.out.println("Nombre del producto: ");
        String nombreProducto = scan.nextLine();
        System.out.println("Indique el precio del prodcuto: ");
        double precioProducto = scan.nextDouble();
        double total = 0;
        for (int i = 1; i <=5; i++ ){
            double porcentaje = 0.1;
            porcentaje *= i;
            //System.out.println(porcentaje);
            total = precioProducto-(precioProducto * porcentaje);
            System.out.println("Lista de descuentos:");
            System.out.println( (10*i)+ "% descuento: "+ total);
        }

        scan.close();

    }
}
