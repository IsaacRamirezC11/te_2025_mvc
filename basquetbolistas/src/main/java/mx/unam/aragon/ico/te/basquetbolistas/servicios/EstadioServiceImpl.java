package mx.unam.aragon.ico.te.basquetbolistas.servicios;

import mx.unam.aragon.ico.te.basquetbolistas.modelos.Estadio;
import mx.unam.aragon.ico.te.basquetbolistas.repositorios.EstadioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadioServiceImpl implements EstadioService {

    @Autowired
    private EstadioRepository estadioRepository;

    @Override
    public List<Estadio> listarTodos() {
        return estadioRepository.findAll();
    }

    @Override
    public Estadio obtenerPorId(Long id) {
        return estadioRepository.findById(id).orElse(null);
    }

    @Override
    public Estadio guardar(Estadio estadio) {
        return estadioRepository.save(estadio);
    }

    @Override
    public void eliminar(Long id) {
        estadioRepository.deleteById(id);
    }
}
