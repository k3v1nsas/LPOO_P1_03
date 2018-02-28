/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay;

import java.util.Scanner;

public class Pay {

    public static void main(String[] args) {
        int level,  pay = 0, h, eh = 0;
	Scanner sc = new Scanner(System.in);
        
        System.out.println("Escoja su nivel: 1, 2, 3.");
	level = sc.nextInt();        	
        switch (level) {
            case 1:
                pay = 17;
		break;
            case 2:
		pay = 20;
                break;
            case 3:
		pay = 22;
                break;
            default:
		System.out.println("Invalido");
        }
        
        if (level >=1 && level <=3) {
            System.out.println("Horas trabajadas: ");
            h = sc.nextInt();
            if (h > 40) {
                eh = h - 40;
                h = 40;
            }
            
            double rpay = h * pay;
            double opay = eh * pay * 1.5;
            Integer  tH = h + eh;
            double totalPay = rpay + opay;

            final double medico = 32.5;
            final int dental = 20;
            final int longTermD = 10;
            double retP = totalPay * .03;
            double Deductions = 0;
            int opcion;
            int numSelections = 0;
            
            if (level == 2 || level == 3) {
                do {
                    System.out.println("Opcion 1) Seguro Medico\n 2) Seguro dental\n 3) Seguro por discapacidad\n 0.- Exit");
                    opcion = sc.nextInt();
                    numSelections++;
                    switch (opcion) {
                        case 1:
                            Deductions += medico;
                            System.out.println("Tienes seguro medico.");
                            break;
                        case 2:
                            Deductions += dental;
                            System.out.println("Tienes seguro dental.");
                            break;
                        case 3:
                            Deductions += longTermD;
                            System.out.println("Tienes seguro por discapacidad.");
                            break;
                        default:
                            opcion =0;
                            break;
                    }} while (opcion != 0 && numSelections < 3);
            }
            
            if (level == 3) {
                System.out.println("¿Quieres participar en el retiro? 1) Yes 2) No");
		int retiro = sc.nextInt();
                if (retiro == 1) {
                    Deductions += retP;
                    System.out.println("Participaste en el retiro.");
                } else {
                    System.out.println("NO Participaste en el retiro.");
		}
            }
            
            double nP = totalPay - Deductions;
            System.out.println("\n\nHoras trabajadas: " + tH);
            System.out.println("Pago: $" + pay);
            System.out.println("Pago regular por 40 horas: $" + rpay);
            System.out.println("Pago extra: $" + opay);
            System.out.println("Total: $" + totalPay);
            if (Deductions > totalPay) {
                System.out.println("No es posible deducir el pago");
            } else {
                System.out.println("Deducciones totales: $" +Deductions);
                System.out.println("Pago neto: $" + nP);
            }
        }
    }
    
}
