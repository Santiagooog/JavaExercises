import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    int num1 = 0, num2 = 1, suma = 1;
    System.out.println("Ingrese el limite de la serie");
    int limite = sc.nextInt();
    System.out.println(num1);
         
      for (int i = 1; i < limite; i++) {

        if((num1+num2+suma) <= limite){
          System.out.println(suma);
             
          suma = num1 + num2;
          num1 = num2;
          num2 = suma;
        }
      }
      sc.close();
    }
    
}
