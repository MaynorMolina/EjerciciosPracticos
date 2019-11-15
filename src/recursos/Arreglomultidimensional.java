/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import javax.swing.JOptionPane;

/**
 *
 * @author Maynor Molina
 */
public class Arreglomultidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String [][] Compañeros ={{"Jesus    ","Acosta","Ing. en Electronica", "   N/A"},
                                 {"Cristian  ","Menjivar","Ing. en Producción Industrial", "N/A"},
                                 {"Eduardo   ","Rivera", "Ing. Industrial","N/A"},
                                 {"Jeffree   ","Reyes","Ing. en Electronica","N/A"},
                                 {"Job ","Ramos", "Ing. en Electronica","N/A"},
                          };
    
        String imprimir="";
    
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                imprimir+= Compañeros[i][j];
            }
            imprimir+="\n";
        }
   System.out.println(imprimir);
        
    }
    
}
