/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author Turma A
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = Math.abs(2);
       double pi = Math.PI;
       //-----------------------------------------------------------------------
       char original = 'b';
       int code = (int)original;
       char recovered = (char) code;
       char letter1 = 'c';
       letter1++;
       System.out.println(original);
       System.out.println(code);
       System.out.println(recovered);
       System.out.println(letter1);
       System.out.println('z'-'a'+1);
       
       final int numberOfLetters = 'z'-'a'+1;
       final char[] letters = new char[numberOfLetters];
       
       for(int i = 0;i!=letters.length;i++){
           letters[i] = (char) ('a'+i);
       }
       System.out.println(letters);
       //-----------------------------------------------------------------------
       int z = 7;
       int x = z;
       int c;
       System.out.println(z);
       
       int[] z1 ={1,2,3};
       int[] x1 = z1;
       int[] c1;
       //-----------------------------------------------------------------------
       int number = 5;
       increment(number);
       System.out.println(number);
       //-----------------------------------------------------------------------
       int[] numbers = {1,2,3,4};
       incrementFirstOf(numbers);
       System.out.println(numbers);
    }
    
    public static void increment(int value){
        value++;        
    }
    
    public static void incrementFirstOf(final int[] values){
        values[0]++;
    }
    
}
