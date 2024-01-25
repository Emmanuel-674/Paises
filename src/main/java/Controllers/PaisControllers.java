package Controllers;

import Entities.pais;
import Services.PaisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
