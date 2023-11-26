package DAWI_CL3_RiveraZagaceta.Rivera_Zagaceta.service;

import DAWI_CL3_RiveraZagaceta.Rivera_Zagaceta.model.Rol;
import DAWI_CL3_RiveraZagaceta.Rivera_Zagaceta.model.Usuario;
import DAWI_CL3_RiveraZagaceta.Rivera_Zagaceta.repository.RolRepository;
import DAWI_CL3_RiveraZagaceta.Rivera_Zagaceta.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;


@Service
@AllArgsConstructor
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    private RolRepository rolRepository;
    private BCryptPasswordEncoder bcryptPasswordEnconder
            = new BCryptPasswordEncoder();

    public Usuario saveUser(Usuario usuario){
        usuario.setPassword(
                bcryptPasswordEnconder.encode(usuario.getPassword()));
        usuario.setActivo(true);
        Rol usuarioRol = rolRepository.findByNomrol("USER");
        usuario.setRoles(new HashSet<>(Arrays.asList(usuarioRol)));
        return usuarioRepository.save(usuario);
    }

}
