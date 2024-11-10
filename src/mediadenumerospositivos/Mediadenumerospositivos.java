/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediadenumerospositivos;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class Mediadenumerospositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int suma = 0;      
    int contador = 0;   
    System.out.println("Ingresar números positivos: ");
    while (true){
    System.out.print("Ingresar un número: ");
    int numero = scanner.nextInt();
    if (numero < 0){
    break;
    }
    suma += numero;
    contador++;
    }       
    if (contador > 0) {
    double media = (double) suma / contador; 
    System.out.println("La media de los números ingresados es: " + media);
    }else{
    System.out.println("No se ingresaron números positivos.");
    }
  }
}
