import java.util.Random;

import static java.lang.Integer.parseInt;
import static java.lang.Math.random;

public class GeneradorContrasenias {
    public static String generador(){
        String clave = "";
        String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!#$%&/()=?¡¿'|-_*+}{][`^";
        int limiteCaracteres = 11;
        Random random = new Random();

        System.out.println(abc.length());

        for(int i =0;i<limiteCaracteres;i++){
            int guardarCaracter = random.nextInt(abc.length());
            clave = clave.concat(String.valueOf(abc.charAt(guardarCaracter)));
        }
        System.out.println(clave);
        return clave;
    }
}
