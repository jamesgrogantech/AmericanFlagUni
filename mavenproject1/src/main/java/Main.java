/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author James Grogan - 21485106
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    static String createStars(int index) {
        if(index % 2 == 0){
            return "* * * * * *";
        }
        else{
            return " * * * * * ";
        }
    }
    
    static String createStripes(int columns){
        String stripe = "";
        for (int i = 0; i < columns; i++) {
            stripe = stripe + "=";
        }
        return stripe;
    }
    public static void main(String[] args) {
        // Create top of the flag
        int shortStripes = 40;
  
        for (int i = 0; i < 9; i++) {
            System.out.println(createStars(i) + " " + createStripes(shortStripes));
        }
        // Create bottom of the flag
        int longStripes = shortStripes + 12;
                
        for (int i = 0; i < 6; i++){
            System.out.println(createStripes(longStripes));
        }
    }
}
