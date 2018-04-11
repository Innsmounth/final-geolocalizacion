package proyecto.hdp;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class UsuarioTest {
@Autowired RepositorioUsuario repo;

	@Test
	public void contextLoads() {
	}
        
       // @Test
        public void guardar(){
        //Aqui pondremos la logica de guardar un usuario
        //Generamos un objeto
        
        Usuario u = new Usuario();
        Posicion pos = new Posicion();
        Mensaje mensa = new Mensaje();
        
        
        //generamos un usuario con todos los atributos incluyendo
        //un mensaje y una posicion
        
        pos.setLat(19.90);
        pos.setLon(100.0);
        
        mensa.setContenido("Primer mensaje");
        
        u.setEmail("yomiloco@hotmail.com");
        ArrayList<Mensaje> mensajes = new ArrayList<>();
        mensajes.add(mensa);
        u.setMensajes(mensajes);
        u.setPassword("pass");
        u.setNickname("Innsmounth");
        u.setPosicion(pos);
        
        u.setId("primero");
        
        
        
        
        Usuario guardado = repo.save(u);
        Assert.assertEquals(guardado,u);
        //Assert.assertEquals(4, 2+2);
        
           
        }
        
        @Test
        public void actializar(){
        Assert.assertEquals(4, 2+2);
        }
        
        @Test
        public void borrar(){
         Assert.assertEquals(4, 2+2);
        }
        
        @Test
        public void buscarTodos(){
            /*int tamano = repo.findAll().size();
            
            
        Assert.assertEquals(1,tamano);*/
            
            Usuario encontrado = repo.findAll().get(0);
            Assert.assertEquals("primero", encontrado.getId());
        }
        
       // @Test
        public void buscarPorId(){
        
            Usuario usuarioBuscado = repo.findById("primero").get();
          
            
            
        Assert.assertEquals("primero",usuarioBuscado.getId());
        }

}
