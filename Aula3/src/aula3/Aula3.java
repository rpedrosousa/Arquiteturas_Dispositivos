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
       
       //-----------------------------------------------------------------------
       // FICHA 3
       // 2. a)
       final int NumberOfLetters = 'z'-'a'+1;
       final char[] allLetters = new char[NumberOfLetters];
       char allLower = CharacterUtilities.lowerLetterSuccessorOf(allLetters,'z');
       System.out.println(allLower);
       // 2. b)
       char predecessor = CharacterUtilities.lowerLetterPredecessorOf('a');
       System.out.println(predecessor);
       // 2. c)
       char stepsSuccess = CharacterUtilities.lowerLetterSuccessorStepsOf('x',4);
       System.out.println(stepsSuccess);
       // 2. d)
       char PrestepsSuccess = CharacterUtilities.lowerLetterPredecessorStepsOf('b',4);
       System.out.println(PrestepsSuccess);
       // 2. e)
       char [] values = {'a','b','r','a','k','a','d','a','b','r','a','-','n','a'};
       int occurrences = CharacterUtilities.occurrencesOfCharacterin(values,'b');
       System.out.println(occurrences);
       // 2. f)
       char [] replace = CharacterUtilities.replaceCharacterIn(values,'b','z');
       System.out.println(replace);
       // 2. g)
       char [] juras = {'-','a','n','a','p','e','t','r','a'};
       char [] concatena = CharacterUtilities.concatenationOf(values,juras);
       System.out.println(concatena);
       // 2. h)
       char [] copy = CharacterUtilities.copyOfPartOf(values,'a','k');
       System.out.println(copy);
       // 3. a)
       String str = "Octavio Josefina";
       String cipher = CaesarCipherDecipherer.cipher(str, 3);
       System.out.println("Cipher: " + cipher);
       // 3. b)
       String decipher = CaesarCipherDecipherer.decipher(cipher,3);
       System.out.println("Decipher: " + decipher);
       
    }
    
    public static void increment(int value){
        value++;        
    }
    
    public static void incrementFirstOf(final int[] values){
        values[0]++;
    }
    
}
