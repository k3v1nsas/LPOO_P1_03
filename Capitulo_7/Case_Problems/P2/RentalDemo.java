/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import java.util.Scanner;


public class RentalDemo {
    private static String ContNum1;
    private static int min1;
    private static String phoneNumber1;
    private static String ContNum2;
    private static int min2;
    private static String phoneNumber2;
    private static String ContNum3;
    private static int min3;
    private static String phoneNumber3;
    
    public static void main(String[] args){
        Rental r1 = new Rental();
        Rental r2 = new Rental();
        Rental r3 = new Rental();
        
        Scanner in = new Scanner(System.in);
        
        samysMotto();
        
        System.out.println("Numero contrato1");
        ContNum1=in.nextLine();
        r1.setContractNumber(ContNum1);
        System.out.println("Duracion (minutos): ");
        min1=r1.okMinutes();
        r1.setMinutes(min1);
        System.out.println("Numero de contacto: ");
        phoneNumber1=in.nextLine();
        r1.setPhoneNumber(phoneNumber1);
        r1.display(min1);
        
        
        System.out.println("\n\nNumero contrato2");
        ContNum2=in.nextLine();
        r2.setContractNumber(ContNum2);
        System.out.println("Duracion (minutos): ");
        min2=r2.okMinutes();
        r2.setMinutes(min2);
        System.out.println("Numero de contacto: ");
        phoneNumber2=in.nextLine();
        r2.setPhoneNumber(phoneNumber2);
        r2.display(min2);
        
        
        System.out.println("\n\nNumero contrato3");
        ContNum3=in.nextLine();
        r3.setContractNumber(ContNum3);
        System.out.println("Duracion (minutos): ");
        min3=r3.okMinutes();
        r3.setMinutes(min3);
        System.out.println("Numero de contacto: ");
        phoneNumber3=in.nextLine();
        r3.setPhoneNumber(phoneNumber3);
        r3.display(min3);
         
        System.out.println(); 
        System.out.println("COMPARACION 1 Y 2");
        compare(r1, r2);
        System.out.println();
        System.out.println("COMPARACION 2 Y 3");
        compare(r2, r3);
        System.out.println();
        System.out.println("COMPARACION 1 Y 3");
        compare(r1, r3);
    }
    
    public static void compare(Rental x, Rental y){
        if(x.getMinutes()==y.getMinutes()){
            System.out.println("\nLos tiemops de renta son iguales de "+
                    x.getContractNumber()+ " y "+y.getContractNumber()+
                    " y la cantidad de minutos es "+ x.getMinutes());
        }else if(x.getMinutes()>y.getMinutes()){
            System.out.println("El mayor tiempo es"+ x.getContractNumber()+
                    "\n  de duracion "+ x.getMinutes() +
                    " \n horas :"+ x.getMinutes()/60+" \nminutos "+
                    x.getMinutes()%60);
        }else {
            System.out.println("El mayor tiempo es"+ y.getContractNumber()+
                    " \n de duracion "+ y.getMinutes()+ 
                    " \n horas :"+ y.getMinutes()/60+" \nminutos "+y.getMinutes()%60);
        }
    }
    public static void samysMotto() {
            System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n"+
			   "Ss  Sammy's makes it fun in the sun   Ss\n"+
			    "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
	}
}
