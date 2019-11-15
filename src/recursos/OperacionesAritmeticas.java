/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.util.Scanner;

/**
 *
 * @author Maynor Molina.
 */
public class OperacionesAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Suma;
        int Resta;
        int Multi;
        int Divi;
        int mod;
        
        System.out.println("***********************************************");
        System.out.println("Calculadora Aritmetica Virtual por Consola");
        System.out.println("***********************************************");
        
        System.out.println("Ingrese el primer Numero:");
        String num1;
        Scanner entradaEscaner = new Scanner (System.in);
        num1 = entradaEscaner.nextLine(); 
        int Num1 = Integer.parseInt(num1);
        
         System.out.println("Ingrese el segundo Numero:");
        String num2;
        num2 = entradaEscaner.nextLine(); 
        int Num2 = Integer.parseInt(num2);
        
        Suma = Num1+Num2;
        Resta = Num1-Num2;
        Multi = Num1*Num2;
        Divi = Num1/Num2;
        mod = Num1%Num2;
        
        System.out.println ("La Suma de "+Num1+" y "+Num2+" es: "+Suma+"");
        System.out.println ("******************************************************");
        System.out.println ("La Resta de "+Num1+" y "+Num2+" es: "+Resta+"");
        System.out.println ("******************************************************");
        System.out.println ("La Multiplicacion de "+Num1+" y "+Num2+" es: "+Multi+"");
        System.out.println ("******************************************************");
        System.out.println ("La Division entre los Numeros  "+Num1+" y "+Num2+" es: "+Divi+"");
        System.out.println ("******************************************************");
        System.out.println ("La mod entre "+Num1+" y "+Num2+" es: "+mod+"");
        
        
        
        
        
    }
    
}
