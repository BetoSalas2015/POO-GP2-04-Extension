
/**
 * Write a description of class Cilindro here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
public class Cilindro extends Circulo
{
    // Variables de Instancia 
    private int altura;

    /**
     * Constructor para objetos de la clase Cilindro
     */
    public Cilindro(int x, int y, int radio, int h)
    {
        super(x, y, radio);
        setAltura(h);
    }
    
    public void setAltura(int h) {
        altura = (h > 0) ? h : 1;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public String toString() {
        return super.toString() + ", Altura = " + altura;
    }
}
