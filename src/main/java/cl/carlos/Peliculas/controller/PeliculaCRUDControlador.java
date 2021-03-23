package cl.carlos.Peliculas.controller;

import cl.carlos.Peliculas.domain.Pelicula;
import cl.carlos.Peliculas.servicio.DirectorServicio;
import cl.carlos.Peliculas.servicio.PeliculaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PeliculaCRUDControlador {

    private final PeliculaServicio PS;
    private final DirectorServicio DS;

    public PeliculaCRUDControlador(PeliculaServicio PS, DirectorServicio DS) {
        this.PS = PS;
        this.DS = DS;
    }   
    

    @RequestMapping("/pelicula/crear")
    public String crearPelicula(Model model) {
        model.addAttribute("directores", DS.buscarDirectores());
        model.addAttribute("peli", new Pelicula());
        return "formPelicula";
    }

    @PostMapping("/pelicula/guardar")
    public String guardar(Pelicula peli) {
        PS.guardar(peli);
        return "redirect:/";

    }

}
