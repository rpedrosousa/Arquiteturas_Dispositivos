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
public class ArrayUtilities {

    static String toString(int[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                str += array[i];
            } else if (i < array.length) {
                str += array[i] + ",";
            }
        }
        return str;
    }

    static int maximumOf(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int minimumOf(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }
    /**
     * 
     * @param arr
     * @return 
     */
    static int[] copyOf(int[] arr) {
       int[] copia = new int[arr.length];
       for(int i = 0; i<copia.length; i++){
           copia[i]+=arr[i];
       }
       return copia;
    }
}


