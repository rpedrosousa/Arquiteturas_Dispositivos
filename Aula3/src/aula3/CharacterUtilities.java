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
public class CharacterUtilities {

    static char lowerLetterSuccessorOf(char[] allLetters, char c) {
        char value = 'a';
        for(int i = 0;i!=allLetters.length;i++){
            allLetters[i] = (char) ('a'+i);
            if(allLetters[i] == c){
               if(allLetters[i] == 'z'){
                   value = (char) ('a');
                   break;
               }
               value = (char) ('a'+(i+1));
            }
        }
       return value;
    }

    static char lowerLetterPredecessorOf(char c) {
        char value = (char) (c-1);
        if(c == 'a'){
            value = (char) ('z');
        }
        return value;
    }

    static char lowerLetterSuccessorStepsOf(char c, int i) {        
        for(int a = 0;a<i;a++){
           if(c == 'z'){
               c = 'a';
           }else{
               c++;
           }
        }
        return c;
    }

    static char lowerLetterPredecessorStepsOf(char c, int i) {
        for(int a = 0;a<i;a++){
           if(c == 'a'){
               c = 'z';
           }else{
               c--;
           }
        }
        return c;
    }

    static int occurrencesOfCharacterin(char[] values, char c) {
        int contador = 0;
        for(int i = 0; i<values.length;i++){
            if(values[i] == c){
                contador+=1;
            }
        }
        return contador;
    }

    static char[] replaceCharacterIn(char[] values, char c, char c0) {
        char [] substitui = new char [values.length];
        for(int i = 0;i<values.length;i++){
            if(values[i] == c){
                substitui[i] = c0;
            }else{
                substitui[i] = values[i];
            }
        }
        return substitui;
    }

    static char[] concatenationOf(char[] values, char[] juras) {
        char [] conjura = new char [values.length+juras.length];
        for(int i = 0;i<conjura.length;i++){
            if(i<values.length){
                conjura[i] = values[i];
            }
            else{
                conjura[i] = juras[i-values.length];
            }
        }
        return conjura;
    }

    static char[] copyOfPartOf(char[] values, char c, char c0) {
        char[] copia = new char[values.length];
        for(int i = 0;i<values.length;i++){
            copia[i] = values[i];
            if(values[i]==c0){
                return copia;
            }
        }
        return copia;
    }
}
