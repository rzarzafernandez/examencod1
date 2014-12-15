// ramas

package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entero = 11;
        
        if (esPrimo(entero))
            System.out.println("Es numero primo");
        else
            System.out.println("NO es numero primo");           	 
          	 
        for (int x=2;x<1000;x++) {
            if (esPrimo(x))
                System.out.print(x + " ");                         	 
        }         	 
    }
    
    public static boolean esPrimo(int varia){
        int i = 2;
        boolean auxiliar=true;
        
        while ((auxiliar) && (i!=varia)){
            if (varia % i == 0)
                auxiliar = false;
                i++;
        }
        return auxiliar;
    } 	 
    
}


/* Esto es una locura
 *
 */