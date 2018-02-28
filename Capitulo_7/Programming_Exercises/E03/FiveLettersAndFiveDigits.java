/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivelettersandfivedigits;

import java.util.Scanner;


public class FiveLettersAndFiveDigits {

    public static void main(String[] args) {
        String statement;
        Character caracter;
        Scanner sc=new Scanner(System.in);
        int contL,contD;
        boolean condi=false;
        
        do{
            System.out.print("Ingresar cadena: ");
            statement=sc.nextLine();
            contL=0;
            contD=0;
            
            for(int i=0;i<statement.length();++i){
                caracter=statement.charAt(i);
                if(Character.isDigit(caracter))
                    ++contD;
                else if(Character.isLetter(caracter))
                    ++contL;
            }
            
            if(contD>=5 && contL>=5){
                System.out.println("String válido");
                condi=true;
            }else if (contD<5 && contL>=5){
                System.out.println("\nString inválido hacen falta "+(5-contD)+" digítos");
            }else if (contL<5 && contD>=5){
                System.out.println("\nString inválido  hacen falta "+(5-contL)+" letras");
            }else{
                System.out.println("String inválido hacen falta "+(5-contD)+" digítos y "+(5-contL)+" letras");
            }
            
        }while(!condi);
    }
    
}
