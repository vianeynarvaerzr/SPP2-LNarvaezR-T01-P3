/*//Leticia Vianey Narvaez Reyes A01410432 Ingenieria Industrial y de Sistemas
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.t01.p3;
import java.util.Scanner;
/**
 *
 * @author Vianey_Narváez
 */
public class SPP2LNarvaezRT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Distancia entre dos puntos");
        double x1, x2 = 0, y1, y2, d;
    Scanner teclado = new Scanner (System.in);
    
    System.out.println("Introduzca x1");
    x1 = teclado.nextDouble();
    System.out.println("Introduzca y1");
    y1 = teclado.nextDouble();
    System.out.println("Introduzca x2");
    x2 = teclado.nextDouble();
    System.out.println("Introduzca y2");
    y2 = teclado.nextDouble();
    
    d = Math.sqrt(Math.pow((x1-x2),2)+ Math.pow((y1-y2),2));
    
    System.out.println("La distancia entre los dos puntos es "+d);
    
    }
    
}
