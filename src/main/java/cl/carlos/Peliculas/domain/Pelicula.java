
package cl.carlos.Peliculas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Integer ano;
    private String descripcion;
    @Column(name="imagen")
    private String imagenUrl;
    @ManyToOne
    private director director;

    public Pelicula() {
    }

    public Pelicula(Integer id, String nombre, Integer ano, String descripcion, String imagenUrl, director director) {
        this.id = id;
        this.nombre = nombre;
        this.ano = ano;
        this.descripcion = descripcion;
        this.imagenUrl = imagenUrl;
        this.director = director;
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

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public director getDirector() {
        return director;
    }

    public void setDirector(director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", nombre=" + nombre + ", ano=" + ano + ", descripcion=" + descripcion + ", imagenUrl=" + imagenUrl + ", director=" + director.getId() + '}';
    }

 
    
    
    


}