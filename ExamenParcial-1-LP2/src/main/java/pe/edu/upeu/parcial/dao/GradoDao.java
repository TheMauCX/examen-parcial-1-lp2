package pe.edu.upeu.parcial.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.parcial.entity.Grado;


public interface GradoDao {
	Grado create(Grado c);
	Grado update(Grado c);
	void delete(Long id);
	Optional<Grado> read(Long id);
	List<Grado> readAll();
}
