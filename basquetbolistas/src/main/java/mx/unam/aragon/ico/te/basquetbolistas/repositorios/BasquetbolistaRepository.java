package mx.unam.aragon.ico.te.basquetbolistas.repositorios;

import mx.unam.aragon.ico.te.basquetbolistas.modelos.Basquetbolista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasquetbolistaRepository extends JpaRepository<Basquetbolista, Integer> {
}