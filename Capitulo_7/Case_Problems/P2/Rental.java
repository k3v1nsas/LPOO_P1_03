/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import java.util.Scanner;

public class Rental {
    
    public final static int minutesInHour =60;
    public final static int rentalRate = 40;
    private String contractNumber = "A000";
    private int mm =0;
    private int precio;
    private int m=0;
    private String phoneNumber="0000000000";
    
    public Rental(String contractNumber, int minutes) {
        this.mm=minutes;
        setContractNumber(contractNumber);
        //setMinutes(minutes);
    }

    public int getMinutes() {
        return mm;
    }
    public int okMinutes(){
        boolean condi = false;
        Scanner sc = new Scanner(System.in);
         do{
            if(condi){
                System.out.println("mintuos >60 && <7200");
            }
             System.out.println("Minutos: ");
            m = sc.nextInt();
            condi = true;
            
        }while(m <60 || m > 7200);
         return m;
    }
   
    public void display(int minutes){
        
        
        int cost = setMinutes(minutes);
        if(cost==-1){
            System.out.println("Espere la proxima hora");
        }else{
            System.out.println("Tu tienes:  "+ minutes+ "mins \nNumero de horas: "+
                    (minutes/minutesInHour)+"\nMinutos extras: "+(minutes%minutesInHour)+
                    "\nPrecio $"+cost+"\nNumero de contrato "+getContractNumber()+
                    "\tNumero de contacto "+getPhoneNumber());
        }
        for(int i=0 ;i<(minutes/minutesInHour);i++){
            System.out.println("Coupon good for 10 percent off next rental!");
        }
        
        
    }
     public int setMinutes(int minutes) {
        this.mm = minutes;
        int h = this.mm/60;
        int em = this.mm%60;
        if( em <= 40){
            precio = (h*rentalRate)+(em*1);
        }else{
            precio = -1;
        }
        return precio;
        
    }
    //Default constructor
    Rental(){
    }
    public void setPhoneNumber(String phoneNumber){
        StringBuilder allDigitNumber =new StringBuilder();
        int cont=0;
        
        for(int i=0;i<phoneNumber.length();i++){
            if(Character.isDigit(phoneNumber.charAt(i))){
                allDigitNumber.append(phoneNumber.charAt(i));
                cont++;
            }
        }
        if(cont==10) 
            this.phoneNumber=allDigitNumber.toString();
    }
    
    public String getPhoneNumber(){
        StringBuilder numberFormat=new StringBuilder();
        
        for(int i=0;i<this.phoneNumber.length();i++){
            switch (i) {
                case 0:
                    numberFormat.append("(").append(this.phoneNumber.charAt(i));
                    break;
                case 2:
                    numberFormat.append(this.phoneNumber.charAt(i)).append(")");
                    break;
                case 3:
                    numberFormat.append(" ").append(this.phoneNumber.charAt(i));
                    break;
                case 5:
                    numberFormat.append(this.phoneNumber.charAt(i)).append("-");
                    break;
                default:
                    numberFormat.append(this.phoneNumber.charAt(i));
                    break;
            }
        }
        return numberFormat.toString();
    }
     
    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        boolean check=true;
        for(int i=0;i<contractNumber.length();i++){
            if(i==0){
                if(!Character.isLetter(contractNumber.charAt(i))){
                    check=false;
                    break;
                }
            }else{
                if(!Character.isDigit(contractNumber.charAt(i))){
                    check=false;
                    break;
                }
            }
        }
        if(check && contractNumber.length()==4){
            contractNumber=Character.toUpperCase(contractNumber.charAt(0))+contractNumber.substring(1,4);
            this.contractNumber=contractNumber;
        }
    }
}
