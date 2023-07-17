package mx.com.gb.ControlLibros.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import mx.com.gb.ControlLibros.Dao.AlumnoDao;
import mx.com.gb.ControlLibros.Dominio.Alumno;

@Service
public class ServiceImplementacion implements AlumnoService {
    @Autowired
    private AlumnoDao alumnoDao;

    @Override
    @Transactional()
    public List<Alumno> listarPersonas() {
        return (List<Alumno>) alumnoDao.findAll();

    }

    @Override
    @Transactional
    public void guardar(Alumno alumno) {
        alumnoDao.save(alumno);
    }

    @Override
    public void eliminar(Alumno alumno) {
        alumnoDao.delete(alumno);

    }

    @Override
    @Transactional(readOnly = true)
    public Alumno encontrarPersona(Alumno alumno) {
        return alumnoDao.findById(alumno.getId_alumno()).orElse(null);

    }
}
