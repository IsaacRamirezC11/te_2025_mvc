package mx.unam.aragon.ico.te.basquetbolistas.controladores;

import mx.unam.aragon.ico.te.basquetbolistas.modelos.Basquetbolista;
import mx.unam.aragon.ico.te.basquetbolistas.servicios.BasquetbolistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/jugadores")
public class jugadoresController {

    @Autowired
    private BasquetbolistaService basquetbolistaService;

    @GetMapping("/home/")
    public String home(Model model) {
        model.addAttribute("basquetbolistas", basquetbolistaService.listarTodos());
        return "home";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("basquetbolista", new Basquetbolista());
        return "formBasquetbolista";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Basquetbolista basquetbolista) {
        Basquetbolista guardado = basquetbolistaService.guardar(basquetbolista);
        return "redirect:/jugadores/basquetbolista/" + guardado.getId();
    }

    @GetMapping("/basquetbolista/{id}")
    public String verBasquetbolista(@PathVariable Integer id, Model model) {
        Basquetbolista basquetbolista = basquetbolistaService.obtenerPorId(id);
        if (basquetbolista != null) {
            model.addAttribute("basquetbolista", basquetbolista);
            return "basquetbolista";
        }
        return "redirect:/jugadores/home/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Basquetbolista basquetbolista = basquetbolistaService.obtenerPorId(id);
        if (basquetbolista != null) {
            model.addAttribute("basquetbolista", basquetbolista);
            return "formBasquetbolista";
        }
        return "redirect:/jugadores/home/";
    }

    @PostMapping("/editar/{id}")
    public String actualizar(@PathVariable Integer id, @ModelAttribute Basquetbolista basquetbolista) {
        // Aseguramos que el ID sea el correcto
        basquetbolista.setId(id);
        basquetbolistaService.guardar(basquetbolista);
        return "redirect:/jugadores/basquetbolista/" + id;
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        basquetbolistaService.eliminar(id);
        return "redirect:/jugadores/home/";
    }
}