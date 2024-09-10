package pe.edu.upeu.parcial.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.parcial.entity.Empleado;


public interface EmpleadoDao {
	Empleado create(Empleado c);
	Empleado update(Empleado c);
	void delete(Long id);
	Optional<Empleado> read(Long id);
	List<Empleado> readAll();
}
