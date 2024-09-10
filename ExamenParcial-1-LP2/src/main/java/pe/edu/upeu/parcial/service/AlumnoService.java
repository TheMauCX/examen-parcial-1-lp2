package pe.edu.upeu.parcial.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.parcial.entity.Alumno;


public interface AlumnoService {
	Alumno create(Alumno c);
	Alumno update(Alumno c);
	void delete(Long id);
	Optional<Alumno> read(Long id);
	List<Alumno> readAll();
}
