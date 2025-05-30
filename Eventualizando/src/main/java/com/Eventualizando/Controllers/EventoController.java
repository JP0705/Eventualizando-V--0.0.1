package com.Eventualizando.Controllers;

import com.Eventualizando.model.Evento;
import com.Eventualizando.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//cria o caminho para acessar as paginas de evento e criar eventos

@Controller
@RequestMapping("/eventos")
public class EventoController {

    //salva novos eventos

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping("/novo")
    public String exibirFormulario(Model model) {
        model.addAttribute("evento", new Evento());
        return "formulario-evento";
    }

    @PostMapping
    public String salvarEvento(@ModelAttribute Evento evento) {
        eventoRepository.save(evento);
        return "redirect:/eventos";
    }

    //busca todos os eventos do banco e manda para a pagina eventos;

    @GetMapping
    public String listarEventos(Model model) {
        List<Evento> eventos = eventoRepository.findAll();
        model.addAttribute("eventos", eventos);
        return "eventos";
    }
}
