/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countbyanything;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class CountByAnything {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor a contar: ");
        int v = sc.nextInt();
        int cont=0;
        for(int i=0;i<=200;i=i+v){
            System.out.printf(" "+i);
            cont++;
            if(cont%10==0){
                System.out.println();
            }
        }
        System.out.println();
    }
    
}
