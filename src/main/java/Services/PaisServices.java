package Services;

import Entities.pais;
import Repository.PaisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServices {
    @Autowired
    PaisesRepository paisesRepository;

    public List<pais> consultarTodo (){
        List <pais> all = paisesRepository.findAll();
        return all;
    }

    public pais crearPais (pais pais){
        pais pais1 = paisesRepository.save(pais);
        return pais1;
    }

    public pais crearPais2 (pais pais){
        pais pais1 = paisesRepository.save(pais);
        return pais1;
    }
}
