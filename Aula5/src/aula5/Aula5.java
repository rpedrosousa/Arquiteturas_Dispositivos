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
public class Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        calculator c = new calculator();
//        c.setValue(5.0);
//        c.add(5);
//        c.minor(3);
//        c.divisao(2);
//        c.multiplicação(3);
//        System.out.println(c.getValue());

        Point value = new Point();

        value.setValueX(1.2);
        value.setValueY(3.4);
        
        System.out.println(value.getValueX());
        System.out.println(value.getValueY());

        value.setValueX(2);
        value.setValueY(3);
        System.out.println(value.getValueX() + " e " + value.getValueY());

        System.out.println(value.distanceTo(new Point(2, 3)));
        
        Triangle tri = new Triangle();
        
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        
        
    }

}
