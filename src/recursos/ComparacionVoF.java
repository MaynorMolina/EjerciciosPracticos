
package recursos;

/**
 *
 * @author Maynor Molina
 */
public class ComparacionVoF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int M=6, T=1, K=-10;
       System.out.println("****Evaluacion Verdadero o Falso****");
       System.out.println("Comparación si cumple M y T");
        
        if(M>T){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
        System.out.println("////////////////////////////////////////////////");
        
        System.out.println("Verificación si cumple T / K == -5");
        
        if(T / K == -5){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }        
        System.out.println("////////////////////////////////////////////////");

        System.out.println("Verificación si cumple (M+T == 7) || (M-T == 5)");
        
        if((M+T == 7) || (M-T == 5)){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        } 
        
    }
    
}
