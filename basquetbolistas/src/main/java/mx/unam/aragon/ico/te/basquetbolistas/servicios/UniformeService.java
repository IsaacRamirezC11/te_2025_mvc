package mx.unam.aragon.ico.te.basquetbolistas.servicios;
import mx.unam.aragon.ico.te.basquetbolistas.modelos.Uniforme;
import java.util.List;


public interface UniformeService {
    List<Uniforme> listarTodos();
    Uniforme guardar(Uniforme uniforme);
    Uniforme obtenerPorId(Long id);
    void eliminar(Long id);
}

