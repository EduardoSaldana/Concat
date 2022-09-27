/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenacion;
import java.util.Scanner;
/**
 *
 * @author Alumno Mañana
 */
public class Concatenacion {
    public static Scanner ent = new Scanner (System.in);

   
    public static void main(String[] args) {
      
        System.out.printf("INTRODUCCIÓN DE DATOS: ");
        System.out.println("\n----------------------");
        System.out.printf("\nintroduzca un usuario: ");
	String Nombre =ent.nextLine();
	System.out.printf("introduzca el apellido del usuario: ");
	String Apellido =ent.nextLine();
        System.out.println("Hola, "+Nombre.concat(Apellido));
    }
    
}
