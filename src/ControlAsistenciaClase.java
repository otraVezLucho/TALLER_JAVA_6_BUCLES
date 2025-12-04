import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlAsistenciaClase {

    public static void asistencia(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuantos estudiantes son en total?: ");
        int totalEstudiantes = scan.nextInt();
        scan.nextLine();
        int contadorPresente = 0;
        int contadorNoPresente =0;
        int contador = 0;
        System.out.println("ingrese el nombre de los estudiantes");
        while (contador < totalEstudiantes){
            contador++;
            System.out.println("\nNombre de estudiante: ");
            String nombre = scan.nextLine();
            System.out.println("Esta presente: si/no ");
            String presente = scan.nextLine();
            if(presente.equals("si")){
                contadorPresente++;
                System.out.println("Estudiante " + nombre + " " + presente + " esta presente");
            }else if(presente.equals("no")){
                contadorNoPresente++;
                System.out.println("Estudiante " + nombre +" "+ presente+" esta presente");
            }else{
                System.out.println("Valor ingresado no valido");
                System.out.println("No se va a tener en cuenta en la lista");
            }

        }
        System.out.println("\nEstudiantes faltantes: " + contadorNoPresente);
        System.out.println("Estudiantes presentes: " + contadorPresente);
    }
}
