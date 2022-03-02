
/**
 * Write a description of class TestOverride here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
public class TestOverride
{
    // Variables de Instancia 
    private final float PI = 3.14159f;
    
    

    public static void main(String args[]) {
        Punto p = new Punto(3,4);
        Circulo c = new  Circulo(4,5,6);
        Cilindro cy = new Cilindro(3,4,5,6);
        
        cy.toString();
    }

    public void testEquals() {
        String str1 = new String("Hola!");
        String str2 = new String("Hola!");
        
        if( str1 == str2 ) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        
        str2 = str1;
        if( str1 == str2 ) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}
