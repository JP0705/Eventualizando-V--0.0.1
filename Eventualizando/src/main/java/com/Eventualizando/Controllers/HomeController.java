package com.Eventualizando.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//cria o caminho para a pagina index que liga ate as outras paginas da aplicação;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}

