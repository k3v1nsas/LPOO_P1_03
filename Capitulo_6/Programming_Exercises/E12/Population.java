/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package population;

/**
 *
 * @author Rafael
 */
public class Population {

    
    public static void main(String[] args) {
        double mexico = 114; 
        double usa = 312; 
        double mexInc = .0101; 
        double usaDec = .0015; 
        int c=0;
        while (usa>mexico){ 
            System.out.println("Poblacion de MEX: " +(int) mexico + "millones"); 
            System.out.println("Poblacion de USA: " + (int)usa + "millones\n"); 
            mexico+=mexico*mexInc; 
            usa-=usa*usaDec; 
            c++;
        } 
        System.out.println("El proceso abarca: "+c+" anios");
    }
    
}
