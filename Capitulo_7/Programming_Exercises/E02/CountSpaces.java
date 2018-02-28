/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countspaces;

public class CountSpaces {

    public static void main(String[] args) {
        String statement="The person who says something is imposible should not interrupt the person who is doing it";
        int cont=0;
        
        for(int i=0;i<statement.length();++i){
            if(statement.charAt(i)==' ')
                ++cont;
        }
        System.out.println("\nEspacios encontrados:\n"+statement+"\nEspacios: "+cont);
    }
    
}
