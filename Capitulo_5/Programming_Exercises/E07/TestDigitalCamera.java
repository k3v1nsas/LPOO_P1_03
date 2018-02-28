/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdigitalcamera;

import java.util.Scanner;

public class TestDigitalCamera {

    public static void main(String[] args) {
        
        String brand, brand2, brand3, brand4;
        Integer mxp, mxp2, mxp3, mxp4;        
        Scanner in = new Scanner(System.in);
        DigitalCamera p1 = new DigitalCamera();
        DigitalCamera p2 = new DigitalCamera();
        DigitalCamera p3 = new DigitalCamera();
        DigitalCamera p4 = new DigitalCamera();
        
        System.out.println("Enter the brand:");
	brand = in.next();
        p1.setBrand(brand);
        System.out.println("Enter the megapixeles");
        mxp = in.nextInt();
        p1.setMgpixeles(mxp);
        p1.Message();
        System.out.println();
        
        System.out.println("Enter the brand:");
	brand2 = in.next();
        p2.setBrand(brand2);
        System.out.println("Enter the megapixeles");
        mxp2 = in.nextInt();
        p2.setMgpixeles(mxp2);
        p2.Message();
        System.out.println();
        
        System.out.println("Enter the brand:");
	brand3 = in.next();
        p3.setBrand(brand3);
        System.out.println("Enter the megapixeles");
        mxp3 = in.nextInt();
        p3.setMgpixeles(mxp3);
        p3.Message();
        System.out.println();
        
        
        System.out.println("Enter the brand:");
	brand4 = in.next();
        p4.setBrand(brand4);
        System.out.println("Enter the megapixeles");
        mxp4 = in.nextInt();
        p4.setMgpixeles(mxp4);
        p4.Message();
        System.out.println();
    }
    
}
