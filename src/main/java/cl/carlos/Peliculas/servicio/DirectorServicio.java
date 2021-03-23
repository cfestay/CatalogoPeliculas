package cl.carlos.Peliculas.servicio;

import cl.carlos.Peliculas.domain.director;
import cl.carlos.Peliculas.repositorio.DirectorRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorServicio {
    @Autowired
    DirectorRepositorio IDR;
    
    public List<director>buscarDirectores(){
        return IDR.findAll();    
    }
    
}
