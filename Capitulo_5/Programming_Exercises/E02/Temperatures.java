/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatures;

import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {
        Integer tH, tL;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Alta temperatura °C: ");
	tH = sc.nextInt();
        System.out.println("Baja temperatura °C: ");
	tL = sc.nextInt();
        
        
        if(tH>=90){
            System.out.println("Calor Peligroso");
        }
        if(tL<32){
             System.out.println("Frio peligroso");
        }
        if((tH-tL)>40){
             System.out.println("Gran oscilación de temperatura.");
        }
    }
}
