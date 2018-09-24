/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Turma A
 */
public class NumericalUtilities {

    /**
     * vlvlvlcslfkslfjskljflsfjsjlfljfs
     *
     * @param base
     * @param exponent
     * @return
     */
    static double powerOf(int base, int exponent) {
        double power = 1;
        for (int z = 0; z < exponent; z++) {
            power *= base;
        }
        return power;
    }

    /**
     *
     * @param value
     * @return
     */
    static double sumOfNaturalNumbersUpTo(int value) {
        double soma = 0;
        for (int i = 1; i <= value; i++) {
            soma += i;
        }
        return soma;
    }

    static double sumOfNaturalNumbersBetween(int first, int second) {
        double soma = 0;
        for (int value = first; value <= second; value++) {
            soma += value;
        }
        return soma;
    }

    static double sumOfEvenNumbersBetween(int primeiro, int segundo) {
        double soma = 0;
        for (int valor = primeiro; valor <= segundo; valor++) {
            if (valor % 2 == 0) {
                soma += valor;
            }
        }
        return soma;

    }

    static double numberOfDivisorsOf(int value) {
        double soma = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                soma += 1;
            }
        }
        return soma;
    }

    static boolean isPrime(int value) {
        if (numberOfDivisorsOf(value) == 2) {
            return true;
        } else {
            return false;
        }

    }
}
