/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.util.Scanner;

/**
 *
 * @author Maynor Molina
 */
public class Notaestudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println ("!!Plataforma Virtual de Calificaciones!!");
       System.out.println ("!!Biemvenido!!");
       System.out.println ("!!Acontinuacion Ingrese la Informacion del Estudiante!!");
       System.out.println ("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        
        System.out.println ("introduzca el nombre de estudiante:");
        String nombre;
        Scanner entradaEscaner = new Scanner (System.in);
        nombre = entradaEscaner.nextLine();
        
        System.out.println ("introduzca la nota final del estudiante:");
        String nota;
        nota = entradaEscaner.nextLine(); 
        int Notafinal = Integer.parseInt(nota);
        
        if (Notafinal < 70){
            System.out.println ("El Estudiante "+nombre+" está: Reprobado");
        }else{
            System.out.println ("El Estudiante "+nombre+" está: Aprobado");
        }
    }
    
}
