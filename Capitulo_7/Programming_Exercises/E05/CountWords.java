/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countwords;

import java.util.Scanner;


public class CountWords {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        
        System.out.print("Cadena: ");
        String c=sc.nextLine();
        c=cleanWord(c);
        
        for(int i=0;i<c.length();i++){
            if(Character.isWhitespace(c.charAt(i)))
                 cont++;
        }
        
        System.out.println("\n\nPalabras encontradas: "+(cont+1));
        
    }
   
   
    private static String cleanWord(String word) {
        word = word.replace(",", ""); // ,
	word = word.replace(".", ""); // .
        word = word.replace(":", ""); // :
	word = word.replace("(", ""); // (
        word = word.replace(")", ""); // )
	word = word.replace("[", ""); // [
        word = word.replace("]", ""); // ]
	word = word.replace("-", ""); // -

        return word;
    }
}
