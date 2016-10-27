/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author guillem
 */
public class Projecte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        char caracter = 1;
        String Marca = null;
        int Model = 0;
        boolean Any = false;
        double Preu = 0.0;

        while (caracter > 0) {
            System.out.println("Menú");
            System.out.println("0. Sortir del programa");
            System.out.println("1. Afegeix moto.");
            System.out.println("2. Esborra moto.");
            System.out.println("3. Modifica motos");
            System.out.println("4. Llista motos.");
            caracter = ent.next().charAt(0);
            switch (caracter) {
                case '0':
                    System.out.println("Sortint");
                    break;
                case '1':
                    System.out.println("Afegeix moto");
                    break;
                case '2':
                    System.out.println("Que moto desitja borrar?");
                    break;
                case '3':
                    System.out.println("Que moto desitja modificar?");
                    break;
                case '4':
                    System.out.println("Llistat de les motos");
                    break;
                default:
                    System.out.println("Caracter no valid, tornau a intentar.");
            }

        }

        // TODO code application logic here
    }

}
