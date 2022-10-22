// Imprimir n números primos
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int f = 1;
        System.out.println("¿Cuantos numeros primos quieres imprimir?: ");
        int contadorPrimos = sc.nextInt();
        while (f<= contadorPrimos) {
        
        for (int i = 1; f<= contadorPrimos; i++) {
            int contador=0;
            for (int j = 1; j <= i; j++) {
                
                int operacion = i%j;
                if(operacion == 0){
                    contador++;
                }
                
            }
            if(contador<=2){ 
                System.out.println(i);
                f++;
            }
        }
        
    }
    }
}


