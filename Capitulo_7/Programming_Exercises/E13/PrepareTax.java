/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparetax;

import javax.swing.JOptionPane;

public class PrepareTax {

    public static void main(String[] args) {
        String number, zip,statusMarital, incomeS;
        Character mStatus;
        Double income;
        boolean condi=true;
        
        String name = JOptionPane.showInputDialog(null,"Nombre", JOptionPane.INPUT_VALUE_PROPERTY);
        String apellido = JOptionPane.showInputDialog(null,"Apellido", JOptionPane.INPUT_VALUE_PROPERTY);
        String state = JOptionPane.showInputDialog(null,"Estado", JOptionPane.INPUT_VALUE_PROPERTY);
        String cd = JOptionPane.showInputDialog(null,"Ciudad", JOptionPane.INPUT_VALUE_PROPERTY);
        String address = JOptionPane.showInputDialog(null,"Dirección", JOptionPane.INPUT_VALUE_PROPERTY);
        
        do{ 
            number = JOptionPane.showInputDialog(null,"Numero de Seguro Social", JOptionPane.INPUT_VALUE_PROPERTY);
            for(int i=0;i<number.length();i++){
                if(i!=3||i!=6)
                    condi = !Character.isDigit(number.charAt(i));
                if(i==3 || i==6)
                    condi = number.charAt(i)!='-';
            }
            if(11!=number.length()) 
                condi=true;
            if(condi)
                JOptionPane.showMessageDialog(null,"El numero de Seguro Social es incorrecto\nEl "
                        + "formato debe ser 999-99-9999");
        }while(condi);
        
        condi=true;
        
        do{
            zip = JOptionPane.showInputDialog(null,"Codigo Zip", JOptionPane.INPUT_VALUE_PROPERTY);
            for(int i=0;i<zip.length();i++){
                if(zip.length()!=5)
                    break;
                condi= !Character.isDigit(zip.charAt(i));
                if(condi)
                    break;
            }
            if(condi)
                JOptionPane.showMessageDialog(null, "El codigo zip debe ser de 5 Digitos");
        }while(condi);
        
        
        do{
            statusMarital=JOptionPane.showInputDialog(null,"Estado Civil", JOptionPane.INPUT_VALUE_PROPERTY);
            mStatus=statusMarital.charAt(0);
            condi= mStatus == 'S'|| mStatus == 's' || mStatus == 'C' || mStatus == 'c';
            if(!condi)
                 JOptionPane.showMessageDialog(null,"Los valores correctos para estado civil son\n"
                         + "- 'S' 's' (Soltero)\n- 'C' 'c' (Casado)");
        }while(!condi);
        
        
        
        do{
            incomeS=JOptionPane.showInputDialog(null,"Ingresos Anuales", JOptionPane.INPUT_VALUE_PROPERTY);
            income=Double.parseDouble(incomeS);
            if(income>0.0)
                break;
            else{
                JOptionPane.showMessageDialog(null, "No se aceptan Ingresos negativos");
                condi=true;
            }
        }while(condi);
        
        
        TaxReturn fin=new TaxReturn(number,name,apellido,address,cd,state,zip,income,mStatus);
        fin.display();
    }
    
}
