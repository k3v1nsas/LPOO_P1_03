/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createpurchase;

/**
 *
 * @author Rafael
 */
public class Purchase {
    int numFact;
    double mVenta;
    double impuesto;
    
    public void setNumFact(int fact){
        numFact = fact;
    }
   
    public void setMontoVenta(double venta){
        mVenta = venta;
        impuesto = venta * 0.05;
    }
   
    public void resultados(){
        System.out.println("\n\nNum. de factura " + numFact);
        System.out.println("Monto de venta es: $" + mVenta);
        System.out.println("Los impuestos de venta son $" + impuesto);
        System.out.println("Las ganancias son $" + (mVenta +impuesto));
    }
}
