/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffe;

import java.util.Scanner;

public class Coffe {

    public static void main(String[] args) {
        Integer opcion=1;
        double total=0; 
        Scanner sc = new Scanner(System.in);
        
        while(opcion!=0){
            System.out.println("Choose an opcion:\n1.- American $1.99\n2.- Expresso $2.50\n3.- Latte $2.15\n0.- Exit");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    total+=1.99;
                    break;
                case 2:
                    total+=2.50;
                    break;
                case 3:
                    total+=2.15;
                    break;
                default:
                    break;
            }
            
        }
        System.out.println("The total is $"+(float)total);
    }
    
}
