import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaEdades=0;
        double promedioEdadMayor=0;
        String nombreProgramaPromMayor = null;
        String nombreProgramaPromMenor = null;
        double promedioEdadMenor = 0;
        double promedioEdadFacultadIngenieria = 0;
        
        int numeroDeProgramas = 3;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Nombre del programa: ");
            String nombrePrograma = sc.next();
            System.out.println("¿Cuántos estudiantes hay en el programa?: ");
            int numeroEstudiantesPrograma = sc.nextInt();
            for (int j = 1; j <= numeroEstudiantesPrograma; j++) {
                System.out.println("¿Cuántos años tienes? : ");
                int edad = sc.nextInt();
                sumaEdades = sumaEdades+ edad;
            }
            double promedioEdad = sumaEdades/numeroEstudiantesPrograma;
            System.out.println(promedioEdad);
            sumaEdades =0;
            System.out.println("El promedio de edad del programa es de: "+ promedioEdad);
            
            if(promedioEdad > promedioEdadMayor){
                promedioEdadMayor = promedioEdad;
                nombreProgramaPromMayor = nombrePrograma;
            }
            
            if(promedioEdadMenor == 0){
                promedioEdadMenor = promedioEdad;
                nombreProgramaPromMenor = nombrePrograma;
            }
            if(promedioEdadMenor > promedioEdad){
                promedioEdadMenor = promedioEdad;
                nombreProgramaPromMenor = nombrePrograma;
            }

            promedioEdadFacultadIngenieria = promedioEdadFacultadIngenieria + promedioEdad;
            promedioEdad=0;
        }
        System.out.println("El programa con el promedio de edad mayor es: " + nombreProgramaPromMayor +" y tuvo un promedio de " +promedioEdadMayor);
        System.out.println("El programa con el promedio de edad menor es: " + nombreProgramaPromMenor + " y tuvo un promedio de "+ promedioEdadMenor);
        System.out.println("El promedio de edad de la facultad de ingenieria es : " + (promedioEdadFacultadIngenieria/numeroDeProgramas));
    }
}
