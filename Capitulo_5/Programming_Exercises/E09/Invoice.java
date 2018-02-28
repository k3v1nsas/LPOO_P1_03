/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

public class Invoice {
    private Integer InvoiceNumber;
    private double BalanceDue;
    private Integer dd;
    private Integer mm;
    private Integer yyyy;

    public Invoice(Integer InvoiceNumber, double BalanceDue, Integer dia, Integer mes, Integer anio) {
        if(InvoiceNumber<1000){
            this.InvoiceNumber = 0;
        }else{
            this.InvoiceNumber = InvoiceNumber;
        }
        if(mes<1 || mes>12){
            this.mm = 0;
        }else{
            this.mm = mes;
        }
        
        
        if(dia<1 || dia>31){
            this.dd = 0;
        }else{
            this.dd = dia;
        }
        if(anio<2011 || anio>2017){
            this.yyyy = 0;
        }else{
            this.yyyy = anio;
        }
        
        
        this.BalanceDue = BalanceDue;
        
    }
    
    public void display(){
        System.out.println("Invoice Number: "+this.InvoiceNumber+
                "\nBalance Due: "+this.BalanceDue+"\nYear: "+this.yyyy+"\nDay: "
                +this.dd+"\nMonth: "+this.mm);
    }
    
}
