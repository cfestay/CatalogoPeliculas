

package cl.carlos.Peliculas.repositorio;

import cl.carlos.Peliculas.domain.Pelicula;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IPeliculaRepositorio extends JpaRepository<Pelicula, Integer>{
    
    
    @Query("from Pelicula p order by p.ano desc")
    List<Pelicula>buscarTodos();
    
    @Query("from Pelicula p where p.director.id=?1 order by p.ano desc")
    List<Pelicula>buscarPorDirector(int directorId);
    
    List<Pelicula>findByNombreContaining(String nombre);
    
    
    
    
    
}
