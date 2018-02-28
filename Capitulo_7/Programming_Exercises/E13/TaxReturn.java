/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparetax;

import javax.swing.JOptionPane;


public class TaxReturn {
    private String sN;
    private String fN;
    private String lN;
    private String sA;
    private String cd;
    private String est;
    private String zC;
    private Double annualIng;
    private Character Status;
    private Double taxL;
    
    public TaxReturn(String num,String firstName,String lastName,String address,String city,String state,String code,Double income,Character mStatus){
        this.sN=num;
        this.fN=firstName;
        this.lN=lastName;
        this.sA=address;
        this.cd=city;
        this.est=state;
        this.zC=code;
        this.annualIng=income;
        this.Status=mStatus;
        this.taxL=income*calculateTax(income, mStatus);
        
    }
    
    private Double calculateTax(Double income, Character maritalStatus){
        Character.toUpperCase(maritalStatus);
        Double percent=0.0;
        switch(maritalStatus){
            case 'S':
                if(income<=20000)
                    percent=0.15;
                else if(income>=20001 && income<=50000){
                    percent=0.22;
                }else
                    percent=0.30;
                break;
            case 'C':
                if(income<=20000)
                    percent=0.14;
                else if(income>=20001 && income<=50000)
                    percent=0.20;
                else
                    percent=0.28;
                break; 
        }
        return percent;
    }
    
    public void display(){
        JOptionPane.showMessageDialog(null, "Datos de "+lN+" "+fN+
                "\nNumero Social: "+sN+"\nCódigo Zip: "+zC+
                "\nEstado: "+est+"\nCiudad: "+cd+
                "\nDirección: "+sA+"\nEstado Civil: "+Status+
                "\nIngresos Anuales: "+annualIng+"\nImpuestos: "+taxL);
    }
}
