package com.Eventualizando.Controllers;

import com.Eventualizando.model.Usuario;
import com.Eventualizando.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//cria um caminho para a pagina de cadastro;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    //salva o cadastro no banco;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/cadastro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "tela-cadastro";
    }

    @PostMapping("/salvar")
    public String salvarUsuario(@ModelAttribute Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/";
    }
}
