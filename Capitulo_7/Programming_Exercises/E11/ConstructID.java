/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructid;

import javax.swing.JOptionPane;


public class ConstructID {


    public static void main(String[] args) {
        StringBuilder id=new StringBuilder();
        char c;
        
        String name=JOptionPane.showInputDialog(null,"Nombre completo");
        String direccion=JOptionPane.showInputDialog(null,"Ingresar dirección \nNumero y nombre de la calle");
        
        for(int i=0;i<name.length();i++){
            c=name.charAt(i);
            if(i==0){
                c=Character.toUpperCase(c);
                id.append(c);
            }else{
                if(name.charAt(i)==' '){
                    ++i;
                    c=name.charAt(i);
                    c=Character.toUpperCase(c);
                    id.append(c);
                }
            }
        }
        for(int i=0;i<direccion.length();i++){
            if(!Character.isWhitespace(direccion.charAt(i)) && Character.isDigit(direccion.charAt(i))){
                c=direccion.charAt(i);
                id.append(c);
            }
        }
        JOptionPane.showMessageDialog(null,name+" con direccion en "+direccion+" le corresponde el ID "+id);
    }
    
}
