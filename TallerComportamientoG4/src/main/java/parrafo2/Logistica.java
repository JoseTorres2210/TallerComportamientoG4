/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parrafo2;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class Logistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1. Automotriz");
        System.out.println("2. Aerea");
        System.out.println("3. Ciclista");
        System.out.println("4. Ferrea");
        System.out.println("5. Fluvial");
        System.out.println("Eliga un tipo de distrubucion para transportar: ");
        Scanner scanner = new Scanner(System.in);
        String input="0";
        Context context= new Context();
        
        input= scanner.nextLine();
        
        if(input.equals("1")){
        context.setDistribucion(new Automotriz());
        }
        else if(input.equals("2")){
        context.setDistribucion(new Aerea());
        }
        else if(input.equals("3")){
        context.setDistribucion(new Ciclista());
        }
        else if(input.equals("4")){
        context.setDistribucion(new Ferrea());
        }
        else if(input.equals("5")){
        context.setDistribucion(new Fluvial());
        }
        
        context.transportar();
    }
    
}
