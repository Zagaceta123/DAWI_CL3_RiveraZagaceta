package DAWI_CL3_RiveraZagaceta.Rivera_Zagaceta.repository;

import DAWI_CL3_RiveraZagaceta.Rivera_Zagaceta.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RolRepository extends JpaRepository<Rol,
        Integer> {

    Rol findByNomrol(String nomrol);

}
