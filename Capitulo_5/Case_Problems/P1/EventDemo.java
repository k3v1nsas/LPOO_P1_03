
package eventdemo;

import java.util.Scanner;

public class EventDemo {
	private static Scanner in = new Scanner(System.in);

	public static int solicitud() {

		System.out.println("Introduzca cuantas personas asistiran: ");
		int invitados = in.nextInt();

		return invitados;
	}

	public static String getNumE() {

		System.out.println("Introduzca el numero de evento : ");
		in.nextLine();
		String eventNumber = in.nextLine();

		return eventNumber;
	}
        public static void display() {
            System.out.println("************************************************");
            System.out.println("* Carly's makes the food that makes it a party *");
            System.out.println("************************************************");		
	 }        

	public static void main(String[] args) {
		Event evento = new Event();
                Event evento2 = new Event();
                
		evento.setNumInv(solicitud());
		evento.setNumE(getNumE());
		display();
		System.out.println(evento.text()); 
                
                evento2.setNumInv(solicitud());
		evento2.setNumE(getNumE());
		display();
		System.out.println(evento2.text());
                
                compara(evento.getNumInv(),evento2.getNumInv(), evento.getNumE(),evento2.getNumE());
	}
        
        public static void compara(int x , int y,String ne, String ne2){
            
        if(x==y){
            System.out.println("Los eventos son iguales con invitados: "+ x);
        }else if(x>y){
            System.out.println("La fiesta grande es "+ne +  " y sus invitados son: "+ x);
        }else {
            System.out.println("La fiesta grande es "+ ne2+ " y sus invitados son: "+ y);
        }
        }

}
