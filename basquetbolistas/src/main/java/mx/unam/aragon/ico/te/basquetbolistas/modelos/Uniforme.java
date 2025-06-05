package mx.unam.aragon.ico.te.basquetbolistas.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Uniforme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numero;
    private String tallaCamiseta;
    private String tallaShort;
    private String colorPrimario;
    private String colorSecundario;
    private String descripcion;
    private String nombreEquipo;
    private String nombreJugador;
    private String marcaCalzado;
    private String colorCalzado;
    private String imagen;

    public Uniforme() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
//Getter and setter
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTallaCamiseta() {
        return tallaCamiseta;
    }

    public void setTallaCamiseta(String tallaCamiseta) {
        this.tallaCamiseta = tallaCamiseta;
    }

    public String getTallaShort() {
        return tallaShort;
    }

    public void setTallaShort(String tallaShort) {
        this.tallaShort = tallaShort;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getMarcaCalzado() {
        return marcaCalzado;
    }

    public void setMarcaCalzado(String marcaCalzado) {
        this.marcaCalzado = marcaCalzado;
    }

    public String getColorCalzado() {
        return colorCalzado;
    }

    public void setColorCalzado(String colorCalzado) {
        this.colorCalzado = colorCalzado;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
