
package proyecto.hdp;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;


public class Usuario {
    
    @Id
    private String id;
    
    private String nickname;
    private String email;
    private String password;
    private ArrayList<Mensaje> mensajes;
    private Posicion posicion;

    public Usuario(String id, String nickname, String email, String password, ArrayList<Mensaje> mensajes, Posicion posicion) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.mensajes = mensajes;
        this.posicion = posicion;
    }

    public Usuario(String nickname, String email, String password, ArrayList<Mensaje> mensajes, Posicion posicion) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.mensajes = mensajes;
        this.posicion = posicion;
    }

    public Usuario(String id) {
        this.id = id;
    }

    Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    
   
}
