package mx.unam.aragon.ico.te.basquetbolistas.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity

public class Basquetbolista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Integer id;
    private String nombre;
    private Integer dorsal;
    private String equipo;
    private String descripcion;
    private String imagen;

    public Basquetbolista() {
    }

    public Basquetbolista(String nombre, Integer dorsal, String equipo, String descripcion, String imagen) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.equipo = equipo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Basquetbolista that = (Basquetbolista) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(dorsal, that.dorsal) && Objects.equals(equipo, that.equipo) && Objects.equals(descripcion, that.descripcion) && Objects.equals(imagen, that.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dorsal, equipo, descripcion, imagen);
    }

    @Override
    public String toString() {
        return "Basquetbolista{" +
                "nombre='" + nombre + '\'' +
                ", dorsal=" + dorsal +
                ", equipo='" + equipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}


