package mx.unam.aragon.ico.te.basquetbolistas.servicios;

import mx.unam.aragon.ico.te.basquetbolistas.modelos.Estadio;
import java.util.List;

public interface EstadioService {
    List<Estadio> listarTodos();
    Estadio obtenerPorId(Long id);
    Estadio guardar(Estadio estadio);
    void eliminar(Long id);
}
