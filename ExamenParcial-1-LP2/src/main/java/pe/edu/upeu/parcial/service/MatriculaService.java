package pe.edu.upeu.parcial.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.parcial.entity.Matricula;


public interface MatriculaService {
	Matricula create(Matricula c);
	Matricula update(Matricula c);
	void delete(Long id);
	Optional<Matricula> read(Long id);
	List<Matricula> readAll();
}
