package programa;
import java.util.Scanner;
public class ejercicio1 {
   public static void main (String[] args){
       
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingresa un número para mostrar su tabla de multiplicar: ");
        int numero = lectura.nextInt();
        
        System.out.println("Tabla de multiplicar de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
   } 
}
