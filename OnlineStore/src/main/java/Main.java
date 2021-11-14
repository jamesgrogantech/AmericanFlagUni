/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author James Grogan
 */

import java.util.Scanner;  // Import the Scanner class



public class Main {

    public static void main(String[] args) {
        Product[] products = {
            new Product("Potato", 0.80),
            new Product("Carrot", 2.40),
            new Product("Apple", 3.50),
        }
    }
    Scanner myObj = new Scanner(System.in);
    
}


class Product{
    String name;
    double price;
    public Product(String inputName,double inputPrice){
        name = inputName;
        price = inputPrice;
    }
}