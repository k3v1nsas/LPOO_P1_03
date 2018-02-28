/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import javax.swing.JOptionPane;


public class Palindrome {

    public static void main(String[] args) {
        StringBuilder palindrome=new StringBuilder();
        StringBuilder palindromeCopy=new StringBuilder();
        
        String entry=JOptionPane.showInputDialog(null,"Palindromo:");
        
            for(int i=0;i<entry.length();i++){
                if(Character.isLetterOrDigit(entry.charAt(i)))
                    palindrome.append(entry.charAt(i));
            }
            
            for(int i=entry.length()-1;i>=0;i--){
                if(Character.isLetterOrDigit(entry.charAt(i)))
                    palindromeCopy.append(entry.charAt(i));
            }
        
        String  pal= palindrome.toString();
        String  palC= palindromeCopy.toString();
        
            if(!pal.equalsIgnoreCase(palC))
                JOptionPane.showMessageDialog(null,"NO es un Palindromo");
            else
                JOptionPane.showMessageDialog(null,"SI es un Palindromo");
    }
    
}
