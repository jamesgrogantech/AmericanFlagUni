/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author James Grogan - 21485106
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    
    static int getIntInput(String startMessage, String exeption){
        System.out.println(startMessage);
        int number = 0;
        while(number == 0){
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            try {
               number = Integer.parseInt(input);
            }
            catch (NumberFormatException e)
            {
               System.out.println(exeption);
               number = 0;
            }
        }
        return number;
    }
    
    static String getRange(double bmi){
        if (bmi < 18.5){
            return "You're in the underweight range";
        }
        else if (bmi >= 18.5 && bmi < 25){
            return "You're in the healthy weight range";
        }
        else if (bmi >= 25 && bmi < 30){
            return "You're in the overweight range";
        }
        else{
            return "You're in the obese range";
        }
    }
    
    public static void main(String[] args) {
        System.out.println("###### Welcome to the BMI Calculator ######");
        int weight = getIntInput(
            "Please enter your weight in kilograms (enter a whole number without units):",
            "Invalid number, make sure you only enter a whole integer (ie: 60)"
        );
        
        int height = getIntInput(
            "Please enter your height in centimeters (enter a whole number without units):",
            "Invalid number, make sure you only enter a whole integer (ie: 165)"
        );
        
        // make height meters
        double meterHeight = height / (double)100;
        
        double bmi = (weight / (double)(meterHeight * meterHeight));
        // round bmi
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("Your BMI is: " + String.valueOf(df.format(bmi)));
        System.out.println(getRange(bmi));
    }
    
}

