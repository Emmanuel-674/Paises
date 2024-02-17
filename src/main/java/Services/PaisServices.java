package Services;

import Entities.pais;
import Repository.PaisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisServices {
    @Autowired
    PaisesRepository paisesRepository;

    public List<pais> consultarTodo (){
        List <pais> all = paisesRepository.findAll();
        System.out.println("");
        return all;
    }

    public pais getPaisById (Integer id){
        pais pais1 = paisesRepository.findById(id);
        return pais1;
    }

    public pais crearPais2 (pais pais){
        pais pais1 = paisesRepository.save(pais);
        return pais1;
    }

    public void deletePais(Integer id){
        paisesRepository.deleteById(Long.parseLong(id.toString()));
    }
}
