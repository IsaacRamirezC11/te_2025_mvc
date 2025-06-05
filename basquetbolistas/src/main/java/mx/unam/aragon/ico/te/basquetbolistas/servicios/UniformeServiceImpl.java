package mx.unam.aragon.ico.te.basquetbolistas.servicios;

import mx.unam.aragon.ico.te.basquetbolistas.modelos.Uniforme;
import mx.unam.aragon.ico.te.basquetbolistas.repositorios.UniformeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniformeServiceImpl implements UniformeService{
    @Autowired
    private UniformeRepository uniformeRepository;

    @Override
    public List<Uniforme> listarTodos() {
        return uniformeRepository.findAll();
    }

    @Override
    public Uniforme guardar(Uniforme uniforme) {
        return uniformeRepository.save(uniforme);
    }

    @Override
    public Uniforme obtenerPorId(Long id) {
        return uniformeRepository.findById(id).orElse(null);
    }
    @Override
    public void eliminar(Long id) {
        uniformeRepository.deleteById(id);
    }
}
