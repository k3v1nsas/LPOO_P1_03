/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarship;

import java.util.Scanner;

public class Scholarship {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Promedio de calificaciones de la escuela:");
	Double prom = sc.nextDouble();
        System.out.println("Numero de actividades extracurriculares");
	Integer actEx = sc.nextInt();
        System.out.println("Numero de actividades de servicio");
	Integer servAct = sc.nextInt();
        
        if((prom>=3.8) && (actEx>=1) && (servAct>=1)){
            System.out.println("Candidato a jefe");
        }else if((prom>=3.4 && prom<=3.8) && (actEx>=3) && (servAct>=3)){
            System.out.println("Candidato a jefe");
        }else if((prom>=3.0 && prom<=3.4) && (actEx>=2) && (servAct>=3)){
            System.out.println("Candidato a jefe");
        }else{
            System.out.println("Suerte para la proxima");
        }
    }
    
}
