/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

public class TestInvoice2 {
    public static void main(String[] args){
        Invoice2 p1 = new Invoice2(10, 345.67, 31, 2, 1034);
        p1.display();
        Invoice2 p2 = new Invoice2(10000, 456.45, 30, 12, 1034);
        p2.display();
        Invoice2 p3 = new Invoice2(10000, 64.45, 30, 56, 1034);
        p3.display();
    }
}
