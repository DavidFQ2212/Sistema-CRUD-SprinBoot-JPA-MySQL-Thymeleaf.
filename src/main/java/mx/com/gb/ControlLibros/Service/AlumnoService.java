/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gb.ControlLibros.Service;

import java.util.List;

import mx.com.gb.ControlLibros.Dominio.Alumno;

/**
 *
 * @author david
 */
public interface AlumnoService {
    public List<Alumno> listarPersonas();

    public void guardar(Alumno alumno);

    public void eliminar(Alumno alumno);

    public Alumno encontrarPersona(Alumno alumno);
}
