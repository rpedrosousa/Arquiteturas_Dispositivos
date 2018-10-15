/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Turma A
 */
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] gradesPerCourse = {
            {14,16},
            {12,18,20}
        };
        int numberOfGrades = 0;
        double sumOfGrades = 0.0;
        for (int course = 0; course != gradesPerCourse.length; course++) {
            for (int i = 0; i != gradesPerCourse[course].length; i++) {
                sumOfGrades += gradesPerCourse[course][i];
                numberOfGrades++;
            }
            
        }
        double averageOfGrades = sumOfGrades / numberOfGrades;
        System.out.println(averageOfGrades);
        
    final int[] studentNumbers= {20032,30312,25342,31432};
    final String[] courseAcronyms = {"AD","WEB-FE","WEB-BE"};
    final int[][] studentGrades = {
        {15,18,17},
        {18,10,11},
        {12,15,18},
        {14,19,11}
    };
        for (int i = 0; i != studentNumbers.length; i++) {
            
            int soma = 0;
            System.out.println("O numero do aluno "+i+" é : "+studentNumbers[i]);
            for(int j=0; j !=courseAcronyms.length; j++ ){     
                int[] Grades = studentGrades[i];
                soma += Grades[j];
                System.out.println("\t" + courseAcronyms[j] + ": " + studentGrades[i][j]);                                                
            }
            System.out.println("A media  é " + soma/courseAcronyms.length);
        }
        
        
        int[][] matrix= {{1,0,0},{0,1,0},{0,0,1}}; 
        MatrixUtilities.show(matrix);
        //-----------------------------------------------------------
        
        boolean isMatrix = MatrixUtilities.isMatrix(matrix);
        System.out.println((isMatrix));
        
        boolean isIdentify = MatrixUtilities.isIdentify(matrix);
        System.out.println(isIdentify);
                
    }
    
    
    
}
