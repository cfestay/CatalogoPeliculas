
package cl.carlos.Peliculas.controller;

import cl.carlos.Peliculas.domain.Pelicula;
import cl.carlos.Peliculas.servicio.PeliculaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListadoControlador {
    

    @Autowired
    PeliculaServicio ps;
    
    @RequestMapping("/")
    public String listarPeliculas(Model model){
        List<Pelicula>destacados=ps.buscarDestacados();
        model.addAttribute("listado", destacados);        
        return "lista";
    }
    @RequestMapping("/director")
    public String listaDirector(int directorId, Model model){
        List<Pelicula> director= ps.buscarPorDirector(directorId);
        model.addAttribute("listado", director);
          return"lista";
    }
    
    @RequestMapping("/buscar")
    public String buscar(@RequestParam("q")String nombre, Model model){
        List<Pelicula>busqueda=ps.buscarPorNombre(nombre);
        model.addAttribute("listado", busqueda);
        return "lista";
    }
            
    
  
    
}
