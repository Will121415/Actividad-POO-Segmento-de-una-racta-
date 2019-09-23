/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author UNICESAR-401
 */
public class Segmento {
    
    private Punto A,B;
    
    public Segmento(Punto A, Punto B)
    {
        this.A = A;
        this.B = B;
    }

    public Segmento(int x, int y, int x2, int y2)
    {
        this(new Punto(x,y),new Punto(x2,y2));
    }
    
    

    public Punto getA() {
        return A;
    }

    public void setA(Punto A) {
        this.A = A;
    }

    public Punto getB() {
        return B;
    }

    public void setB(Punto B) {
        this.B = B;
    }
    
   
    public double tamSegmento()
    {
        int dx = this.B.getX() - this.A.getX();
        int dy = this.B.getY() - this.A.getY();
        
        return Math.sqrt((Math.pow(dx, 2)) + (Math.pow(dy, 2)));
    }
    
}
