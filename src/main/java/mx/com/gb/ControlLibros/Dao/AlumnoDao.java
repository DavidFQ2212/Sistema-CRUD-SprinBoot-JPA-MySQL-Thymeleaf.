/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gb.ControlLibros.Dao;

import mx.com.gb.ControlLibros.Dominio.Alumno;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author david
 */
public interface AlumnoDao extends CrudRepository<Alumno, Long> {

}
