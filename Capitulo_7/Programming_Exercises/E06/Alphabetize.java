/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetize;

import java.util.Scanner;

public class Alphabetize {

   public static void main(String[] args) {
        String c1, c2, c3;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Cadena1");
        c1=sc.nextLine();
        System.out.println("Cadena2 ");
        c2=sc.nextLine();
        System.out.println("Cadena3");
        c3=sc.nextLine();
        
        if(!verify(c1,c2) || !verify(c2, c3))
            System.out.println("No estan en orden");
        else
            System.out.println("\nEstan en orden alfabetico");
    }
    public static boolean verify(String a, String b){
	a.toLowerCase();
        b.toLowerCase();
        
        return a.compareTo(b)<=0;
    }
    
}
