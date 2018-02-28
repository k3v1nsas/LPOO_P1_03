/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdigitalcamera;

public class DigitalCamera {
    private String brand;
    private Integer mgp;
    private Double precio;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getMgpixeles() {
        return mgp;
    }

    public void setMgpixeles(Integer mgpixeles) {
        if(mgpixeles>10){
             this.mgp = 10;
        }else{
             this.mgp = mgpixeles;
        }
        if(this.mgp<=6){
            this.precio=99.0;
        }else{
            this.precio=129.0;
        }
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public void Message(){
        System.out.println("Brand: "+ getBrand()+"\nPrice: "+getPrecio()+"\nMegapixeles: "+getMgpixeles());
    }

    
    
}
