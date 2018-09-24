/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author Turma A
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Hello World!");
        //---------------------------------------------
        double perimeter = CalcularPerimetro(2, 2);
        System.out.println("\nPerimetro: " + perimeter);
        //---------------------------------------------
        double volume = CalcularVolume(2, 3, 4);
        System.out.println("O volume é : " + volume);
        //---------------------------------------------
        double celsius = CalcularEmCelsius(28);
        System.out.println("O valor do F = 28 em Celsius é: " + celsius);
        //---------------------------------------------
        double segundos = CalcularTempo(1, 20, 42);
        System.out.println("Os segundos é: " + segundos);
        //---------------------------------------------
        int[] arr = {1, 2, 3, 4, 56, 7, 89, 10};
        double maximo = CalcularOMaximo(arr);
        System.out.println("O Maximo é:" + maximo);
        //---------------------------------------------
        double minimo = CalcularOMinimo(arr);
        System.out.println("O Minimo é:" + minimo);
        //---------------------------------------------
        double media = CalcularMedia(arr);
        System.out.println("A Média é:" + media);
        //---------------------------------------------
        Scanner user_input = new Scanner (System.in);
        String first_name;
        System.out.println("Enter first name:");
        first_name = user_input.next();
    }

    private static double CalcularPerimetro(int i, int i0) {
        return (i * 2) + (i0 * 2);
    }

    private static double CalcularVolume(int i, int i0, int i1) {
        return i * i0 * i1;
    }

    private static double CalcularEmCelsius(int i) {
        return ((i - 32) * (5.0 / 9));
    }

    private static double CalcularTempo(float i, float i0, float i1) {
        return i + (60 * i0) + (3600 * i1);
    }

    private static double CalcularOMaximo(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static double CalcularOMinimo(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static double CalcularMedia(int[] arr) {
        float soma = 0;
        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }
        int x = arr.length;
        return soma / x;
    }

}
