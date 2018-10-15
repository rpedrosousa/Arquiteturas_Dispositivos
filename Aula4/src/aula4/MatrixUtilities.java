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
public class MatrixUtilities {

    static void show(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%4d", matrix[i][j]);
                    
                }
                System.out.println();
        }
        return;
    }

    static boolean isMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i].length != matrix[j].length){
                    return false;
                }
            }
        }
        return true;
        
    }

    static boolean isIdentify(int[][] matrix) {
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] != 1){
                 matrix = false;
                 
                }else{
                    if(matrix[])
                }
            }
        }
        return false;
    }
}
