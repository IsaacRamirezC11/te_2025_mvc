package mx.unam.aragon.ico.te.basquetbolistas.servicios;


import mx.unam.aragon.ico.te.basquetbolistas.modelos.Basquetbolista;
import mx.unam.aragon.ico.te.basquetbolistas.repositorios.BasquetbolistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasquetbolistaService {
    @Autowired
    private BasquetbolistaRepository basquetbolistaRepository;

    public boolean guardarBaquetbolista(Basquetbolista basquetbolista){
        Basquetbolista resultado = basquetbolistaRepository.save(basquetbolista);
        return resultado != null;
    }

    public Basquetbolista getBasquetbolista(Integer id){
        return basquetbolistaRepository.getById(id);
    }

}
