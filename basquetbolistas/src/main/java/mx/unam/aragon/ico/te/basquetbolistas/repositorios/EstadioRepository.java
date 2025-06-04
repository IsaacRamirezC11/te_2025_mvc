package mx.unam.aragon.ico.te.basquetbolistas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.unam.aragon.ico.te.basquetbolistas.modelos.Estadio;

public interface EstadioRepository extends JpaRepository<Estadio, Long> {
}
