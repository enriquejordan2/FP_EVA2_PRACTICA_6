/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica_6;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_PRACTICA_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner captu = new Scanner(System.in);
         System.out.print("Introduce la altura de la pirámide: ");
        int altura = captu.nextInt();

        // Parte ascendente
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios en blanco
            for (int j = i; j < altura; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }

        // Parte descendente
        for (int i = altura - 1; i > 0; i--) {
            // Imprimir espacios en blanco
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }

        captu.close();
        
    }
    
}
