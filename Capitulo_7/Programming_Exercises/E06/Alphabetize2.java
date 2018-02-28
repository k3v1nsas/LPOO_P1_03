/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetize2;

import java.util.Scanner;

public class Alphabetize2 {

   public static void main(String[] args) {
        String c1, c2, c3;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Cadena1");
        c1=sc.nextLine();
        System.out.println("Cadena2 ");
        c2=sc.nextLine();
        System.out.println("Cadena3");
        c3=sc.nextLine();
        
        System.out.println("\n\nOrdenadas");
        
        if(verify(c1, c2)&&verify(c1,c3)){
            if(verify(c2,c3))
                System.out.println(c1+" "+c2+"  "+c3);
            else
                System.out.println(c1+" "+c3+" "+c2);
        }else if(verify(c2,c3)){
            if(verify(c3, c1))
                System.out.println(c2+" "+c3+"  "+c1);
            else
                System.out.println(c2+" "+c1+" "+c3);
        }else{
            if(verify(c1,c2))
                System.out.println(c3+" "+c1+"  "+c2);
            else
                System.out.println(c3+" "+c2+" "+c1);
        }
    }
    public static boolean verify(String a, String b){
        a.toLowerCase();
        b.toLowerCase();
        return a.compareTo(b)<=0;
    }
    
}
