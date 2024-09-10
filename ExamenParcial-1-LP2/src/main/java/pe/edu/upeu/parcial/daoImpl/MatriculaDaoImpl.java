package pe.edu.upeu.parcial.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import pe.edu.upeu.parcial.dao.MatriculaDao;
import pe.edu.upeu.parcial.entity.Matricula;
import pe.edu.upeu.parcial.repository.MatriculaRepository;

@Component
public class MatriculaDaoImpl implements MatriculaDao{

	@Autowired
	private MatriculaRepository repository;

	
	@Override
	public Matricula create(Matricula a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Matricula update(Matricula a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
