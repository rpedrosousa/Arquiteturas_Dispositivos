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
public class calculator {

    private double value;

    public calculator() {
        value = 0.0;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double newValue) {
        value = newValue;
    }

    public void clear() {
        value = 0.0;
    }

    public void add(double term) {
        value += term;
    }

    public void minor(double term) {
        value -= term;
    }
    public void divisao(double term) {
        value =  value/ term;
    }
     public void multiplicação(double term) {
        value = value*term;
    }
}
