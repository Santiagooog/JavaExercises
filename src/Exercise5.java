import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = null; 
        double promedioFacultad = 0;
        double promedioUniversidad = 0;
        int numeroFacultades = 3;
        
        for (int i = 1; i <= numeroFacultades ; i++) {
            System.out.println("¿Cuánto es el valor base de la matricula? : ");
            double valorBase = sc.nextDouble();
            double valorInicial = valorBase;
            System.out.println("¿Cuantos estudiantes hay en la facultad?");
            int numeroEstudiantes = sc.nextInt();
            for (int j = 1; j <= numeroEstudiantes; j++) {
                System.out.println("Ingresa tu nombre: ");
                nombre = sc.next();
                System.out.println("¿Que estrato eres?");
                int estrato = sc.nextInt();
                if(estrato <= 3){
                    double subsidio = valorBase - (valorBase*0.1);
                    valorBase = subsidio;    
                }

                System.out.println("Hola "+ nombre + " el valor de tu matricula es "+valorBase);
                promedioFacultad = valorBase+promedioFacultad;
                valorBase = valorInicial;
                
                
            }
            promedioFacultad = promedioFacultad / numeroEstudiantes;
            System.out.println("El promedio de la facultad es "+ promedioFacultad);
            promedioUniversidad = promedioUniversidad + promedioFacultad;
            System.out.println(promedioUniversidad);
            promedioFacultad = 0;
 
        }
        System.out.println("El promedio de la universidad es "+ (promedioUniversidad/numeroFacultades));
        sc.close();

        
    }
}
