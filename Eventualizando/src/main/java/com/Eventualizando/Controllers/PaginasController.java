package com.Eventualizando.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//cria o caminho para acessar as paginas atualmente sem interação;

@Controller
public class PaginasController {

    @GetMapping("/login")
    public String telaLogin() {
        return "tela-login";
    }

    @GetMapping("/perfil")
    public String telaPerfil() {
        return "tela-perfil";
    }

    @GetMapping("/work-in-progress")
    public String workInProgress() {
        return "work-in-progress";
    }

    @GetMapping("/pesquisa")
    public String telaPesquisa() {
        return "tela-pesquisa";
    }

    @GetMapping("/carrinho")
    public String telaCarrinho() {
        return "tela-carrinho";
    }

    @GetMapping("/pagamento")
    public String telaPagamento() {
        return "tela-pagamento";
    }
}
