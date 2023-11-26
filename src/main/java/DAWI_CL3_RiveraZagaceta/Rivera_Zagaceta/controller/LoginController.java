package DAWI_CL3_RiveraZagaceta.Rivera_Zagaceta.controller;

import DAWI_CL3_RiveraZagaceta.Rivera_Zagaceta.model.Usuario;
import DAWI_CL3_RiveraZagaceta.Rivera_Zagaceta.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping
public class LoginController {
    private UsuarioService usuarioService;
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/registrar")
    public String registro(){
        return "registro";
    }
    @PostMapping("/guardarusuario")
    public String guardarUsuario(@ModelAttribute Usuario usuario){
        usuarioService.saveUser(usuario);
        return "login";
    }

    @GetMapping("/login-success")
    public String loginsuccess(){
        return "dashboard";
    }
}
