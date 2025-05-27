package mx.unam.aragon.ico.te.basquetbolistas.servicios;

import mx.unam.aragon.ico.te.basquetbolistas.modelos.Basquetbolista;
import java.util.List;

public interface BasquetbolistaService {
    List<Basquetbolista> listarTodos();
    Basquetbolista obtenerPorId(Integer id);
    Basquetbolista guardar(Basquetbolista basquetbolista);
    void eliminar(Integer id);
}