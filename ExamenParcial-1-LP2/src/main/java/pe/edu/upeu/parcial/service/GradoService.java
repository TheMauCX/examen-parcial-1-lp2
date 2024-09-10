package pe.edu.upeu.parcial.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.parcial.entity.Grado;


public interface GradoService {
	Grado create(Grado c);
	Grado update(Grado c);
	void delete(Long id);
	Optional<Grado> read(Long id);
	List<Grado> readAll();
}
