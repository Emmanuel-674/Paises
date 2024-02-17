package Controllers;

import Entities.pais;
import Services.PaisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisControllers {
    @Autowired
    PaisServices paisServices;

    @GetMapping(path = "/all")
    public List<pais> consultarTodo(){
        return paisServices.consultarTodo();
    }
    @GetMapping (path = "{id}")
    public pais getById(@PathVariable (name = "id") Integer id){
        return paisServices.getPaisById(id);
    }
    @PostMapping
    public pais createPais(@RequestBody pais pais1){
        return paisServices.crearPais2(pais1);
    }
    @DeleteMapping(path = "{id}")
    public boolean deletePais(@PathVariable (name = "id") Integer id){
        try {
            paisServices.deletePais(id);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
}
