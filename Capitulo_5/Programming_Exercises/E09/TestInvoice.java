/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

public class TestInvoice {
    public static void main(String[] args){
        Invoice p1 = new Invoice(789994, 345.67, 31, 03, 1034);
        p1.display();
    }
}
