
package proyecto.hdp;


public class Mensaje {
    
   private String contenido; 

    public Mensaje(String contenido) {
        this.contenido = contenido;
    }

    Mensaje() {
       
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
}
