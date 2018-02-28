/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countspaces2;

import java.util.Scanner;

public class CountSpaces2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cont=0;
        
        System.out.print("Ingresar cadena: ");
        String statement=sc.nextLine();
        for(int i=0;i<statement.length();++i){
            if(statement.charAt(i)==' ')
                ++cont;
        }
        System.out.println("\nEspacios encontrados:\n"+statement+"\nEspacios: "+cont);
    }
}
