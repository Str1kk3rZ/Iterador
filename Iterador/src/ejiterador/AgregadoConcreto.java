package ejiterador;


import java.util.Vector;
public class AgregadoConcreto implements Agregado
{
     protected Vector aDatos = new Vector();
    // -------------------------
    public AgregadoConcreto() {
        this.llenar();
    }
    // -------------------------
    @Override
     public Iterador getIterador()
    {
        return new IteradorConcreto( this );
    }
    // -------------------------
    public void llenar()
    {
        this.aDatos.add( new String("Andres") );
        this.aDatos.add( new String("Kevin") );
        this.aDatos.add( new String("Sergio") );
        this.aDatos.add( new String("Samantha") );
    }
}
    

