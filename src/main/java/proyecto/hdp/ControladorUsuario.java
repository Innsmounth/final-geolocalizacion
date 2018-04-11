
package proyecto.hdp;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
    @RestController
    @RequestMapping("/api")
public class ControladorUsuario {
    //Aqui van las5 operaciones basicas
    
    @Autowired RepositorioUsuario repo;
    
    //guardar
    @RequestMapping(value="/usuario",method = RequestMethod.POST,headers={"Accept=application/json"})
    public Estatus guardar(@RequestBody String json)throws Exception{
    
        ObjectMapper maper = new ObjectMapper();
        Usuario u = maper.readValue(json, Usuario.class);
        
        Estatus e = new Estatus();
        repo.save(u);
        
        e.setSuccess(true);
        return e;
    }
}
