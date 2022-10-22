//Imprimir nota mayor y quien la obtuvo
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de estudiantes: ");
        int numeroEstudiantes = sc.nextInt();
        System.out.println("¿Cuantas notas vas a calificar?: ");
        int numeroNotas = sc.nextInt();
        double promedio = 0, promedioMayor = 0;
        String nombrePromedioMayor = null;

        for (int i = 1; i <= numeroEstudiantes; i++) {
            System.out.println("¿Cómo te llamas?: ");
            String name= sc.next();
            for (int j = 1 ; j <= numeroNotas; j++) {
                System.out.println("Ingrese la nota: ");
                promedio += sc.nextDouble()/numeroNotas;
            }
            System.out.println("Tu nombre es " + name + " y tuviste un promedio de "+ promedio);
            if(promedio > promedioMayor){
                promedioMayor = promedio;
                nombrePromedioMayor = name;
            }
            
            promedio=0;
            
        }
        System.out.println("Quien obtuvo mayor promedio fué : " + nombrePromedioMayor + " y obtuvo un promedio de : "+ promedioMayor);

    }
}
