/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twelvedays;

public class TwelveDays {

     public static void main (String [] args){
        int i;
        
        System.out.print ("Twuelve days of Christmas:\n \n");
        String ordinal_numbers[] = { "first", "second",   "third",  "fourth", "fifth",  "sixth",  "seventh",  "eighth",  "ninth", "tenth", "eleventh",  "twelfth"};

        for(i = 1; i <= 12; ++i){
            System.out.print("On the " + ordinal_numbers[i-1]+ " day of Christmas,\n");
            switch(i){
                case 12:
                    System.out.println("Twelve Drummers Drumming");
                case 11:
                    System.out.println("Eleven Pipers Piping");
                case 10:
                    System.out.println("Ten Lords a Leaping");
                case 9:
                    System.out.println("Nine Ladies Dancing");
                case 8:
                    System.out.println("Eight Maids a Milking");
                case 7:
                    System.out.println("Seven Swans a Swimming");
                case 6:
                    System.out.println("Six Geese a Laying");
                case 5:
                    System.out.println("Five Golden Rings");
                case 4:
                    System.out.println("Four Calling Birds");
                case 3:
                    System.out.println("Three French Hens");
                case 2:
                    System.out.println("Two Turtle Doves");
                case 1:
                    if(i == 0){
                        System.out.print("A Partridge in a Pear Tree.\n\n");
                    }else{
                        System.out.print("and a Partridge in a Pear Tree.\n\n");
                    }
                    break;
                default:
                    System.out.print("Error.");
                    System.exit(1);
            }
        }                                     
    }
    
}
