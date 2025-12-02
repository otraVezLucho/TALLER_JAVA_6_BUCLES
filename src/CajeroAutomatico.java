import java.util.Scanner;

public class CajeroAutomatico {
    public static void cajero(){

        Scanner scan = new Scanner(System.in);
        double saldo = 1000;
        int opcion;
        double valor;
        do {
            System.out.println("Opciones de cajero: \n1. Consultar Saldo\n2. retirar\n3. depositar\n4. Salir\n ");
            System.out.println("\nElija la opcion que desea realizar: ");
            opcion = scan.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.println("--- Su saldo actual es de: $"+ saldo +" ---");
                }
                case 2 ->{
                    System.out.println("Ingrese el monto a retirar: ");
                    valor = scan.nextDouble();
                    if(valor>saldo){
                        System.out.println("Usted no cuenta con suficiente saldo para retirar la cantidad ingresada");
                    }else {
                        saldo -= valor;
                        System.out.println("Usted ha retirado "+ valor+"\nSu nuevo saldo es de: $"+ saldo);
                    }
                }
                case 3 ->{
                    System.out.println("Cuanto desea depositar: ");
                    valor = scan.nextDouble();
                    if(valor>0){
                        saldo += valor;
                        System.out.println("Su nuevo saldo es: $"+ saldo);
                    }else{
                        System.out.println("ingrese un valor superior a $10");
                    }
                }

            }
        }while (opcion != 4);

    }
}
