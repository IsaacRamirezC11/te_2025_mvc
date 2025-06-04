package mx.unam.aragon.ico.te.basquetbolistas.controladores;

import mx.unam.aragon.ico.te.basquetbolistas.modelos.Estadio;
import mx.unam.aragon.ico.te.basquetbolistas.servicios.EstadioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estadios")
public class EstadioController {

    @Autowired
    private EstadioService estadioService;

    @GetMapping("/home/")
    public String home(Model model) {
        model.addAttribute("estadios", estadioService.listarTodos());
        return "homeEstadios";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("estadio", new Estadio());
        return "formEstadio";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Estadio estadio) {
        Estadio guardado = estadioService.guardar(estadio);
        return "redirect:/estadios/estadio/" + guardado.getId();
    }

    @GetMapping("/estadio/{id}")
    public String verEstadio(@PathVariable Long id, Model model) {
        Estadio estadio = estadioService.obtenerPorId(id);
        if (estadio != null) {
            model.addAttribute("estadio", estadio);
            return "estadio";
        }
        return "redirect:/estadios/home/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Estadio estadio = estadioService.obtenerPorId(id);
        if (estadio != null) {
            model.addAttribute("estadio", estadio);
            return "formEstadio";
        }
        return "redirect:/estadios/home/";
    }

    @PostMapping("/editar/{id}")
    public String actualizar(@PathVariable Long id, @ModelAttribute Estadio estadio) {
        estadio.setId(id);
        estadioService.guardar(estadio);
        return "redirect:/estadios/estadio/" + id;
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        estadioService.eliminar(id);
        return "redirect:/estadios/home/";
    }
}
