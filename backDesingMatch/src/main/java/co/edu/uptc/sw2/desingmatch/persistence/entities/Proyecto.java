package co.edu.uptc.sw2.desingmatch.persistence.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String descripcion;
    private double valor;
    @OneToMany
    private List<Disenio> disenios;

    public int getIdProyecto() {
        return id;
    }

    public void setIdProyecto(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDisenios(List<Disenio> disenios) {
        this.disenios = disenios;
    }

    public List<Disenio> getDisenios() {
        return disenios;
    }
}
