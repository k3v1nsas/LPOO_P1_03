/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Integer n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un entero: ");
	n = sc.nextInt();
        if((n%2)==0){
            System.out.println("Numero PAR");
        }else{
            System.out.println("Numero IMPAR");
        }
    }
    
}
