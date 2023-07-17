package mx.com.gb.ControlLibros.controller;

import mx.com.gb.ControlLibros.Dominio.Alumno;
import mx.com.gb.ControlLibros.Service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {

    @Autowired
    private AlumnoService alumnoS;

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    @GetMapping("/adm")
    public String admin(Model model, Alumno alumno) {
        var alumnos = alumnoS.listarPersonas();
        model.addAttribute("alumnos", alumnos);
        return "datos";
    }

    @PostMapping("/guardar")
    public String guardar(Alumno alumno, Model model) {
        alumnoS.guardar(alumno);
        return "redirect:/adm";
    }

    @GetMapping("/editar/{id_alumno}")
    public String editar(Alumno alumno, Model model) {
        alumno = alumnoS.encontrarPersona(alumno);
        model.addAttribute("alumno", alumno);
        return "datos";
    }

    @GetMapping("/eliminar/{id_alumno}")
    public String elimina(Alumno alumno) {
        alumnoS.eliminar(alumno);
        return "redirect:/adm";

    }
}
