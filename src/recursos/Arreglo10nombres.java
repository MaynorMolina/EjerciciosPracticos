/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author Maynor Molina
 */
public class Arreglo10nombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] listado = new String [10];
        listado[0]="Aylin Mareli Funez Maldonado";
        listado[1]="Delbert Alexander Lira Tinoco";
        listado[2]="Gustavo Adolfo Siu Marquez";
        listado[3]="Jesus Arturo Acosta Cerrato";
        listado[4]="Job Eliacsar Ramos Canales";
        listado[5]="Katerin Dayana Guifarro Fernadez";
        listado[6]="Jeffree Heli Reyes Quintero";
        listado[7]="Keissy Danelly Perdomo Isasi";
        listado[8]="Kevin Antonio Archaga Alfaro";
        listado[9]="Scarlett Anahi Castillo Medina";
        
        for(int i = 0; i < listado.length; i++){
            System.out.println(listado[i]);
        }
    }
    
}
