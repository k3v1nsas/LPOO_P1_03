/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpark;

import java.util.Scanner;

public class TestPark {

    public static void main(String[] args) {
        String nP, nP2,nP3,nP4;
        int size, size2;
        Scanner sc = new Scanner(System.in);   
        
        System.out.println("\n\nCase1\n");
        System.out.println("Enter the name of the park: ");
	nP = sc.nextLine();
        System.out.println("Enter the size of the park: ");
	size = sc.nextInt();
        sc.nextLine();
        Park p1 = new Park(nP, size, true, true, true, true);
        boolean rmetodo1 = m1(p1.getPicnicFacilities(), p1.getPlayground()); 
        if(p1.getSize()==0){
            System.out.println("The size has to be 0-400\n");
        }
        System.out.println("Name of the park: "+p1.getName()+"\nSize: "+p1.getSize()+"\nResult of the m1: "+ rmetodo1);
        
        System.out.println("\n\nCase2\n");
        System.out.println("Enter the name of the park: ");
	nP2 = sc.nextLine();   
        System.out.println("Enter the size of the park: ");
	size2 = sc.nextInt();        
        Park p2 = new Park(nP2, size2, true, true, false, true);
        boolean rmetodo2 = m2(p2.getPicnicFacilities(), p2.getPlayground(),p2.getTennisCourt(),p2.getSwimmingPool());        
        if(p2.getSize()==0){
            System.out.println("The size has to be 0-400\n");
        }
        System.out.println("Name of the park: "+p2.getName()+"\nSize: "+p2.getSize()+"\nResult of the m2: "+ rmetodo2);
   
    
        System.out.println("\n\nCase3\n");
        System.out.println("Enter the name of the park: ");
        nP3 = sc.nextLine();   
        sc.nextLine();
        System.out.println("Enter the size of the park: ");
	int size3 = sc.nextInt();        
        Park p3 = new Park(nP3, size3, true, true, false, true);
        int rmetodo3 = m3(p3.getPicnicFacilities(),p3.getPlayground(),p3.getTennisCourt(),p3.getSwimmingPool());        
        if(p3.getSize()==0){
            System.out.println("The size has to be 0-400\n");
        }
       System.out.println("Name of the park: "+p3.getName()+"\nSize: "+p3.getSize()+"\nResult of the m3: "+ rmetodo3);
         
 
        System.out.println("\n\nCase4\n");
        System.out.println("Enter the name of the park: ");
	nP4 = sc.nextLine();   
        sc.nextLine();
        System.out.println("Enter the size of the park: ");
	int size4 = sc.nextInt();        
        Park p4 = new Park(nP4, size4, true, false, false, true);
        m4(p4.getName(),p4.getSize());        
        if(p4.getSize()==0){
            System.out.println("The size has to be 0-400\n");
        }  
    }
    
    public static boolean m1(boolean PicFac, boolean PlayG){
        if((PicFac==true)&&(PlayG==true)){
            return true;
        }else{
            return false;
        } 
    }
    
    public static boolean m2(boolean PicFac, boolean PlayG, boolean TenisC, boolean SwimP){
        if(PicFac==true && PlayG==true && TenisC==true && SwimP==true){
            return true;
        }else{
            return false;
        }
    }
    public static int m3(boolean PicFac, boolean PlayG, boolean TenisC, boolean SwimP){
        int cont=0;
        if(PicFac==true){
            cont++;
        }
        if(PlayG==true){
            cont++;
        }
        if (  TenisC==true ){
            cont++;
        }
        if (SwimP==true){
            cont++;
        }
        return cont;
    }
    
    public static void m4(String name, int size){
        System.out.println("Name of the park: "+name+"\nSize: "+size);
    }
}