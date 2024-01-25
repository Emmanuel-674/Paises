package Repository;


import Entities.pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaisesRepository extends JpaRepository <pais, Long> {

    public List<pais> findAll();
}
