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
        for (int i = 0; i < copia.length; i++) {
            copia[i] += arr[i];
        }
        return copia;
    }

    static boolean contain(int[] array, int number) {
        boolean contai = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                contai = true;
                break;
            } else {
                contai = false;
            }
        }
        return contai;
    }

    static boolean duplicate(int[] array) {
        boolean duplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(i != j){
                    if(array[i] == array[j]){
                        duplicates = true;
                    }
                }
            }                                              
        }
        return duplicates;
    }

    static int index(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }

    static int[] addOf(int[] array, int value) {
        int[] addarray = new int [array.length + 1];
        for (int i = 0; i<array.length;i++){
            addarray[i]=array[i];
        }
        addarray[addarray.length-1] = value;
        return addarray;
    }

    static int[] removeOf(int[] array, int value) {
        if(contain(array,value)!=true){
            return array;
        }
        int count = 0;
        for (int i = 0;i<array.length;i++){
            if(value == array[i]){
                count++;
            }
        }
        int[]result = new int [array.length-count];
        count = 0;
        for(int i = 0;i<result.length;i++){
            while(value==array[count]){
                count++;
            }
            result[i]=array[count];
            count++;
        }
        return result;
    }
}
