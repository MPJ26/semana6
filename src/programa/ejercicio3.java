package programa;
import java.util.Scanner;
public class ejercicio3 {
    public static void main (String[] args){
        Scanner lectura = new Scanner(System.in);        
        System.out.print("Ingresa un número para contar hacia atrás: ");
        int numero = lectura.nextInt();        
        while (numero >= 0) {
            System.out.println(numero);
            numero--; 
        }
       System.out.println("Fin de la cuenta regresiva");
    }
}

