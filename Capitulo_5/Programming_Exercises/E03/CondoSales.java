/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condosales;

import java.util.Scanner;

public class CondoSales {

    public static void main(String[] args) {
        Integer number;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elige un numero:\n1.- Park View\n2.- Glof Course View\n3.- Lake View: ");
	number = sc.nextInt();
        switch(number){
            case 1:
                System.out.println("Chosen View: Park view \nPrice Of the Condo: $150,000");
                break;
            case 2:
                System.out.println("Chosen View: golf course views \nPrice Of the Condo: $170,000");
                break;
            case 3:
                System.out.println("Chosen View: Lake views \nPrice of The Condo: $210,000");
                break;
            default:
                System.out.println("Chosen View: Incorrect \nPrice Of the Condo: $0");
                break;
        }
    } 
}
