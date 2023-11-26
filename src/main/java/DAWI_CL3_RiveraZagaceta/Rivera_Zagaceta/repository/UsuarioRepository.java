package DAWI_CL3_RiveraZagaceta.Rivera_Zagaceta.repository;

import DAWI_CL3_RiveraZagaceta.Rivera_Zagaceta.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends
        JpaRepository<Usuario, Integer>
{
    Usuario findByNomusuario(String nomusuario);


}