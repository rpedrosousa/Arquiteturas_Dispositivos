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
            char cipher = CharacterUtilities.lowerLetterSuccessorStepsOf(str.charAt(j), steps);
            ciphered += cipher;            
        }
        return ciphered;
    }

    static String decipher(String cipher, int i) {
        String ciphered = "";
        for (int j = 0; j < cipher.length(); j++) {
            char decipher = CharacterUtilities.lowerLetterPredecessorStepsOf(cipher.charAt(j), i);
            ciphered += decipher;            
        }
        return ciphered;
    }
    
}
