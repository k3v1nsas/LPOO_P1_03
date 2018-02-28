/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumintegersinstring;

import javax.swing.JOptionPane;



public class SumIntegersInString {

   
    public static void main(String[] args) {
        
        String num;
        Integer suma=0,entero;
        int posIni=0;
        
        num=JOptionPane.showInputDialog(null,"Ingrese enteros separados por un espacio");
        for(int i=0;i<num.length();i++){
            if(Character.isWhitespace(num.charAt(i))){
                entero=Integer.parseInt(num.substring(posIni, i));
                suma+=entero;
                posIni=i+1;
            }
            if(i==num.length()-1&&Character.isDigit(num.charAt(i))){
                if(i-posIni>0)
                    entero=Integer.parseInt(num.substring(posIni, i+1));
                else
                    entero=Integer.valueOf(num.substring(i));
                suma+=entero;
            }
        }
        String mostrar = num.replace(' ', '+');
        JOptionPane.showMessageDialog(null,"El resultado de sumar "+mostrar+" es "+suma);
    }
    
}
