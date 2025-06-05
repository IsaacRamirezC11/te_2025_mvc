package mx.unam.aragon.ico.te.basquetbolistas.controladores;




import mx.unam.aragon.ico.te.basquetbolistas.modelos.Uniforme;
import mx.unam.aragon.ico.te.basquetbolistas.servicios.UniformeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/uniformes")
public class UniformeController {
    @Autowired
    private UniformeService uniformeService;
    @GetMapping("/home/")
    public String home(Model model) {
        model.addAttribute("uniformes", uniformeService.listarTodos());
        return "homeUniformes";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("uniforme", new Uniforme());
        return "formUniforme";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Uniforme uniforme) {
        Uniforme guardado = uniformeService.guardar(uniforme);
        return "redirect:/uniformes/ver/" + guardado.getId();
    }

    @GetMapping("/ver/{id}")
    public String ver(@PathVariable Long id, Model model) {
        Uniforme uniforme = uniformeService.obtenerPorId(id);
        if (uniforme != null) {
            model.addAttribute("uniforme", uniforme);
            return "uniforme";
        }
        return "redirect:/uniformes/home/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Uniforme uniforme = uniformeService.obtenerPorId(id);
        if (uniforme != null) {
            model.addAttribute("uniforme", uniforme);
            return "formUniforme";
        }
        return "redirect:/uniformes/home/";
    }

    @PostMapping("/editar/{id}")
    public String actualizar(@PathVariable Long id, @ModelAttribute Uniforme uniforme) {
        uniforme.setId(id);
        uniformeService.guardar(uniforme);
        return "redirect:/uniformes/ver/" + id;
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        uniformeService.eliminar(id);
        return "redirect:/uniformes/home/";
    }
}
