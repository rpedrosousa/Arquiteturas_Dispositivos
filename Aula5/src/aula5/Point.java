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
public class Point {

    private double y;
    private double x;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    Point(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getValueX() {
        return x;
    }

    public double setValueX(double x) {
        this.x = x;
        return x;
    }
    public double getValueY() {
        return y;
    }
    public double setValueY(double y){
        this.y = y;
        return y;
    }



    public double distanceTo(Point other) {
      double distance = Math.sqrt(Math.pow(other.x-this.x,2)+ Math.pow(other.y - this.y,2));
      return distance;
    }

   
}
