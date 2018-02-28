/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspections;

/**
 *
 * @author Rafael
 */
public class Inspections {

    
    public static void main(String[] args) {
        int fab = 0;
        double f1=0,f2=0,f3=0,f4=0;
        double por=0;
         
     
        for(int i = 1;i<= 52; i++ ){
            fab = 1 + (int)(Math.random()*4);
            System.out.println("Semana " +i+ " sera inspeccionada la fabrica " + fab);
            switch(fab){
                case 1:
                    f1++;
                    break;
                case 2:
                    f2++;
                    break;
                case 3:
                    f3++;
                    break;
                case 4:
                    f4++;
                    break;
            }
        }
        System.out.println();
        for(int i = 1; i <= 4; i++){
            switch (i){
                case 1:
                    por=(f1*100)/52;
                    break;
                case 2:
                    por=(f2*100)/52;
                    break;
                case 3:
                    por=(f3*100)/52;
                    break;
                case 4:
                    por=(f4*100)/52;
                    break;
            }
            System.out.println("La fabrica " + i + " fue inspeccionada un " + (int)por + "%");
            
        }
    
    }
}
