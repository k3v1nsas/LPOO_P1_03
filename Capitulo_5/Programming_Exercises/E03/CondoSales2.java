/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condosales2;

import java.util.Scanner;

public class CondoSales2 {

    public static void main(String[] args) {
        Integer number;
        boolean cond = false;
        int p = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elige un numero:\n1.- Park View\n2.- Glof Course View\n3.- Lake View: ");
	number = sc.nextInt();
        switch (number) {
            case 1:
                cond=true;
                p = 150000;
                System.out.println("Chosen View: Park view \nPrice Of the Condo: $150,000");
                break;
            case 2:
                cond=true;
                p = 170000;
                System.out.println("Chosen View: golf course views \nPrice Of the Condo: $170,000");
                break;
            case 3:
                cond=true;
                p = 210000;
                System.out.println("Chosen View: Lake views \nPrice of The Condo: $210,000");
                break;
            default:
                cond=false;
                System.out.println("Chosen View: Incorrect \nPrice Of the Condo: $0");
                break;        
        }
        
        if(cond){
              System.out.println("Enter Details if Required\n1)Garage\n2)Parking Space\n");
             int extra=sc.nextInt();

             if(extra==1||extra==2){
                  p+=5000;
                  System.out.println("Total Cost = $"+p+" \n");
           }else{
               System.out.println("Total Cost =$"+p+"\n");
           }        
        }
    }
    
}
