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
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double x = NumericalUtilities.powerOf(2, 3);
        System.out.println("The PowerOf is:" + x);
        //---------------------------------------------------
        double sum = NumericalUtilities.sumOfNaturalNumbersUpTo(3);
        System.out.println("O somatorio de todos os numeros naturais até 15 é: " + sum);
        //---------------------------------------------------
        double sumb = NumericalUtilities.sumOfNaturalNumbersBetween(2,7);
        System.out.println("O Somatorio de todos os valores entre eles: " + sumb);
        //---------------------------------------------------
        double sume =  NumericalUtilities.sumOfEvenNumbersBetween(2,7);
        System.out.println("O Somatorio de todos os valores pares entre eles: " + sume);
        //---------------------------------------------------
        double divi =  NumericalUtilities.numberOfDivisorsOf(12);
        System.out.println("Os Divisores de todos os valores: " + divi);
        //---------------------------------------------------
        boolean prime =  NumericalUtilities.isPrime(7);
        System.out.println("Os é Numero Primo: " + prime);
        //---------------------------------------------------
        
        int[] array = {1,2,3,4,5,5,7};
        String str = ArrayUtilities.toString(array);
        System.out.println("Array é: " + str);
        //---------------------------------------------------
        int[] arr = {1,2,3,4,5,6,7};
        int max = ArrayUtilities.maximumOf(arr);
        System.out.println("O maximo do array é: " + max);
        //---------------------------------------------------
        int min = ArrayUtilities.minimumOf(arr);
        System.out.println("O minimo do array é: " + min);
        //---------------------------------------------------
        String copy = ArrayUtilities.toString(ArrayUtilities.copyOf(arr));
        System.out.println("A Copia do array é: " + copy);
        //---------------------------------------------------
        //3.E
        boolean existe = ArrayUtilities.contain(array,4);
        System.out.println("Se o valor existe? "+ existe);
        
        
        boolean duplicate = ArrayUtilities.duplicate(array);
        System.out.println("O valor é duplicado? "+ duplicate);
        
        int indexOf = ArrayUtilities.index(array, 7);
        System.out.println("index of " + indexOf);
        
        int[] add= ArrayUtilities.addOf(array,2);
        System.out.println("New array:" + ArrayUtilities.toString(add));
        
        int[] remove = ArrayUtilities.removeOf(array,7);
        System.out.println("New array:" + ArrayUtilities.toString(remove));
               
        
    }

}
