package programa;
import java.util.Scanner;
public class ejercicio2 {
     public static void main (String[] args){
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = lectura.nextInt();
        int contador = 0;
        
        // Contamos los dígitos
        if (numero == 0) {
            contador = 1; // Si el número es 0, hay un dígito
        } else {
            while (numero > 0) {
                numero /= 10; // Dividimos el número entre 10
                contador++; // Incrementamos el contador
            }
        }
  
        System.out.println("La cantidad de dígitos es: " + contador);
    }
}