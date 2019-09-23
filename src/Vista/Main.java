/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.*;
/**
 *
 * @author UNICESAR-401
 */
public class Main {
    
    public static void main(String[] args) {
        
        // agregacion
        /*
          Punto A = new Punto();
          Punto B = new Punto(8,6);
    
        // Composicion
        */
        Segmento AB = new Segmento(0,0,6,8);
        
        
        System.out.printf("Distancia(A,B): %.2f%n",AB.tamSegmento());
    
    }
    
}
