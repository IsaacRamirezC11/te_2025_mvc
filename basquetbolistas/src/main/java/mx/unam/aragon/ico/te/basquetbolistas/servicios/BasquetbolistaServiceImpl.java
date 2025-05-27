package mx.unam.aragon.ico.te.basquetbolistas.servicios;

import mx.unam.aragon.ico.te.basquetbolistas.modelos.Basquetbolista;
import mx.unam.aragon.ico.te.basquetbolistas.repositorios.BasquetbolistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BasquetbolistaServiceImpl implements BasquetbolistaService {

    @Autowired
    private BasquetbolistaRepository basquetbolistaRepository;

    @Override
    public List<Basquetbolista> listarTodos() {
        return basquetbolistaRepository.findAll();
    }

    @Override
    public Basquetbolista obtenerPorId(Integer id) {
        return basquetbolistaRepository.findById(id).orElse(null);
    }

    @Override
    public Basquetbolista guardar(Basquetbolista basquetbolista) {
        return basquetbolistaRepository.save(basquetbolista);
    }

    @Override
    public void eliminar(Integer id) {
        basquetbolistaRepository.deleteById(id);
    }
}