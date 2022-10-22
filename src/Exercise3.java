import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el multiplicando: ");//2
        int multiplicando = sc.nextInt();
        System.out.println("Ingrese el multiplicador: ");//5
        int multiplicador = sc.nextInt();
        int resultado = 0;
        for (; multiplicador>0;multiplicador--) {
            resultado+=multiplicando;

        }System.out.println("El resultado de la multiplicacion es : "+ resultado);

        // 2*5 = 2+2+2+2+2

    }
}
