/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countmatches;

import java.util.Scanner;

public class CountMatches {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder aux=new StringBuilder();
        int cont=0;
        
        System.out.print("Cadena: ");
        String c1=sc.nextLine();
        System.out.print("Cadena2: ");
        String c2=sc.nextLine();
        
        for(int i=0;i<c2.length();i++){
            for(int j=0;j<c1.length();j++){
                if(c1.charAt(j)== c2.charAt(i)){
                    cont++;
                    aux.append(" ").append(c1.charAt(j));
                }
            }
        }
        System.out.println(cont+" caracteres estan en las dos cadenas\nLos "+
                cont+" caracteres son los siguientes:\n"+aux);
        
    }
    
}
