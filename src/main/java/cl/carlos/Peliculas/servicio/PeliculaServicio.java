package cl.carlos.Peliculas.servicio;

import cl.carlos.Peliculas.domain.Pelicula;
import cl.carlos.Peliculas.repositorio.IPeliculaRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServicio {
    @Autowired
    IPeliculaRepositorio IPR;
    

    public List<Pelicula> buscarDestacados() {
        return IPR.buscarTodos();
    }
    
    public List<Pelicula>buscarPorDirector(int directorId){
       return IPR.buscarPorDirector(directorId);
    }
    
    public List<Pelicula>buscarPorNombre(String nombre){
        return IPR.findByNombreContaining(nombre);
    }
    public Pelicula guardar(Pelicula peli){
        return IPR.save(peli);
    }
    
}
