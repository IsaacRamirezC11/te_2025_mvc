package mx.unam.aragon.ico.te.basquetbolistas.controladores;

import mx.unam.aragon.ico.te.basquetbolistas.modelos.Equipo;
import mx.unam.aragon.ico.te.basquetbolistas.servicios.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/equipos")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @GetMapping("/home/")
    public String home(Model model) {
        model.addAttribute("equipos", equipoService.obtenerTodos());
        return "homeEquipos";  // Asegúrate de tener una vista llamada equipo.html
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("equipo", new Equipo());
        return "formEquipo";  // Vista con el formulario para crear/editar
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Equipo equipo) {
        Equipo guardado = equipoService.guardar(equipo);
        return "redirect:/equipos/equipo/" + guardado.getId();
    }

    @GetMapping("/equipo/{id}")
    public String verEquipo(@PathVariable Long id, Model model) {
        Equipo equipo = equipoService.obtenerPorId(id);
        if (equipo != null) {
            model.addAttribute("equipo", equipo);
            return "equipo";  // Vista para mostrar los detalles de un equipo
        }
        return "redirect:/equipos/home/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Equipo equipo = equipoService.obtenerPorId(id);
        if (equipo != null) {
            model.addAttribute("equipo", equipo);
            return "formEquipo";
        }
        return "redirect:/equipos/home/";
    }

    @PostMapping("/editar/{id}")
    public String actualizar(@PathVariable Long id, @ModelAttribute Equipo equipo) {
        equipo.setId(id);
        equipoService.guardar(equipo);
        return "redirect:/equipos/equipo/" + id;
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        equipoService.eliminar(id);
        return "redirect:/equipos/home/";
    }
}
