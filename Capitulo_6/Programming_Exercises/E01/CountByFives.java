/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countbyfives;

/**
 *
 * @author Rafael
 */
public class CountByFives {

    
    public static void main(String[] args) {
        for(int i=0;i<=200;i=i+5){
            System.out.printf(" "+i);
            if(i%50==0){
                System.out.println();
            }
        }
    }
    
}
