package mx.unam.aragon.ico.te.basquetbolistas.servicios;

import mx.unam.aragon.ico.te.basquetbolistas.modelos.Equipo;
import java.util.List;

public interface EquipoService {
    List<Equipo> obtenerTodos();
    Equipo obtenerPorId(Long id);
    Equipo guardar(Equipo equipo);
    void eliminar(Long id);
}
