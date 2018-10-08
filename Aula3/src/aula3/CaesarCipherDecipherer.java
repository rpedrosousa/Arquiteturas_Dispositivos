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
public class CaesarCipherDecipherer {

    static String cipher(String str, int steps) {
        String ciphered = "";
        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            char cipher = CharacterUtilities.lowerLetterSuccessorStepsOf(c, steps);
            if(c != ' '){
                ciphered += cipher;
            }else{
                ciphered += " ";
            }
        }
        return ciphered;
    }

    static String decipher(String cipher, int i) {
        String ciphered = "";
        for (int j = 0; j < cipher.length(); j++) {
            char c = cipher.charAt(j);
            char decipher = CharacterUtilities.lowerLetterPredecessorStepsOf(c, i);
            if(c != ' '){
                ciphered += decipher; 
            }else{
                ciphered += " ";
            }     
        }
        return ciphered;
    }
    
}
