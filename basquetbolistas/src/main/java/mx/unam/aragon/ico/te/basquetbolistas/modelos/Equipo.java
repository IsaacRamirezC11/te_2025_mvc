package mx.unam.aragon.ico.te.basquetbolistas.modelos;

import jakarta.persistence.*;

@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ciudad;
    private String conferencia;
    private int fundado;
    private String imagen; // URL de imagen

    public Equipo() {}

    public Equipo(String nombre, String ciudad, String conferencia, int fundado, String imagen) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.conferencia = conferencia;
        this.fundado = fundado;
        this.imagen = imagen;
    }

    // Getters y setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getConferencia() { return conferencia; }
    public void setConferencia(String conferencia) { this.conferencia = conferencia; }

    public int getFundado() { return fundado; }
    public void setFundado(int fundado) { this.fundado = fundado; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
}

