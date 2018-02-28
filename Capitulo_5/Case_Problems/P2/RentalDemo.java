
package rentaldemo;

import java.util.Scanner;

public class RentalDemo {

private static Scanner scanner;
public static void main(String[] args) {
    Renta r1 = new Renta();
    Renta r2 = new Renta();
    Renta r3 = new Renta();
    
    Renta.samysMotto();
    calc(r1);
    calc(r2);
    calc(r3);
    System.out.println("\nComparacion Eventos 1 y 2 ");
    compara(r1.getRentalHours(),r2.getRentalHours(), r1.getConNum(),r2.getConNum());
    System.out.println("Comparacion Eventos 2 y 3 ");
    compara(r2.getRentalHours(),r3.getRentalHours(), r2.getConNum(),r3.getConNum());
    System.out.println("Comparacion Eventos 1 y 3 ");
    compara(r1.getRentalHours(),r3.getRentalHours(), r1.getConNum(),r3.getConNum());
}
	public static Integer tiempoRenta() {
            scanner = new Scanner(System.in);
            System.out.println("\nIngrese el numero de minutos que rento el equipo deportivo: ");

            Integer minutes = scanner.nextInt();
            return minutes;
	}
	public static String NumCont() {
            scanner = new Scanner(System.in);
            System.out.println("Ingrese el numero de contrato: ");
            String number = scanner.nextLine();
            return number;
	}
	public static void calc(Renta r) {
            r.setConNum(NumCont());
            r.setHoraM(tiempoRenta());
            System.out.println("\n\nNumero de contrato: "+r.getConNum());
            System.out.println("Cantidad de horas : " + r.getRentalHours());
            System.out.println("Cantidad de minutos : " + r.getExtramin());
            System.out.println("El precio total a pagar es: " + r.getPrice());
	}
	public static void samysMotto() {
            System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n"+
			   "Ss  Sammy's makes it fun in the sun   Ss\n"+
			    "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
	}
        
        public static void compara(int x , int y,String ne, String ne2){
            
        if(x==y){
            System.out.println("La duracion es la misma en horas: "+ x);
        }else if(x>y){
            System.out.println("La renta mas larga es "+ne +  " y sus horas son: "+ x);
        }else {
            System.out.println("La renta mas larga es "+ ne2+ " y sus horas son: "+ y);
        }
        }
}