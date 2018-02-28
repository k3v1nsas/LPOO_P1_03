/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

import javax.swing.JOptionPane;

public class Password {

    
    public static void main(String[] args) {
        String psw,passwordAgain;
        int cL=0, cD=0, check;
        
        do{
            psw=JOptionPane.showInputDialog(null,"Contraseña");
            for(int i=0;i<psw.length();i++){
                if(Character.isDigit(psw.charAt(i)))
                    cD++;
                if(Character.isLetter(psw.charAt(i)))
                    cL++;
            }
            if(cD>0&&cL>0&&psw.length()<=10&&psw.length()>=6)
                break;
            else
                check=JOptionPane.showConfirmDialog(null,
                        "La contraseña debe tener al menos\n-1 dígito\n-1 letra\n-6 caracteres\n-NO "
                                + "mayor a 10 caracteres","Error",
                        JOptionPane.WARNING_MESSAGE);
        }while(check==0);
        do{
            passwordAgain=JOptionPane.showInputDialog(null,"Confirmar contraseña");
            if(psw.equals(passwordAgain)){
                JOptionPane.showMessageDialog(null,"Felicidades, la contraseña coincide");
                break;
            }
            else
                check=JOptionPane.showConfirmDialog(null,
                        "La contraseña no coincide","Error",
                        JOptionPane.WARNING_MESSAGE);
        }while(check==0);
    }
    
}
