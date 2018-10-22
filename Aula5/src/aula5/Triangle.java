/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author Turma A
 */
public class Triangle {

    static boolean trian(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
        a = new Point();
        b = new Point();
        c = new Point();
    }

    public Triangle(Point a, Point b,Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
     public Point getPointA() {
        return a;
    }

    public void setPointA(Point a) {
        this.a = a;
        
    }
    
     public void setPointAB(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public Point getPointB() {
        return b;
    }

    public void setPointB(Point b) {
        this.b = b;
       
    }
    public Point getPointC() {
        return c;
    }

    public void setPointC(Point c) {
        this.c = c;
        
    }
    
    
    
}
