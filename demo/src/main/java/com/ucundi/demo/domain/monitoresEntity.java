package com.ucundi.demo.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity 
public class monitoresEntity {

    public monitoresEntity(){
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof monitoresEntity that)) return false;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String resolucion;  
    private Integer precio; 
    private String marca;

    //setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //getter

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResolucion() {
        return resolucion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    //toString

    @Override
        public String toString() {
            return "monitoresEntity [id=" + id + ", nombre=" + nombre + ", resolucion=" + resolucion + ", precio=" + precio
                    + ", marca=" + marca + "]";
        } 

    //Constructors

    public monitoresEntity(String nombre, String resolucion, Integer precio, String marca) {
        this.nombre = nombre;
        this.resolucion = resolucion;
        this.precio = precio;
        this.marca = marca;
    }
    
}
