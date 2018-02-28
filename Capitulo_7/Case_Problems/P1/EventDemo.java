
package eventdemo;

import java.util.Scanner;


public class EventDemo {

    private static String NEvent;
    private static int numberOfGuest;
    private static String phoneNum1;
    private static String NEvent1;
    private static int numberOfGuest1;
    private static String phoneNum2;
    
    public static void main(String[] args){
        boolean condi = false;
        
        Scanner in = new Scanner(System.in);
        Motto();
        System.out.println("\nNumero de Evento1");
        NEvent=in.nextLine();
        
        do{
            if(condi){
                System.out.println("Los invitados deben ser >5 y <100");
            }
            System.out.println("Numero invitados (>5 & <100)");
            numberOfGuest=in.nextInt();
            condi = true;
        }while(numberOfGuest <5 || numberOfGuest > 100);
        
        in.nextLine();
        System.out.println("Numero de telefono de contacto para evento1:");
        phoneNum1=in.nextLine();
        
        
        System.out.println("\nNumero de Evento2");
        NEvent1=in.nextLine();
        
        condi = false;
        do{
            if(condi){
                System.out.println("Los invitados deben ser >5 y <100");
            }
            System.out.println("Numero invitados (>5 & <100)");
            numberOfGuest1=in.nextInt();
            condi = true;
        }while(numberOfGuest1 <5 || numberOfGuest1 > 100);
        
        in.nextLine();
        System.out.println("Numero de telefono de contacto para evento2:");
        phoneNum2=in.nextLine();
        
        
        Event object1 = new Event(NEvent, numberOfGuest);
        object1.setPhoneNumber(phoneNum1);
        object1.display(numberOfGuest);
        
        Event object2 = new Event(NEvent1, numberOfGuest1);
        object1.setPhoneNumber(phoneNum2);
        object2.display(numberOfGuest1);
        
        compare (object1, object2);
        
    }
    
    
    public static void compare(Event evento1, Event evento2){
         
        if(evento1.getGuest()==evento2.getGuest()){
            System.out.println("Los eventos son iguales  y sus invitados son: "+evento1.getGuest());
        }else if(evento1.getGuest()>evento2.getGuest()){
            System.out.println("El evento mas grande es: "+ evento1.getEventNumber()+  " y sus invitados son "+ evento1.getGuest());
        }else {
            System.out.println("El evento mas grande es: "+ evento2.getEventNumber()+ " y sus invitados son "+ evento2.getGuest());
        }
    }
    public static void Motto() {
        System.out.println("************************************************");
        System.out.println("* Carly's makes the food that makes it a party *");
        System.out.println("************************************************");		
    } 

}

